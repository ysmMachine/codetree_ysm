n = int(input())

isFlag = True

for i in range(2, (n//2)+1):
    if n % i == 0: 
        isFlag = False

if isFlag:
    print("P")
else:
    print("C")