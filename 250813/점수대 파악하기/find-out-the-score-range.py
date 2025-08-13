score_li = list(map(int, input().split()))

count_li = [0]*11

for score in score_li:
    if score >= 10:
        count_li[score//10] += 1

for i in range(len(count_li)-1, 0, -1):
    print(f"{i*10} - {count_li[i]}")