# java11-category-theory-total-poset-product

For basic info about products in category theory please refer
my other github project: https://github.com/mtumilowicz/java11-category-theory-set-product

# min(a, b) is a product in the total poset category
Total poset - poset that:
* `a <= b <==> a -> b`
* for every a,b: `a -> b` or `b -> a`

We will provide sketch proof of theorem: if `min(a, b)` is in category
then it is product of `a` and `b`
* fst: `min(a, b) <= a ==> min(a, b) -> a`
* snd: `min(a, b) <= b ==> min(a, b) -> b`
* if there is other product `P'`:
    * `P' -> a ==> P' <= a`
    * `P' -> b ==> P' <= b`
    * so `P' <= min(a, b) ==> P' -> min(a, b)`
    * factorization of projections is satisfied as well (exactly
    one arrow between any two objects)

# project description
We provide basic implementation (note that `T extends Comparable`
because every two objects are comparable in total set)

```
class TotalPosetProduct<T extends Comparable<T>> {
    final T min;

    TotalPosetProduct(T left, T right) {
        this.min = Collections.min(List.of(left, right));
    }
}
```

note that we cannot implement projections, but we know that 
they exist (proof above).