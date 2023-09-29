/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci.task;

/**
 *
 * @author hassn
 */
public class FibonacciTask {

    public static void main(String[] args) {
        int no =10;
        System.out.println("total no is " + no);
        for (int i=0; i<no; i++)
        {
             System.out.println(fib(i));
        } 
    }
    public static int fib(int n)
    {
    if(n<=1)
    {
        return n ;
    }
    else 
    {
        return fib(n-1)+fib(n-2);
    }
    }
    
}
