package org.example.day4._4_arrays;

public class ArraysExercises {

    /*
        TODO 15

        firstLast0([0, 1, 2])   -> true
        firstLast0([0, 0, 0, 0] -> true
        firstLast0([5, 66, 0]   -> true
        firstLast0([7, 8])      -> false
        firstLast0([])          -> false
     */
    boolean firstLast0(int[] array) {

        int length = array.length;

        if (length==0) {
            return false;
        }

        if (array[0] == 0 || array[length-1] == 0) {
            return true;
        }

        return false;
    }

    /*
        TODO 16

        Arrays with 3 args only!

        middleInts([5, 26, 19], [1, 34, 22])        -> [26, 34]
        middleInts([11, 99, 5], [100, 20, 14]       -> [99, 20]
        middleInts([7, 7, 7], [44, 17, 56]          -> [7, 17]
     */
    int[] middleInts(int[] a, int[] b) {
        return new int[]{a[1],b[1]};
    }


    /*
       TODO 17

       Write a program that reverses an array of Strings
       reverse({"you", "are", "how", "hello"})  ->  {"hello", "how", "are", "you"}
       reverse({"", null, "me"})                ->  {"me", null, ""}
     */

    String[] reverse(String[] baseArray) {
        int length = baseArray.length;
        String[] reverseStr = new String[length];

        for (int i=0; i<length; i++) {
            reverseStr[length-1-i] = baseArray[i];
        }

        return reverseStr;
    }

    /*

        TODO 18

        sum([3, 4, 8])    -> 15
        sum([12, 80])     -> 92
        sum([3, 3, 5, 5]) -> 16
        sum([4])          -> 4
        sum([])           -> 0
     */
    int sum(int[] nums) {

        int length = nums.length;
        int total = 0;

        for (int i=0; i<length; i++) {
            total += nums[i];
        }

        return total;
    }

    /*
        TODO 19

        Given a non-empty array, return true if there is a place to split the array so that
        the sum of the numbers on one side is equal to the sum of the numbers on the other side

        isBalanced([1, 3, 2, 2])     -> true
        isBalanced([5, 5])           -> true
        isBalanced([8, 0, 2, -2, 8]  -> true
        isBalanced([30])             -> false
        isBalanced([2, 3, 4, 1, 2]]) -> false
     */
    boolean isBalanced(int[] array) {

        int length = array.length;
        int leftTotal = 0;
        int rightTotal = 0;

        if (length==1) {
            return false;
        }

        leftTotal = array[0];

        for (int j=1; j<length; j++) {
            rightTotal += array[j];
        }

        for (int k=1; k<length; k++) {
            if (leftTotal==rightTotal) {
                return true;
            }
            leftTotal += array[k];
            rightTotal -= array[k];
        }




        return false;

    }




    /*
        TODO 20

        Return difference between max value and min value

        diff([10, 5, 8, 1, 4]) -> 9
        diff([5, 4, 6, 7])     -> 3
        diff([6, 6])           -> 0
        diff([-5, 3, 9])       ->14
     */
    int diff(int[] array) {
        int min;
        int max;
        int length = array.length;

        min = array[0];
        max = array[0];

        for (int i=1; i<length;i++) {
            if (min>array[i]) {
                min = array[i];
            }
        }

        for (int i=1; i<length;i++) {
            if (max<array[i]) {
                max = array[i];
            }
        }

        return max-min;
    }

    /*
        TODO 21

        A group is at least two adjacent elements of the same value. Count the number of groups.

        countGroups([1, 2, 2, 3, 4, 4]) -> 2
        countGroups([3, 3, 6, 3, 3])    -> 2
        countGroups([5, 5, 5, 5, 5])    -> 1
        countGroups([])                 -> 0
        countGroups([5, 3, 6, 2, 4])    -> 0
     */
    int countGroups(int[] array) {
        int total = 0 ;
        boolean isRepeat = false;
        int length = array.length;

        for (int i=1; i<length; i++) {
            if (isRepeat && array[i] == array[i-1]) {
                continue;
            } else if (array[i] == array[i-1]) {
                total += 1;
                isRepeat = true;
            } else {
                isRepeat = false;
            }
        }




        return total;
    }

    /*
        TODO 22

        innerInside([5, 6, 7, 4, 3, 3], [6, 4]) -> true
        innerInside([3, 3, 5, 5, 6, 6], [5, 3]) -> true
        innerInside([-1, 2, 3, 2], [3])         -> true
        innerInside([2, 5], [2, 5])             -> true
        innerInside([5, 4, 6, 32, 5], [4, 8])   -> false
        innerInside([], [5])                    -> false
     */
    boolean innerInside(int[] outer, int[] inner) {
        int length_out = outer.length;
        int length_in = inner.length;
        int total = 0;

        for (int i=0; i<length_out; i++) {
            for (int j=0; j<length_in; j++) {
                if (outer[i]==inner[j]) {
                    total += 1;
                }
            }
        }

        if (total>=length_in) {
            return true;
        }

        return false;
    }
}
