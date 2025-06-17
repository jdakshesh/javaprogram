# 🧼 Bubble Sort Explained

**Bubble Sort** is a simple sorting algorithm used to sort a list by repeatedly comparing and swapping adjacent elements if they are in the wrong order.

---

## 🔄 How It Works

1. Start at the beginning of the list.
2. Compare each pair of adjacent elements.
3. Swap them if they are in the wrong order.
4. After each pass, the largest unsorted element "bubbles up" to its correct position.
5. Repeat the process until no swaps are needed (i.e., the list is sorted).

---

## 📊 Example (Ascending Order)

Original List:

### Pass 1:
- Compare 5 and 3 → Swap → `[3, 5, 8, 4, 2]`  
- Compare 5 and 8 → OK  
- Compare 8 and 4 → Swap → `[3, 5, 4, 8, 2]`  
- Compare 8 and 2 → Swap → `[3, 5, 4, 2, 8]`

### Pass 2:
- Compare 3 and 5 → OK  
- Compare 5 and 4 → Swap → `[3, 4, 5, 2, 8]`  
- Compare 5 and 2 → Swap → `[3, 4, 2, 5, 8]`  
- Compare 5 and 8 → OK

Continue until fully sorted:

---

## 🧠 Time & Space Complexity

| Case        | Time Complexity |
|-------------|-----------------|
| Best (sorted list) | O(n)          |
| Average     | O(n²)         |
| Worst       | O(n²)         |

- **Space Complexity**: O(1) → In-place sorting
- Not efficient for large datasets
- Great for educational purposes and small lists

---

Summary
Bubble Sort is easy to understand and implement.

Performs poorly on large datasets due to O(n²) time complexity.

Can be optimized with an early exit if no swaps are made during a pass.

# 🧼 Bubble Sort with Flowchart

Bubble Sort is a simple sorting algorithm that repeatedly compares and swaps adjacent elements if they are in the wrong order.

---

## 🔄 Algorithm Steps

```mermaid
flowchart TD
    Start([Start])
    Loop1[Outer Loop i = 0 to n-1]
    Loop2[Inner Loop j = 0 to n-i-1]
    Compare{arr[j] > arr[j+1]?}
    Swap[Swap arr[j] & arr[j+1]]
    NoSwap[No Swap Needed]
    CheckSwap{Was any swap done?}
    Done[Sorted! Stop]
    Continue[Continue outer loop]

    Start --> Loop1 --> Loop2 --> Compare
    Compare -- Yes --> Swap --> Loop2
    Compare -- No --> NoSwap --> Loop2
    Loop2 --> CheckSwap
    CheckSwap -- No --> Done
    CheckSwap -- Yes --> Continue --> Loop1

