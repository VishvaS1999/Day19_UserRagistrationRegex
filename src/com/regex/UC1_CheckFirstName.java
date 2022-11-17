package com.regex;
import java.util.*;
import java.util.regex.Pattern;

public class UC1_CheckFirstName
{
    Scanner sc = new Scanner(System.in);

    public void checkFirstName()
    {
        System.out.println("Enter first name start with Capital letter :");
        String firstName = sc.nextLine();

        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName))
        {
            System.out.println("first name is registered successfully");
        }
        else
        {
            System.out.println("first name pattern is not matched");
        }
    }

    public static void main(String[] args)
    {
        UC1_CheckFirstName fn=new UC1_CheckFirstName();
        fn.checkFirstName();
    }
}
