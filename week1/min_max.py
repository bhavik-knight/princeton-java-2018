#!/usr/bin/env python3


from itertools import permutations as p


list_l = [1, -1, 0]
per_l = list(p(list_l))

print(per_l)


def f(a, b, c):
    small = min(a, b, c)
    big = max(a, b, c)
    middle = min(max(a, b), max(min(a, b), c))
    return small, middle, big


a = list(f(*e) for e in per_l)
print(a)
