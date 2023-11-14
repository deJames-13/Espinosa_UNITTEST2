// UNIT TEST 2 LAB ESPINOSA, Derick James M.

public class unit2Espinosa18 {
    public static void main(String[] args) {
        unit2Espinosa18 obj = new unit2Espinosa18();
        int x = 5;
        // Area of a circle
        System.out.println(String.format("Area of Circle:  %.2f", obj.areaOfCircle(x)));

        // Area of a square
        System.out.println(String.format("Area of Square:  %.2f", obj.areaOfSquare(x)));
    }

    public double areaOfCircle(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double areaOfSquare(double side) {
        double area = Math.pow(side, 2);
        return area;
    }

}
