
import java.util.Scanner;

public class Assignment2 {
    static Scanner input = new Scanner(System.in);

    public static void ageCheck (String name1, String name2, int age1, int age2) {
        boolean both = false;

        if ((age1 && age2) >= 18) && ((age1 && age2) <= 65)
        System.out.println("Nice");


    }

    public static void main(String[] args) {

        System.out.print("Please enter first person's name: ");
        String name1 = input.nextLine();
        System.out.print("Please enter " + name1 + "'s" + " age: ");
        int age1 = input.nextInt();

        System.out.print("Please enter second person's name: ");
        input.nextLine();
        String name2 = input.nextLine();
        System.out.print("Please enter " + name2 + "'s" + " age: ");
        int age2 = input.nextInt();

        ageCheck(name1, name2, age1, age2);

    }
}
/*
Write a program which inputs two people's names and ages, and then outputs if one or both people are between 18 and 65 years old.

Your program must output the words "neither" and "both" when appropriate, as shown below.


You must use a logical "and" (written in Java as: &&) or "or" (written as: ||).

You must use a boolean variable or return value somewhere in your program.

Beware of the "Scanner Bug" which is described in section 3.10 of your book Links to an external site.. If you input the second name with Scanner object .nextLine(), then you'll probably need to call .nextLine() an extra time by itself to dispose of the newline after the first person's age. That way you can correctly input the second person's name.


Here is some sample output:
Please enter first person's name:
Craig
Please enter Craig's age:
48
Please enter second person's name:
Mark
Please enter Mark's age:
52
Both people are between 18 and 65

 */