n = int(input())

cnt = 0
multiplier = 1

while cnt != 2:
    val = n * multiplier
    print(val, end=" ")
    multiplier += 1
    
    if val % 5 == 0:
        cnt += 1