s1 = input()
s2 = input()

sum_val_1 = ''
sum_val_2 = ''

for c in s1: 
    if c.isdigit():
        sum_val_1 += c

for c in s2:
    if c.isdigit():
        sum_val_2 += c

print(int(sum_val_1) + int(sum_val_2))