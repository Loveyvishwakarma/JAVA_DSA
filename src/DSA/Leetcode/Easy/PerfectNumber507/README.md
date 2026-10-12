# Perfect Number

## Problem Description

A **perfect number** is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.

## Examples

### Example 1

**Input:** `6`

Proper divisors: `1, 2, 3`

Sum: `1 + 2 + 3 = 6`

**Output:** `It is a perfect number`

### Example 2

**Input:** `12`

Proper divisors: `1, 2, 3, 4, 6`

Sum: `1 + 2 + 3 + 4 + 6 = 16`

**Output:** `It is not a perfect number`

### Example 3

**Input:** `28`

Proper divisors: `1, 2, 4, 7, 14`

Sum: `1 + 2 + 4 + 7 + 14 = 28`

**Output:** `It is a perfect number`

## Approach

1. Read an integer `n`.
2. If `n` is less than or equal to `1`, it is not a perfect number.
3. Initialize a variable `sum` to `0`.
4. Loop through every integer from `1` to `n - 1`.
5. If `n` is divisible by the current integer without a remainder, add it to `sum`.
6. Compare `sum` with `n`.
7. If they are equal, the number is perfect; otherwise, it is not.

## Complexity Analysis

- **Time Complexity:** `O(n)` — in the worst case, the algorithm checks every integer from `1` to `n - 1`.
- **Space Complexity:** `O(1)` — the algorithm uses a fixed amount of extra space.
