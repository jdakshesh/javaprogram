# 🧮 Selection Sort Explained 

## 🧠 Imagine This:
You have a messy line of kids standing by height, and you want them sorted from **shortest to tallest**.

You decide to **sort them yourself** using this method.

---

## 🪜 Step-by-Step Process:

1. Start from the beginning of the line.
2. Look at everyone from that point to the end and **find the shortest person**.
3. **Swap** the shortest person with the one currently at the front.
4. Move one step forward and repeat the process with the remaining unsorted kids.

Repeat until the whole line is sorted.

---

## 📦 Example:

Let's sort this list of numbers:  
`[5, 2, 8, 1, 3]`

### 🔁 Round 1:
- Look at: `[5, 2, 8, 1, 3]`
- Smallest is `1`
- Swap with `5`
- ➡️ Result: `[1, 2, 8, 5, 3]`

### 🔁 Round 2:
- Look at: `[2, 8, 5, 3]`
- Smallest is `2` (already in place)
- ➡️ Result: `[1, 2, 8, 5, 3]`

### 🔁 Round 3:
- Look at: `[8, 5, 3]`
- Smallest is `3`
- Swap with `8`
- ➡️ Result: `[1, 2, 3, 5, 8]`

...Continue until all items are sorted.

---

## 💡 Summary

- You **select** the smallest item and **place it where it belongs**.
- You do this again and again, one position at a time.
- That's why it's called **Selection Sort**!

---


