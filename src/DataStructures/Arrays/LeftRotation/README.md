<!-- ∈ --> 
# Left Rotation
A left rotation operation on an array of size `n` shifts each of the array's elements `1` unit to the left. Given an integer,`d` , rotate the array that many steps left and return the result.

## Example
`d = 2`

`arr = [1,2,3,4,5]`

After `2` rotation, `arr' = [3,4,5,1,2]`

## Function Description

Complete the function **rotateLeft** in the editor below.

rotateLeft has the following parameter(s):
- int arr[n]: the array to rotate
- int d: the number of rotations

**Returns**
- int[n]: the rotated array

**Input Format**

The first line contains two space-separated integers that denote`n` , the number of integers, and `d`, the number of left rotations to perform.
The second line contains `n` space-separated integers that describe`arr[]`.

**Constraints**

- `1 ≤ n ≤ 10^5`
- `1 ≤ d ≤ n`
- `1 ≤ a[i] ≤ 10^6`

### Sample Input
```html
5 4
1 2 3 4 5
```

### Sample output
```html
5 1 2 3 4
```
### Explanation
When we perform `d=4` left rotations, the array undergoes the following sequence of changes:

`[1,2,3,4,5] -> [2,3,4,5,1] -> [3,4,5,1,2] -> [4,5,1,2,3] -> [5,1,2,3,4]`