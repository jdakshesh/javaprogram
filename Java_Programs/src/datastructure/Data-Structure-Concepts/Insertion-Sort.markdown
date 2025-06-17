# 🧮 Insertion Sort Explained (Layman Terms)

## 🧠 Imagine This:
You're sorting a hand of playing cards.

You pick cards **one by one** from the deck and **insert each into its correct position** in your hand, keeping the hand sorted at all times.

That’s **Insertion Sort**.

---

## 🪜 Step-by-Step Process:

1. Start with the second item in the list.
2. Compare it with items before it.
3. Move bigger items one position to the right.
4. Insert the current item into the correct place.
5. Repeat this for every item in the list.

---

## 📦 Example:

Let's sort this list:  
`[5, 2, 8, 1, 3]`

### 🔁 Step 1:
- Start from index 1 → `2`
- Compare with `5` → `2 < 5` → move `5` right
- Insert `2` → `[2, 5, 8, 1, 3]`

### 🔁 Step 2:
- Current: `8` → already greater than `5`, no movement
- List stays: `[2, 5, 8, 1, 3]`

### 🔁 Step 3:
- Current: `1`
- Compare with `8` → move `8`
- Compare with `5` → move `5`
- Compare with `2` → move `2`
- Insert `1` → `[1, 2, 5, 8, 3]`

### 🔁 Step 4:
- Current: `3`
- Compare with `8`, `5` → move both
- Insert `3` → `[1, 2, 3, 5, 8]`

---

## 💡 Summary

- Think of **sorting cards in your hand**.
- You go one by one and **insert** each card in the correct position.
- List becomes sorted gradually from left to right.

---

## 🔧 Bonus: Python Code

```python
def insertion_sort(arr):
    for i in range(1, len(arr)):
        current = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > current:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = current
    return arr

print(insertion_sort([5, 2, 8, 1, 3]))
