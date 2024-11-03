# Valid Parentheses Checker

This repository contains a function that determines if a given string of parentheses is valid. The function checks for proper matching and order of different types of brackets, including round `()`, square `[]`, and curly `{}` brackets.

## Problem Statement

Given a string `s` containing just the characters '(', ')', '{', '}', '[' and ']', the function will return `true` if the input string is valid. An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

## Example 1:

Input: s = "()"

Output: true
## Example 2:

Input: s = "()[]{}"

Output: true

## Example 3:

Input: s = "(]"

Output: false

## Example 4:

Input: s = "([])"

Output: true
  
