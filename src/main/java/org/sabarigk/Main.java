package org.sabarigk;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main Obj=new Main();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the String for Reverse:");
        String strIn=input.next();
        System.out.println("The Reversed String is "+Obj.revString(strIn));
        System.out.print("Enter the Integer for Reverse:");
        int intIn=input.nextInt();
        System.out.println("The Reversed Integer is "+Obj.revInteger(intIn));
    }
    public String revString(String org){
        String revOrg="";
        char temp;
        int len=org.length();
        for(int row=0;row<len;row++){
            temp=org.charAt(row);
            revOrg=temp+revOrg;
        }
        return revOrg;
    }
    public int revInteger(int org){
        int remain,revOrg=0;
        while(org>0){
            remain=org%10;
            revOrg=revOrg*10+remain;
            org=org/10;
        }
        return revOrg;
    }
}