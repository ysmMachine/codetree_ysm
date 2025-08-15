Y, M, D = map(int, input().split())

# Please write your code here.
def is_leap_year(year):
    if year % 4 == 0 and year % 100 == 0:
        if year % 400 == 0:
            return True
        else:
            return False
    elif year % 4 == 0:
        return True
    else:
        return False


def is_date_exsist(y, m, d):
    if m > 12 or d > 31: return False
    
    if is_leap_year(y) and m == 2 and d == 29: 
        return True

    date_li = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

    if date_li[m] >= d:
        return True
    else:
        return False

if is_date_exsist(Y, M, D):
    if M in [12, 1, 2]:
        print("Winter")
    elif M in [3, 4, 5]:
        print("Spring")
    elif M in [6, 7, 8]:
        print("Summer")
    elif M in [9, 10, 11]:
        print("Fall")
else:
    print(-1)
    