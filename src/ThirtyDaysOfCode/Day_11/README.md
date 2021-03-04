# 2D Arrays

Given a `6 x 6` *2D Array*, `A` :
```angular2html
    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0
```

An hourglass `A` in is a subset of values with indices falling in this pattern in`A`'s graphical representation:
```markdown
a b c
  d 
e f g
```
 There are `16` hourglasses in `A`. An *hourglass sum* is the sum of an hourglass' values. 

### Task
Calculate the hourglass sum for every hourglass in `A`, then print the maximum hourglass sum. 

### Example

In the array shown above, the maximum hourglass sum is `7` for the hourglass in the top left corner.

### Input Format

There are `6` lines of input, where each line contains `6` space-separated integers that describe the 2D Array `A`.

**Constraints**

- `-9 ≤ A[i][j] ≤ 9`
- `0 ≤ i,j ≤ 5`

### Output Format
Print the maximum hourglass sum in `A`.
```markdown
Sample Input
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0 

Sample Output
19
```

### Explanation

`arr` contains the following hourglasses:
```markdown
1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0


0 1 0   1 1 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0


1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0


0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0
``` 
The hourglass with the maximum sum (`19`) is:
```markdown
2 4 4
  2
1 2 4
```

