li = list(map(int, input().split()))

if li[0] == min(li):
    print(1)
else:
    print(0)

if li[0] == li[1] == li[2]:
    print(1)
else:
    print(0)
