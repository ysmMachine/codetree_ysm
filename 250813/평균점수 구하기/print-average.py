score_li = list(map(float, input().split()))
avg_score = sum(score_li)/len(score_li)

print(round(avg_score, 1))