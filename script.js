// --- 1. DYNAMIC CLOCK LOGIC ---
function updateTime() {
  const now = new Date();
  const timeString = now.toLocaleTimeString([], { hour: '2-digit', minute: '2-digit', second: '2-digit' });
  const timeElement = document.getElementById('timeElement');
  if (timeElement) {
    timeElement.innerText = timeString;
  }
}
updateTime();
setInterval(updateTime, 1000);


// --- 2. OPEN & CLOSE WINDOW LOGIC ---
const welcomeWindow = document.getElementById("welcomeWindow");
const closeBtn = document.getElementById("closeBtn");
const openBtn = document.getElementById("openBtn");

// Close function
closeBtn.addEventListener("click", function() {
  welcomeWindow.style.display = "none";
});

// Open function
openBtn.addEventListener("click", function() {
  welcomeWindow.style.display = "flex";
});


// --- 3. W3SCHOOLS DRAG LOGIC (Adjusted for our setup) ---
dragElement(welcomeWindow);

function dragElement(element) {
  var initialX = 0, initialY = 0, currentX = 0, currentY = 0;
  
  const header = document.getElementById(element.id + "Header");
  if (header) {
    // Drag from the header handle only
    header.onmousedown = startDragging;
  } else {
    // Fallback to dragging from anywhere on the window
    element.onmousedown = startDragging;
  }

  function startDragging(e) {
    e = e || window.event;
    // Don't trigger drag if clicking the close button inside the header!
    if (e.target.id === "closeBtn") return;

    e.preventDefault();
    initialX = e.clientX;
    initialY = e.clientY;
    document.onmouseup = stopDragging;
    document.onmousemove = moveElement;
  }

  function moveElement(e) {
    e = e || window.event;
    e.preventDefault();
    currentX = initialX - e.clientX;
    currentY = initialY - e.clientY;
    initialX = e.clientX;
    initialY = e.clientY;
    
    element.style.top = (element.offsetTop - currentY) + "px";
    element.style.left = (element.offsetLeft - currentX) + "px";
  }

  function stopDragging() {
    document.onmouseup = null;
    document.onmousemove = null;
  }
}