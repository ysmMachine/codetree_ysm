n = int(input())
li = [1, n]
print(1, n, end=" ")

idx = 2
val = 0
while val <= 100:
    val = li[idx-1] + li[idx-2]
    li.append(val)
    idx += 1
    print(val, end=" ")
