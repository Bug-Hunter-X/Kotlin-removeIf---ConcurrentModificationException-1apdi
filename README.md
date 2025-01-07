# Kotlin removeIf() ConcurrentModificationException

This repository demonstrates a common error when using the `removeIf()` function in Kotlin.  The `removeIf()` function iterates through a list and removes elements based on a predicate. If you modify the list while iterating, you'll encounter a `ConcurrentModificationException`.

The `bug.kt` file shows the buggy code, and `bugSolution.kt` presents a correct solution.

## How to Reproduce

1. Clone the repository.
2. Compile and run `bug.kt`.
3. Observe the `ConcurrentModificationException`.
4. Run `bugSolution.kt` to see the corrected version.

## Solution

The issue is resolved by creating a copy of the list and iterating over the copy to modify the original list.  Alternatively, use an iterator.