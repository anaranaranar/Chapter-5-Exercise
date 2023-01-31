import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);

    /*
    valueCalc calculates a value proposition of an eBike based on hardcoded "desirable" characteristics.
    It outputs invididual results for cost, weight, and battery size.
    As well as overall value calculated based on rating of all three inputs.
     */
    public static void valueCalc() {
        Scanner input = new Scanner(System.in);
        final int MAX_PRICE = 3000;
        final int MAX_WEIGHT = 60;
        final int MIN_BATTERY = 400;

        int valueRating = 0;
        System.out.print("How much does it cost?: ");
        int cost = input.nextInt();
        System.out.print("How much does it weigh in pounds?: ");
        int weight = input.nextInt();
        System.out.print("How many watt hours is the battery?: ");
        int battery = input.nextInt();

        if (cost <= MAX_PRICE) {
            valueRating++;
            System.out.println("That's a good price ");
        } else
            System.out.println("It's too expensive");

        if (weight <= MAX_WEIGHT) {
            valueRating++;
            System.out.println("The light weight will give you more mileage");
        } else
            System.out.println("It's too heavy");

        if (battery >= MIN_BATTERY) {
            valueRating++;
            System.out.println("The battery should last you a long time");
        } else
            System.out.println("The battery is too weak");
        System.out.println();
        System.out.println();

        if (valueRating == 3)
            System.out.println("This is a great deal!");
        else if (valueRating == 2 || valueRating == 1)
            System.out.println("It's alright, but maybe shop around a bit more");
        else
            System.out.println("You'll probably be dissapointed if you buy this one");


    }

    public static void main(String[] args) {

        System.out.println("I'm going to help you choose an electric bicycle.");
        System.out.println("Please enter the following for the bike model:");
        valueCalc();


    }
}

/*
****************
SAMPLE OUTPUT #1:
****************
I'm going to help you choose an electric bicycle.
Please enter the following for the bike model:
How much does it cost?: 2500
How much does it weigh in pounds?: 45
How many watt hours is the battery?: 900
That's a good price
The light weight will give you more mileage
The battery should last you a long time


This is a great deal!


****************
SAMPLE OUTPUT #2:
****************
I'm going to help you choose an electric bicycle.
Please enter the following for the bike model:
How much does it cost?: 9500
How much does it weigh in pounds?: 8421
How many watt hours is the battery?: 45
It's too expensive
It's too heavy
The battery is too weak


You'll probably be dissapointed if you buy this one


****************
SAMPLE OUTPUT #3:
****************

I'm going to help you choose an electric bicycle.
Please enter the following for the bike model:
How much does it cost?: 2500
How much does it weigh in pounds?: 84
How many watt hours is the battery?: 540
That's a good price
It's too heavy
The battery should last you a long time


It's alright, but maybe shop around a bit more
 */