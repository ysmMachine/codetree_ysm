count = [0] * 4

for i in range(3):
    status, temp = input().split()
    temp = int(temp)

    if status == "Y": 
        if temp >= 37:
            count[0] += 1
        else:
            count[2] += 1
    else:
        if temp >= 37:
            count[1] += 1
        else:
            count[3] += 1

for c in count:
    print(c, end=" ")

if count[0] >= 2:
    print("E")