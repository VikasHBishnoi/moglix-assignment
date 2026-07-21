# Moglix Online Shortlisting Assignment

## Solution Approach

This solution combines a **stack** and a **dynamic programming (DP)** array.

* The stack stores indices of unmatched opening parentheses.
* Whenever a matching closing parenthesis is found, the length of the current valid substring is computed.
* `longestEndingAt[i]` stores the length of the longest valid parentheses substring ending exactly at index `i`.
* If a valid substring exists immediately before the current one, both substrings are merged to obtain a longer valid substring.
* The maximum valid substring length encountered during the traversal is returned.

## Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)`

## Running the Project

Run `Main.java` to execute the sample test cases.

---
## Author

**Vikas Bishnoi**

Software Developer | Java Full Stack Developer

* 📧 Email: [vikasbishnoi992858@gmail.com](mailto:vikasbishnoi992858@gmail.com)
* 💻 GitHub: https://github.com/VikasHBishnoi
* 🔗 LinkedIn: https://www.linkedin.com/in/vikas-bishnoi/
* 🧩 LeetCode: https://leetcode.com/Vikas__Bishnoi/
