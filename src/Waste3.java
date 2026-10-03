public class Waste3 {

    public static double calculateTotalWaste(double point1waste, double point2waste) {
        return point1waste + point2waste;
    }

    public static void main(String[] args) {
        double point1waste = 78.2;
        double point2waste = 21.8;

        System.out.println(calculateTotalWaste(point1waste, point2waste));
    }
}
