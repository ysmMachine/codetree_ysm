n, m = map(int, input().split())

# Please write your code here.
def get_gcd(n, m):
    while True:
        temp = m % n
        if temp == 0: break
        m = n
        n = temp
    return n

def get_lcm(n, m):
    gcd_val = get_gcd(n, m)
    return int((n * m) / gcd_val)

print(get_lcm(n, m))
