M, D = map(int, input().split())

def is_exist(M, D):
    if M < 1 or M > 12 or D < 1:
        return False
    
    days_in_month = [0,
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    ]
    
    return D <= days_in_month[M]

ans = "Yes" if is_exist(M, D) else "No"
print(ans)
