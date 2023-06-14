package TechnoHacks;

import java.util.Scanner;
import java.util.Random;

public class pass_generator {
    public static void main(String[] args) {
        Random ab = new Random();
        String str = "ajkeibzcnvbqewtruyoyp1325467980PQJDHERRIFGBCVZMA<KQZPLMOIUYT!@#$%^&*";
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("enter the length of password to be generated");
            int n = sc.nextInt();
            char[] pass = new char[n];
            for (int i = 0; i < n; i++) {
                pass[i] = str.charAt(ab.nextInt(str.length()));
            }

            System.out.println(" random password of " + n + " length is ");

            System.out.println(pass);

        }
    }
}
