x = int(input())
m = int(input())
try:
    inverse = pow(x, -1, m)
    print(inverse)
except ValueError:
    print('No such integer exists.')