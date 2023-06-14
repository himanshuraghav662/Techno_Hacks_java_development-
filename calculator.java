package TechnoHacks;
    
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a, b, add, sub, mul, div;
        int ch;
        try (Scanner abc = new Scanner(System.in)) {
            System.out.println("enter first value ");
            a = abc.nextInt();
            System.out.println("enter second value");
            b = abc.nextInt();
            while (true) {
                System.out.println(
                        "enter 1 for addition \n 2 for subtraction \n 3 for multiplication \n 4 for division \n 5 for exit");
                System.out.println("enter choice");
                ch = abc.nextInt();
                switch (ch) {
                    case 1:
                        add = a + b;
                        System.out.println("addition = " + add);
                        break;

                    case 2:
                        sub = a - b;
                        System.out.println("subtraction = " + sub);
                        break;
                    case 3:
                        mul = a * b;
                        System.out.println("multiplication = " + mul);
                        break;
                    case 4:
                        div = a / b;
                        System.out.println("division = " + div);
                        break;
                    case 5:
                        System.exit(0);

                    default:
                        System.out.println("you have entered wrong choice");
                        break;

                }
            }
        }
    }

}
