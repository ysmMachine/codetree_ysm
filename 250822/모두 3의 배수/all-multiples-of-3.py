li = []

for i in range(5):
    num = int(input())
    li.append(num)

isFlag = True

for i in li:
    if i % 3 != 0:
        isFlag = False

if isFlag:
    print(1)
else:
    print(0)