n = int(input())

pass_cnt = 0
for i in range(n):
    li = list(map(int, input().split()))
    if sum(li)/len(li) >= 60:
        print("pass")
        pass_cnt += 1
    else:
        print("fail")

print(pass_cnt)