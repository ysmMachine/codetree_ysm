n = int(input())

# Please write your code here.
def is_magic_num(n):
    return n % 2 == 0 and sum(list(str(n))) % 5 == 0

ans = "Yes" if is_magic_num else "No"
print(ans)