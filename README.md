# 📌 Find N-th Element from End of a Linked List (Kotlin)

This Kotlin implementation finds the **n-th element from the end** of a **singly linked list** in a **single pass**, without using counters or retrieving the list size.

---

## 🧠 Approach Used

The solution uses the **two-pointer (runner) technique**:

- A **fast pointer** is moved `n` steps ahead.
- A **slow pointer** starts at the head.
- Both pointers move together until the fast pointer reaches the end.
- The slow pointer then points to the **n-th node from the end**.

---

## 🧩 Code Overview

### Node Class
```kotlin
class Node(var data: Int) {
    var next: Node? = null
}
