package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            int vow = 0,wor=1;
            System.out.println("Enter a sentence :");
            Scanner sc = new Scanner(System.in);
            String sen = sc.nextLine();

            for (int i=0 ; i<sen.length(); i++){
                char ch = sen.charAt(i);
                if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                    vow ++;
                }
                else if(ch==' '){
                    wor++;
                }
            }
            System.out.println("Number of vowels: "+vow);
            System.out.println("Number of Words: "+wor);


        }
	// write your code here
    }


