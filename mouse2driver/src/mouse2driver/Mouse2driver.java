package mouse2driver;

import java.util.Scanner;

public class Mouse2driver {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        Mouse2 mickey = new Mouse2();
        int days;
        mickey.setPercentGrowthRate(10);
        System.out.print("Enter number of days to grow: ");
        days = computerKeyboardInput.nextInt();
        mickey.grow(days);
        System.out.printf("Age = %d, weight = %.3f\n", mickey.getAge(), mickey.getWeight());
    }
}
