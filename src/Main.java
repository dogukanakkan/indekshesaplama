import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double weight, height, index;
        Scanner input = new Scanner(System.in);
        System.out.print("Boy (metre): ");
        height = input.nextDouble();
        System.out.print("Kilo: ");
        weight = input.nextDouble();

        double formula = (weight / Math.pow(height,2));
        index = formula * 10000;
        System.out.println("Your body index: " + index);


    }
}
