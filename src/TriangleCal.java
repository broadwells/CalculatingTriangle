/**
 * Created by broadwells on 4/21/17.
 */
public class TriangleCal {
    private int Side1Length;
    private int Side2Length;
    private int Side3Length;

    public TriangleCal(int side1Length, int side2Length, int side3Length) {
        Side1Length = side1Length;
        Side2Length = side2Length;
        Side3Length = side3Length;
    }

    public void CalculateArea(int side1Length, int side2Length, int side3Length){
        double s = 0.5 * (side1Length + side2Length + side3Length);
        double area = Math.sqrt(s * (s-side1Length) * (s - side2Length) * (s - side3Length));

        System.out.println("The area is: " + area);
    }

    public void CalculatePerimeter(int side1Length, int side2Length, int side3Length){
        int perimeter = side1Length + side2Length + side3Length;
        System.out.println("The perimeter is: " + perimeter);
    }
}
