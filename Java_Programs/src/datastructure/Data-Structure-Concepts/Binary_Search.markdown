============================
Binary Search: Detailed Guide
============================

## What is Binary Search?

Binary Search is an efficient algorithm used to find the position of a target element in a sorted array or list. It works by repeatedly dividing the search interval in half.

Requirements:

* The array must be sorted (ascending or descending).
* Works only on indexed collections like arrays or lists.
## Real-Life Analogy:

Imagine you're looking for the word "zebra" in a dictionary. You don't start at page 1; you open to the middle, check the word, and decide whether to look in the first or second half. This is how binary search works.

## How Binary Search Works (Example):

Given a sorted array:
Index:  0  1  2  3  4  5  6
Array: [1, 3, 5, 7, 9, 11, 13]

Target: 9

Step 1:
low = 0
high = 6
mid = (0 + 6) // 2 = 3
array[3] = 7 → 7 < 9 → Search in right half
Update: low = mid + 1 = 4

Step 2:
low = 4
high = 6
mid = (4 + 6) // 2 = 5
array[5] = 11 → 11 > 9 → Search in left half
Update: high = mid - 1 = 4

Step 3:
low = 4
high = 4
mid = (4 + 4) // 2 = 4
array[4] = 9 → Match Found at index 4

## Time Complexity:

Best Case: O(1)
Average/Worst Case: O(log n)

## Why Efficient?

Each step cuts the search space in half.

## Binary Search vs Linear Search:

* Binary Search: O(log n), requires sorted array.
* Linear Search: O(n), works on unsorted arrays too.
  Binary search is much faster for large sorted arrays.
## Visual Simulation:

Step-by-step mid index:

[1, 3, 5, 7, 9, 11, 13]
             ↑         ← Step 1: mid = 3, value = 7

[1, 3, 5, 7, 9, 11, 13]
                   ↑   ← Step 2: mid = 5, value = 11

[1, 3, 5, 7, 9, 11, 13]
               ↑       ← Step 3: mid = 4, value = 9 → FOUND

