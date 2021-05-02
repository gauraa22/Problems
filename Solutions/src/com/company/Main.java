package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array={62,4,6,32,67,90};
        Solution1 sol1= new Solution1(array);
        sol1.reverseArray();
        Solution2 sol2= new Solution2(array);
        sol2.minMax(array);
    }
}
