n1, n2 = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

# Please write your code here.
def is_sub_sequence(big_seq, tiny_seq):
    for i in range(len(big_seq)):
        if big_seq[i] == tiny_seq[0] and tiny_seq == big_seq[i:i+len(tiny_seq)]:
            return True
    return False

ans = "Yes" if is_sub_sequence(a, b) else "No"
print(ans)