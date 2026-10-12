# Palindrome Number

## Problem Description

Given a 32-bit signed integer `x`, determine whether it is a palindrome.

A **palindrome number** reads the same forward and backward. For example, `121` is a palindrome, while `123` is not. Negative numbers are not palindromes because the minus sign does not appear at the end when reversed.

## Examples

### Example 1

**Input:** `121`

**Output:** `It is a palindrome number`

Explanation: Reversing `121` gives `121`, which is equal to the original number.

### Example 2

**Input:** `-121`

**Output:** `It is not a palindrome number`

Explanation: Negative numbers are not palindromes.

### Example 3

**Input:** `10`

**Output:** `It is not a palindrome number`

Explanation: Reversing `10` gives `01`, which has the numeric value `1`, not `10`.

## Approach

1. Store the original number so it can be compared with the reversed number later.
2. If the number is negative, it is not a palindrome.
3. Use a loop to extract the last digit with the remainder operator (`% 10`).
4. Append each extracted digit to the reversed number by multiplying the current reverse by `10` and adding the digit.
5. Remove the last digit from the working number using integer division (`/ 10`).
6. Compare the reversed number with the original number. If they are equal, the number is a palindrome; otherwise, it is not.

The reversed number is stored in a `long` to avoid overflow while reversing values within the 32-bit signed integer range.

## Complexity Analysis

- **Time Complexity:** `O(log₁₀ |x|)` — each loop iteration processes one digit. This is commonly written as `O(log n)`.
- **Space Complexity:** `O(1)` — only a fixed number of variables are used.
