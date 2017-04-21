import java.util.Scanner;

/**
 * Created by broadwells on 4/21/17.
 */
public class MainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing){
            System.out.println("Please enter side 1 length: ");
            int side1 = scan.nextInt();
            System.out.println("Please enter side 2 length: ");
            int side2 = scan.nextInt();
            System.out.println("Please enter side 3 length: ");
            int side3 = scan.nextInt();

            TriangleCal sidelengths = new TriangleCal(side1, side2, side3);

            sidelengths.CalculateArea(side1, side2, side3);
            sidelengths.CalculatePerimeter(side1, side2, side3);

            scan.nextLine();
            System.out.println("Continue? (y/n): ");
            String yesNo = scan.nextLine();
            if (yesNo.equalsIgnoreCase("n")){
                System.out.println("Goodbye!");
                keepGoing = false;
            }
        }
    }
}
