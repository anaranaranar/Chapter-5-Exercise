import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int MAX_PRICE = 3000;
        final int MAX_WEIGHT = 60;
        final int MAX_BATTERY = 400;
        Scanner input = new Scanner(System.in);


        System.out.println("I'm going to help you choose aan eBIke");
        System.out.println("Please enter the following for the bike model:");
        System.out.print("How much does it cost?: ");
        int cost = input.nextInt();
        System.out.print("How much does it weigh in pounds?: ");
        int weight = input.nextInt();
        System.out.print("How many watt hours is the battery?: ");
        int battery = input.nextInt();

    }
}