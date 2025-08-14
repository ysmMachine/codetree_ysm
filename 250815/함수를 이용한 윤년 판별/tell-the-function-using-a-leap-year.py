y = int(input())

# Please write your code here.
def is_year(year):
    if year % 100 == 0 and year % 400 != 0:
        return False
    elif year % 4 == 0:
        return True
    else:
        return False


ans = "true" if is_year(y) else "false"
print(ans)