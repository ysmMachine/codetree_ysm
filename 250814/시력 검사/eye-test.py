a, b = list(map(int, input().split()))

if a >= 1.0 and b >= 1.0: print("High")
elif a >= 0.5 and b >= 0.5: print("Middle")
else: print("Low")