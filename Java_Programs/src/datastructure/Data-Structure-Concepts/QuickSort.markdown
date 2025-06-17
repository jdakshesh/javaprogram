# Quick Sort Algorithm Explained in Layman Terms

## Imagine you have a messy stack of playing cards

You want to sort them from smallest to biggest. Here's a simple way to do it — **Quick Sort style:**

---

## Step 1: Pick a Random Card (Pivot)

- This card is called the **pivot**.
- For example, let’s say you randomly pick **7**.

---

## Step 2: Compare Every Card to the Pivot

Make two groups:

- **Left group:** All cards smaller than 7.
- **Right group:** All cards bigger than 7.

**Example:**

Cards: 4, 9, 1, 7, 3, 8, 6, 2
Pivot: 7

Left: 4, 1, 3, 6, 2
Right: 9, 8


---

## Step 3: Repeat for Each Group

Now, take the left group (4, 1, 3, 6, 2).  
Pick a pivot again (say 4), and split it into smaller groups:

**Example:**

Pivot: 4
Left: 1, 3, 2
Right: 6


Keep repeating this process until all groups are sorted.

---

## Step 4: Combine Everything

Once the groups are fully sorted, stack them back together:

**Formula:**

Sorted Left + Pivot + Sorted Right

**Example:**

Sorted Left: 1, 2, 3
Pivot: 4
Sorted Right: 6

Combined: 1, 2, 3, 4, 6

Eventually, after processing all groups, you get the fully sorted list.

---

## Why is it called **Quick Sort**?

- Because it divides the problem into smaller pieces (**divide and conquer**).
- It usually finishes sorting very quickly, especially with large datasets.

---

## Visual Summary

[4, 9, 1, 7, 3, 8, 6, 2]
Pick Pivot → 7

Left: [4, 1, 3, 6, 2]
Right: [9, 8]

Repeat for Left and Right…
Eventually → [1, 2, 3, 4, 6, 7, 8, 9]

