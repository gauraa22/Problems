package com.company;

public class Solution2
{
    int[] A;
    public Solution2(int[] A)
    {
        this.A=A;
    }
    public static void minMax(int[] a)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }

            if(a[i] < min)
            {
                min = a[i];
            }
        }
        System.out.println("max :"+ max);
        System.out.println("min :"+min);
    }
}
