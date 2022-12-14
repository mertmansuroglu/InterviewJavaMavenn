# Algorithm Problems

## 1.Find Pivot Index

Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of
all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This
also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

### Example:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
Example 2:

Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.
Example 3:

Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0

## 2.Find sum of array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

### Example:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
9

## 3.Plus minus problem

Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the
decimal value of each fraction on a new line with places after the decimal.

### Example

arr = [1,1,0,-1,0,-1]
There are 5 elements, two positive, two negative and one zero. Their ratios are , and . Results are printed as:

0.400000
0.400000
0.200000
Function Description

Complete the plusMinus function in the editor below.

plusMinus has the following parameter(s):

int arr[n]: an array of integers
Print
Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line
with digits after the decimal. The function should not return a value.

### Input Format

The first line contains an integer, , the size of the array.
The second line contains space-separated integers that describe .

### Output Format

Print the following lines, each to decimals:

proportion of positive values
proportion of negative values
proportion of zeros
Sample Input

## 4.Diagonal difference matrix

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal = 1+5+9=15 . The right to left diagonal =3+5+9 . Their absolute difference is |15-17|=2 .

### Output Format

Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

### Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15

### Explanation

The primary diagonal is:

11
5
-12
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

4
5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15

## 5.Mini-Max Sum

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the
five integers. Then print the respective minimum and maximum values as a single line of two space-separated long
integers.

### Example

arr= [1,3,5,7,9]

The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9=24 .
The function prints

**16 24**.

### Function Description

Complete the miniMaxSum function in the editor below.

miniMaxSum has the following parameter(s):

arr: an array of integers
Print

Print two space-separated integers on one line: the minimum sum and the maximum sum of of elements.

### Input Format

A single line of five space-separated integers.

Sample Input

**1 2 3 4 5**.

Sample Output

**10 14**

## 6.Birthday cake candles tallest

You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of
their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

### Example

candles=[4,4,1,3]

The maximum height candles are 4 units high. There are 2 of them, so return 2 .

### Function Description

Complete the function birthdayCakeCandles in the editor below.

birthdayCakeCandles has the following parameter(s):

int candles[n]: the candle heights

### Returns

int: the number of candles that are tallest

### Input Format

The first line contains a single integer, , the size of .
The second line contains space-separated integers, where each integer describes the height of .

### Explanation

Candle heights are [3,2,1,3] . The tallest candles are 3 units, and there are 2 of them.