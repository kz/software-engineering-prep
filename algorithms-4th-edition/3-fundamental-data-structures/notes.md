# 3. Fundamental Data Structures

## 3.1. Using Arrays

Useful `java.util.Arrays` methods:

- `equals(A, B)`
- `fill(A, x)`
- `copyOf(A, n)`
- `copyOfRange(A, s, t)`
- `toString(A)`
- `sort(A)`
- `binarySearch(A, x)`

Useful `java.util.Random` methods:

- `nextBoolean()`
- `nextDouble()`
- `nextInt()`
- `nextInt(n)` (from 0 to `n - 1` inclusive)
- `setSeed(s)` (`s` is a long; could use `System.currentTimeMillis()`)

## 3.2. Singly Linked Lists

Main things to remember for implementation:

- Contains a nested **static** node class of generic type `<E>`
  - Contains element, node and constructor (don't forget types)
  - Contains methods to get element and get/set next pointer
- Contains head, tail pointers
- Optionally contains `size` member variable and accessor, along with `isEmpty()` helper method
- Contains accessors for first and last elements
- Contains update methods for first, last (**check if empty**)