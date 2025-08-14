n, m = map(int, input().split())

# Please write your code here.
def get_gcd(n, m):
    while m % n != 0:
        temp = m % n
        m = n
        n = temp
    print(n)

get_gcd(n, m)
