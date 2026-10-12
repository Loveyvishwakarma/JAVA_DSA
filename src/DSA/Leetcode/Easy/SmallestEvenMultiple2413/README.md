# Smallest Even Multiple

## Problem Description

Given a positive integer `n`, find the smallest positive integer divisible by both `n` and `2`. In other words, find the smallest even multiple of `n`.

## Examples

### Example 1

**Input:** `n = 5`

**Output:** `10`

**Explanation:** The multiples of `5` are `5, 10, 15, 20, ...`. The smallest even multiple is `10`.

### Example 2

**Input:** `n = 6`

**Output:** `6`

**Explanation:** `6` is already even, so the smallest even multiple is `6` itself.

## Approach

1. Check whether `n` is divisible by `2` using `n % 2 == 0`.
2. If `n` is even, the answer is `n`.
3. Otherwise, `n` is odd, so the answer is `n * 2`.

No loop is needed because one condition is enough to determine the result.

## Complexity Analysis

- **Time Complexity:** `O(1)` — only one condition is checked.
- **Space Complexity:** `O(1)` — no extra data structures are used.
