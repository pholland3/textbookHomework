/**
 * @Class: Circle
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 26 January 2023
 *
 * Description - This program will display the area and perimeter of a circle with a radius of 9.5 using the provided formulas.
 */

public class Circle {
    public static void main(String[] args) {
        double radius = 9.5;
        double area;
        double perimeter;

        System.out.println("This program will determine the area and perimeter of a circle with a radius of 9.5 using formulas provided in the text.");
        System.out.println("The formula to determine area of the circle is the radius squared times Pi.");
        System.out.println("Let's determine the area first:");
        area = radius * radius * Math.PI;
        System.out.println("The area of the circle is: " + area);
        System.out.println("The formula to determine perimeter of the circle is two times the radius times Pi.");
        perimeter = 2 * radius * Math.PI;
        System.out.println("The perimeter of the circle is: " + perimeter);
        System.out.println("That brings everything full circle!");
    }
}