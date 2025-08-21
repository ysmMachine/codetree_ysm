n = int(input())

isFlag = False

for i in range(2, n):
    if n % i == 0:
        isFlag = True

if isFlag:
    print("C")
else:
    print("N")