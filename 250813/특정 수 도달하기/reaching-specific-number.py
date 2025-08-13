li = list(map(int, input().split()))

flag_250 = False

for i in range(10):
    if li[i] >= 250:
        if i > 0:
            total = sum(li[:i])
            print(f"{total} {round(total/i, 1)}")
        else:
            print("0 0")
        flag_250 = True
        break

if not flag_250:
    total = sum(li)
    print(f"{total} {round(total/len(li), 1)}")
