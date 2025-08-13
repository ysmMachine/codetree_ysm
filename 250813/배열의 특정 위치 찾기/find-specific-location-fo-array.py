li = list(map(int, input().split()))

even_num = [li[i] for i in range(1, len(li), 2)]
multi_by_3 = [li[i] for i in range(2, len(li), 3)]

print(sum(even_num), round(sum(multi_by_3)/len(multi_by_3), 1))