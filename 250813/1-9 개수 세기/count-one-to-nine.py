n = int(input())
li = list(map(int, input().split()))

cnt_arr = [0]*9
for i in li:
    cnt_arr[i-1] += 1

for i in cnt_arr:
    print(i)
