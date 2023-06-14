package TechnoHacks;

import java.util.Scanner;

public class number_guess {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in);) {
            int max = 100;
            int min = 1;
            int range = max - min + 1;
            int n = (int) (Math.random() * range) + min;
            System.out.println("number guessing game starts....");
            for (int k = 1; k <= 100; k++) {
                System.out.println("enter your " + k + " number");
                int a = scan.nextInt();
                if (a == n) {
                    System.out.println("you won this game ,no was " + a);
                    System.exit(0);
                } else {
                    System.out.println(a + " is not correct number");
                    if (n < a) {
                        System.out.println("no is less than" + a);
                    } else {
                        System.out.println("no is greater than " + a);
                    }
                }
            }
            System.out.println("you lose this game no was " + n);
        }
    }
}
