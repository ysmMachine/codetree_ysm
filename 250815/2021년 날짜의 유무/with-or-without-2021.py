M, D = map(int, input().split())

# Please write your code here.
def is_exsist(M, D):
    if M % 2 == 1 and D <= 31:
        return True
    elif M % 2 == 0 and M == 2 and D <= 28:
        return True
    elif M % 2 == 0 and D <= 30:
        return True
    else:
        return False

ans = "Yes" if is_exsist(M, D) else "No"
print(ans)

