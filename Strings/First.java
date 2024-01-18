
package Strings;

import java.util.*;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        // String a = sc.nextLine();
        // String name = "sonik mehar";
        // String collegeName = "SIRT";
        // String address = "Bhopal";
 
        // System.out.println("Your name is :"+a);
        // System.out.println();
        // System.out.println(name+collegeName+address);
        // System.out.println();



        //Concatenation
        // String fristName = "Sonik";
        // String lastName = "Mehar";
        // String fullName = fristName+" "+lastName;
        // System.out.println(fullName.length());

        // for(int i = 0; i<fullName.length();i++){
        //     System.out.println(fullName.charAt(i));
        // }


        // String name1 = "ihnik";
        // String name2 = "mehar";
        // System.out.println(name1.compareTo(name2));
        // if(name1.compareTo(name2)==0)
        // {
        //     System.out.println("equal");
        // }
        // else{
        //     System.out.println("not equal");
        // }


        String name = "I am is sonik";
        String kk = name.substring(8,13);
        System.out.println(kk);


    }
}
