/**
 * @Class: FindX
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 26 January 2023
 *
 * Description - We will use Java to determine the equation 5 + 19 + X + 47 = 194.
 */

public class FindX {
    public static void main(String[] args) {
        int int1 = 5;
        int int2 = 19;
        int int3 = 47;
        int total = 194;

        System.out.println("Java is powerful! Let's show how powerful it is by using it to perform an algebraic equation.");
        System.out.println("First, we are presented with the following problem:");
        System.out.println(int1 + " + " + int2 + " + X + " + int3 + " = " + total);
        System.out.println("Let's start by subtracting 5 from both sides of this equation.");
        total = total - int1;
        System.out.println("This leaves us with: ");
        System.out.println(int2 + " + X + " + int3 + " = " + total);
        System.out.println("Next, let's subtract 19 from both sides of this equation.");
        total = total - int2;
        System.out.println("This leaves us with: ");
        System.out.println("X + " + int3 + " = " + total);
        System.out.println("Then, we will subtract 47 from both sides of this equation.");
        total = total - int3;
        System.out.println("So now, we have: ");
        System.out.println("X = " + total);
        System.out.println("Therefore, X equals: " + total);
        System.out.println("Java is great at algebra!");
    }
}