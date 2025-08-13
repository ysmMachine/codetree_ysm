h, w = list(map(int, input().split()))

b = (10000 * w) / (h * h)

print(int(b))
if b >= 25:
    print("Obesity")