package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=0, b,c=0,d;
        String s;
        System.out.print("Insert a mark: ");
        s=sc.nextLine();

        while(s!=("end")){
            b=Double.parseDouble(s);
            c++;
            a+=b;
            System.out.print("Insert a mark: ");
            s=sc.nextLine();

        }
            if(c!=0){
                d=a/c;
                System.out.print("The average is "+d);
            }
    }
}

