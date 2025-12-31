class Node(var data: Int) {
    var next: Node? = null
}

fun nthFromEnd(head: Node?, n: Int): Int? {
    if (head == null || n <= 0) return null

    var slow: Node? = head
    var fast: Node? = head

    // Move fast pointer n steps ahead
    repeat(n) {
        if (fast == null) return null
        fast = fast?.next
    }

    // Move both pointers until fast reaches the end
    while (fast != null) {
        slow = slow?.next
        fast = fast?.next
    }

    return slow?.data
}
