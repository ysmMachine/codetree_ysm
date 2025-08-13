dice_li = list(map(int, input().split()))

li = [0] * 6

for dice in dice_li:
    li[dice-1] += 1

for idx, val in enumerate(li):
    print(f"{idx+1} - {val}")
