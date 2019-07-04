import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double heightAvgAstr = Double.parseDouble(scanner.nextLine());

        double rocketSize = width * lenght * height;
        double roomSize = (heightAvgAstr + 0.40) * 2 * 2;

        double spaceNeeded = rocketSize / roomSize;

        if (spaceNeeded >= 3 && spaceNeeded <=10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", Math.floor(spaceNeeded));
        } else if (spaceNeeded < 3) {
            System.out.println("The spacecraft is too small.");
        } else {
            System.out.println("The spacecraft is too big.");
        }
    }
}
