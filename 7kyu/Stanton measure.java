/*
Description

The Stanton measure of an array is computed as follows: count the number of occurences for value 1 in the array. 
Let this count be n. The Stanton measure is the number of times that n appears in the array.

Write a function which takes an integer array and returns its Stanton measure.

Examples
The Stanton measure of [1, 4, 3, 2, 1, 2, 3, 2] is 3, because 1 occurs 2 times in the array and 2 occurs 3 times.
The Stanton measure of [1, 4, 1, 2, 11, 2, 3, 1] is 1, because 1 occurs 3 times in the array and 3 occurs 1 time.
*/

import java.util.*;

public class Kata {

  public static int stantonMeasure(int[] arr) {
    int n = (int) Arrays.stream(arr).filter(x -> x == 1).count();
    return (int) Arrays.stream(arr).filter(x -> x == n).count();
  }
}
