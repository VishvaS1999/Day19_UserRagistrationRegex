package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UC2_CheckLastName
{
    Scanner sc = new Scanner(System.in);

    public void checkLastName()
    {
        System.out.println("Enter Last name start with Capital letter : ");
        String lastName = sc.nextLine();
        if(Pattern.matches("^[A-Z]{1}[a-z]{2,}",lastName))
        {
            System.out.println("Last name is registered successfully");
        }
        else
        {
            System.out.println("Last name pattern is not matched");
        }
    }
    public static void main(String[] args)
    {
        UC2_CheckLastName ln=new UC2_CheckLastName();
        ln.checkLastName();
    }
}
