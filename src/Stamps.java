/**
 * @Class: Stamps
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 26 January 2023
 *
 * Description - Susan and Jean are stamp collectors. Susan has 8 endangered animal collection stamps, and Jean has 40 racing car
 * collection stamps. How many more does Jean have than Susan?
 */

public class Stamps
{
    public static void main(String[]args)
    {
        int susanStamps = 8;
        int jeanStamps = 40;
        int difference;

        System.out.println("Susan and Jean are avid stamp collectors. Let's look at their collection!");
        System.out.println("Susan has " + susanStamps + " endangered animal collection stamps.");
        System.out.println("Jean has " + jeanStamps + " racing car collection stamps.");
        System.out.println("Wow! That's a lot of stamps! Let's see how many more stamps Jean has than Susan.");
        difference = jeanStamps - susanStamps;
        System.out.println("If you subtract Susan's collection of " + susanStamps + " stamps from");
        System.out.println("Jean's collection of " + jeanStamps + " stamps, then you are left with");
        System.out.println("a difference of: " + difference + " stamps. Jean has " + difference + " more stamps than Susan.");
        System.out.println("I hope this program gets your stamp of approval!");

    }
}