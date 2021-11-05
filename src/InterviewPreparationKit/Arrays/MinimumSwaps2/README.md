# Minimum Swaps 2
You are given an unordered array consisting of consecutive integers `∈` [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. Find the minimum number of swaps required to sort the array in ascending order.
## Example
`arr = [7,1,3,2,4,5,6]`

Perform the following steps:
```html
i   arr                     swap (indices)
0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
5   [1, 2, 3, 4, 5, 6, 7]
```

It took `5` swaps to sort the array.

## Function Description

Complete the function *minimumSwaps* in the editor below.

*minimumSwaps* has the following parameter(s):

- `int arr[n]`: an unordered array of integers

**Returns**
- int: the minimum number of swaps to sort the array


**Input Format**

The first line contains an integer,`n` , the size of `arr`.

The second line contains  space-separated integers `arr[i]`.

**Constraints**

   - `1 ≤ n ≤ 10^5`
   - `1 ≤ arr[i] ≤ n`

### Sample Input 1
```html
4
4 3 1 2
```
### Sample output 1
```html
3
```
### Explanation
Given array `arr: [2,3,4,1,5]` <br>
After swapping `(2,3)` we get `arr: [2,3,1,4,5]`<br>
After swapping `(0,1)` we get `arr: [3,2,1,4,5]`<br>
After swapping `(0,2)` we get `arr: [1,2,3,4,5]`<br>
So, we need a minimum of `3` swaps to sort the array in ascending order.

### Sample Input 2
```html
7
1 3 5 2 4 6 7
```
### Sample output 2
```html
3
```
### Explanation
Given array `arr: [1,3,5,2,4,6,7]`<br>
After swapping `(1,3)` we get `arr: [1,2,5,3,4,6,7]`<br>
After swapping `(2,3)` we get `arr: [1,2,3,5,4,6,7]`<br>
After swapping `(3,4)` we get `arr: [1,2,3,4,5,6,7]`<br>
So, we need a minimum of `3` swaps to sort the array in ascending order.
