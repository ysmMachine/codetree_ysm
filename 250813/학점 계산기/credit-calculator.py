N = int(input())
score_li = list(map(float, input().split()))

avg_score = sum(score_li) / len(score_li)

if avg_score >= 4.0:
    grade = "Perfect"
elif avg_score >= 3.0:
    grade = "Good"
else:
    grade = "Poor"

print(round(avg_score, 1))
print(grade)
