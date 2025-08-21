sumVal = 0
cnt = 0

while (True):
    age = int(input())
    if (age - 20 >= 10): 
        break
    else:
        sumVal += age
        cnt += 1

print("%.2f" % (sumVal / cnt))