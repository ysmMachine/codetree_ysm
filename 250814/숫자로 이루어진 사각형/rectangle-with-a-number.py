n = int(input())

# Please write your code here.
def print_square(n):
    num = 1
    for i in range(n):
        for j in range(n):
            val = num % 9 if num > 9 else num
            print(val, end=" ")
            num += 1
        print()

print_square(n)