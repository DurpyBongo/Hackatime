// --- 1. CLOCK LOGIC ---
function updateTime() {
  const now = new Date();
  const timeString = now.toLocaleTimeString([], { hour: '2-digit', minute: '2-digit', second: '2-digit' });
  const timeElement = document.getElementById('timeElement');
  if (timeElement) timeElement.innerText = timeString;
}
updateTime();
setInterval(updateTime, 1000);

// --- 2. DYNAMIC WALLPAPER CYCLER ---
const wallpapers = [
  "https://images.unsplash.com/photo-1511497584788-876760111969?w=1200", // Sunny Woods
  "https://images.unsplash.com/photo-1448375240586-882707db888b?w=1200", // Deep Misty Pines
  "https://images.unsplash.com/photo-1502082553048-f009c37129b9?w=1200"  // Dappled Leaves
];
let currentWallpaperIndex = 0;

function changeWallpaper() {
  currentWallpaperIndex = (currentWallpaperIndex + 1) % wallpapers.length;
  document.body.style.backgroundImage = `linear-gradient(rgba(46, 74, 63, 0.15), rgba(46, 74, 63, 0.15)), url('${wallpapers[currentWallpaperIndex]}')`;
}

// Automatically change background every 5 minutes (300,000ms)
setInterval(changeWallpaper, 300000);

// Let the user click the top bar badge to change it manually!
const themeBadge = document.getElementById("themeBadge");
if (themeBadge) {
  themeBadge.addEventListener("click", changeWallpaper);
}


// --- 3. WINDOW CONTROLS (DRAGGABLE & TOGGLE-ABLE) ---
let biggestIndex = 10;

function setupWindow(windowId, headerId, closeBtnId, openBtnId) {
  const win = document.getElementById(windowId);
  const header = document.getElementById(headerId);
  const closeBtn = document.getElementById(closeBtnId);
  const openBtn = document.getElementById(openBtnId);

  // Toggle Visibility
  if (closeBtn) closeBtn.onclick = () => win.style.display = "none";
  if (openBtn) openBtn.onclick = () => {
    win.style.display = "flex";
    bringToTop(win);
  };

  // Click brings to top
  win.addEventListener("mousedown", () => bringToTop(win));

  // Dragging Logic
  let initialX = 0, initialY = 0, currentX = 0, currentY = 0;
  if (header) {
    header.onmousedown = (e) => {
      if (e.target.classList.contains("closebutton")) return;
      e.preventDefault();
      initialX = e.clientX;
      initialY = e.clientY;
      document.onmouseup = () => {
        document.onmouseup = null;
        document.onmousemove = null;
      };
      document.onmousemove = (moveEvent) => {
        moveEvent.preventDefault();
        currentX = initialX - moveEvent.clientX;
        currentY = initialY - moveEvent.clientY;
        initialX = moveEvent.clientX;
        initialY = moveEvent.clientY;
        win.style.top = (win.offsetTop - currentY) + "px";
        win.style.left = (win.offsetLeft - currentX) + "px";
      };
    };
  }
}

function bringToTop(element) {
  biggestIndex++;
  element.style.zIndex = biggestIndex;
  document.getElementById("topBar").style.zIndex = biggestIndex + 1;
}

// Bind both windows
setupWindow("welcomeWindow", "welcomeWindowHeader", "closeWelcomeBtn", "openWelcomeBtn");
setupWindow("plannerWindow", "plannerWindowHeader", "closePlannerBtn", "openPlannerBtn");


// --- 4. TO-DO & GENTLE ALERT SYSTEM ---
const taskInput = document.getElementById("taskInput");
const taskDate = document.getElementById("taskDate");
const addTaskBtn = document.getElementById("addTaskBtn");
const taskList = document.getElementById("taskList");

// Load tasks from localStorage
let tasks = JSON.parse(localStorage.getItem("tasks")) || [];

// Request desktop notification permission
if (Notification.permission === "default") {
  Notification.requestPermission();
}

function saveAndRenderTasks() {
  localStorage.setItem("tasks", JSON.stringify(tasks));
  taskList.innerHTML = "";
  
  tasks.forEach((task, index) => {
    const li = document.createElement("li");
    li.className = "task-item";
    
    const formattedDate = task.due ? new Date(task.due).toLocaleString() : "No due date";
    
    li.innerHTML = `
      <div class="task-info">
        <span class="task-title">${task.text}</span>
        <span class="task-due">⏳ Due: ${formattedDate}</span>
      </div>
      <button class="task-delete" onclick="deleteTask(${index})">✕</button>
    `;
    taskList.appendChild(li);
  });
}

window.deleteTask = function(index) {
  tasks.splice(index, 1);
  saveAndRenderTasks();
};

addTaskBtn.onclick = () => {
  const text = taskInput.value.trim();
  const due = taskDate.value;
  
  if (!text) return;
  
  tasks.push({ text, due, notified: false });
  taskInput.value = "";
  taskDate.value = "";
  saveAndRenderTasks();
};

// Check for due tasks every 5 seconds
setInterval(() => {
  const now = new Date().getTime();
  let changed = false;

  tasks.forEach(task => {
    if (task.due && !task.notified) {
      const dueTime = new Date(task.due).getTime();
      if (now >= dueTime) {
        // Play soft chime sound
        const audio = new Audio("https://assets.mixkit.co/active_storage/sfx/1600/1600-84.wav");
        audio.play().catch(e => console.log("Audio needs user interaction first"));
        
        // Trigger OS notification
        if (Notification.permission === "granted") {
          new Notification("🍃 Forest Reminder", {
            body: `Time to: "${task.text}"!`,
            icon: "./BongoCat.jpg"
          });
        } else {
          alert(`🍃 Forest Reminder: ${task.text}`);
        }
        task.notified = true;
        changed = true;
      }
    }
  });

  if (changed) {
    saveAndRenderTasks();
  }
}, 5000);

saveAndRenderTasks();