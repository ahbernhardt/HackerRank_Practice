# Day 2: Operators

## Task

Given the *meal price* (base cost of a meal), *tip percent* (the percentage of the meal price being added as tip), and *tax percent* (the percentage of the meal price being added as tax) for a meal, find and print the meal's *total cost*. Round the result to the nearest integer.

**Example**

`mealcost = 100` <br>
`tippercent = 20`<br>
`taxpercent = 8`<br>
A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value `###` and return from the function.

### Function Description

Complete the *solve* function in the editor below.<br>
*solve* has the following parameters:

- `int meal_cost`: the cost of food before tip and tax.
- `int tip_percent`: the tip percentage int tax_percent: the tax.
- `int tax_percent`: the tax percentage.

Returns The function returns nothing. Print the calculated value, rounded to the nearest integer.

**Note:** Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result.

### Input Format

There are `3` lines of numeric input:<br>
- The first line has a double, `meal_cost` (the cost of the meal before tax and tip). <br>
- The second line has an integer, `tip__percent` (the percentage of `meal_cost` being added as tip).<br>
- The third line has an integer, `tax_percent` (the percentage of `meal_cost` being added as tax).

```angular2html
Sample Input
12.00
20
8

Sample Output
15
```

### Explanation

Given:<br>
`meal_cost = 12`<br>
`tip_percent = 20`<br>
`tax_percent = 8`

Calculation:<br>
`tip = meal_cost (12) => (12/100) x 20 = 2.4`<br>
`tax = meal_cost (12) => (12/100) x 8 = 0.96`<br>
`total_cost = meal_cost + tip +tax = 12 + 2.4 + 0.96 = 15.36`<br>
`round(total_cost) = 15`

We round `total_cost` to the nearest integer and print the result,`15` .
