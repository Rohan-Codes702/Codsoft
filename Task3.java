package Logicjava.Tasktwo;

import java.util.Scanner;

public class Task3{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Total Number of Subjects: ");
        int sub=sc.nextInt();

        if (sub<=0)
        {
            System.out.println("Invalid Subject...");
        }
        int totalmarks=0;
        for (int i=1; i<=sub; i++)
        {
            System.out.println("Enter the Marks of Subject  "+i+":");
            int marks=sc.nextInt();

            if (marks<0 || marks==0)
            {
                System.out.println("Invalid Marks");
            }
            totalmarks+=marks;
        }

        int avg=totalmarks / sub;

        System.out.println("Average is :"+avg);

        String grade;

        if(avg>=90)
        {
            grade="A+";
        }
        else if(avg>=80)
        {
            grade="A";
        }
        else if(avg>=70)
        {
            grade="B";
        }
        else if(avg>=60)
        {
            grade="C";
        }
        else if(avg>=50)
        {
            grade="D";
        }
        else
        {
            grade="Fail...";
        }

        System.out.println("Total Marks: "+totalmarks);
        System.out.println("Average percentage : "+avg);
        System.out.println("Grade :"+grade);
    }
}
