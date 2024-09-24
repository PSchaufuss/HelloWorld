public class TriangleFindAreaTest
{
    public static void main(String[] args)
    {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        double triangleAArea = triangleA.findArea();
        System.out.println("The area of triangleA is " + triangleAArea);
        System.out.println("The sideLenThree of triangleA is " + triangleA.sideLenThree);
        System.out.println("Amount of sides: " + Triangle.numOfSides);
        System.out.println();

        double triangleBArea = triangleB.findArea();
        System.out.println("The area of triangleB is " + triangleBArea);
        System.out.println("The base of triangleB is " + triangleB.base);

        System.out.println("Amount of sides: " + Triangle.numOfSides);
    }
}
