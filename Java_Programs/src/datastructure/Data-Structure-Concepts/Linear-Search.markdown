# Linear Search Algorithm Explained

---

## 1. Technical Explanation

### Idea:

Linear Search (also called Sequential Search) is the simplest searching algorithm:

* It starts at the first element.
* Compares each element one by one with the target value.
* If a match is found, it returns the position.
* If it reaches the end and finds nothing, it reports that the value is not present.

---

### Algorithm Steps:

1. Start from the first element.
2. Compare the current element with the target value.
3. If they match, return the index (position).
4. If not, move to the next element.
5. Repeat until you either find the element or reach the end.

---

### Pseudocode:

```python
def linear_search(arr, target):
    for i in range(len(arr)):
        if arr[i] == target:
            return i  # found at index i
    return -1  # not found
```

---

### Time Complexity:

| Case                       | Time |
| -------------------------- | ---- |
| Best (first element found) | O(1) |
| Average                    | O(n) |
| Worst (last or not found)  | O(n) |

### Space Complexity:

* O(1) (no extra memory needed)

---

## 2. Layman Explanation

### Imagine You Are Searching for a Book in a Messy Pile

* You don’t know where your book is.
* You start at the top of the pile.
* You pick up each book one by one.
* You check:

  * Is this the book I want?
  * If yes — you stop.
  * If no — you move to the next book.
* You keep doing this until you find your book or check all the books.

---

### Key Points:

* **Very simple**: just keep looking one by one.
* **Works everywhere**: no need for the data to be sorted.
* **Can be slow if list is big**, because you may have to check every item.

---

### Real World Example

**Looking for your friend in a crowd:**

* You check one face at a time.
* If you find your friend, you stop.
* If not, you keep checking the next person.

---

### When to Use Linear Search?

* When the dataset is small.
* When the data is unsorted.
* When simplicity is more important than speed.
