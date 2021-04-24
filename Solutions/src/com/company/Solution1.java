package com.company;

public class Solution1
{
    int[] A;
    public Solution1(int[] A){
        this.A=A;
    }

    public static void printA(int[] A)
    {
        int n = A.length;
        for (int i = 0; i < n; i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public  void reverseArray()
    {
        int[] a;
        a=this.A;

        int start=-1,end=13;
        printA(a);
        int s=start,t=end;
        if(start<0)
            s=0;
        if(end>a.length-1)
            t=a.length-1;
        while(s<t)
        {
            int temp;
            temp = a[s];//temp==a[1]   temp==a[2]
            a[s] = a[t];//a[1]==a[3]   a[2]==a[2]
            a[t] = temp;//a[3]==a[1]   a[2]==a[2]
            s++;//2  3
            t--;//2  1
        }
        printA(a);
    }

}
