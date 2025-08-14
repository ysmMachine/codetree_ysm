n = int(input())

# Please write your code here.
def is_magic_num(n):
    return n % 2 == 0 and sum([n//10, n%10]) % 5 == 0

ans = "Yes" if is_magic_num(n) else "No"
print(ans)