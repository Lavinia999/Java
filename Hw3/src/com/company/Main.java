package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// ex1
        Scanner scanner=new Scanner(System.in);
        long nr = scanner.nextLong();
        System.out.println(nr);
        //ex2
        int K=14; int N=3;
        System.out.println(K/N);
        //ex3
        int num = 321;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
        //ex4

        //ex5
        int v=100; int t=2; int d=0;
        System.out.println(d = v/t);
        //ex6
        double a = 18.4; double b = -5.0; double c=0;
        System.out.println(c=b-a);
        //ex7
        int p=5;
        boolean m=10>p; boolean s=p>0;
        System.out.println(m&s);
        //ex8
        int one=2; int two=3; int three=2;
        boolean res1=one!=two; boolean res2=two!=three; boolean res3=one!=three;
        System.out.println(res1&res2&res3);
        //ex9
        
    }
}
