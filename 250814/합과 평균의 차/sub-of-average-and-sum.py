li = list(map(int, input().split()))

_sum = sum(li)
_avg = _sum / len(li)
_ans = _sum - _avg

print(_sum)
print(int(_avg))
print(_ans)