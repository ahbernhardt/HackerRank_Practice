# Day 10: Binary Numbers

## Task

Given a base-`10` integer,`n`, convert it to binary (base-`2`). Then find and print the base-`10` integer denoting the maximum number of consecutive `1`'s in `n`'s binary representation. When working with different bases, it is common to show the base as a subscript.

## Example

`n = 125`

The binary representation of **125<sub>10</sub>** is **1111101<sub>2</sub>**. In base `10`, there are `5` and `1` consecutive ones in two groups. Print the maximum,`5` .

### Input Format

A single integer,`n`.

**Constraints**

- `1 ≤ n ≤ 10^6`

### Output Format

Print a single base-`10` integer that denotes the maximum number of consecutive `1`'s in the binary representation of `n`.
```angular2html
Sample Input 0
5

Sample Output 0
1

Sample Input 1
13

Sample Output 1
2
```
### Explanation

Sample Case 0:<br>
The binary representation of **5<sub>10</sub>** is **101<sub>2</sub>**, so the maximum number of consecutive `1`'s is `1`.

Sample Case 1:<br>
The binary representation of **13<sub>10</sub>** is **1101<sub>2</sub>**, so the maximum number of consecutive `1`'s is `2`.
