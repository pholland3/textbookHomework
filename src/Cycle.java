/**
 * @Class: Cycle
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 26 January 2023
 *
 * Description - At a cycle shop, there are 10 bicycles, and X number of tricycles. After counting the total number of wheels on both the
 * bicycles and tricycles in the cycle shop, we have found there are a total of 47 wheels. So, how many tricycles does this cycle shop have?
 */

public class Cycle
{
    public static void main(String[] args)
    {
        int bicycles = 10;
        int tricycles;
        int wheels;
        int totalWheels = 47;

        System.out.println("Welcome to the Hot Coffee Cycle Shop!");
        System.out.println("At this cycle shop, we currently have: " + bicycles + " bicycles in stock.");
        System.out.println("After counting the number of wheels, we have a total of " + totalWheels + " in our shop.");
        System.out.println("So, let's let Java tell us how many tricycles we have in the shop!");
        System.out.println("Well, each bicycle has two wheels, and we have " + bicycles + " bicycles.");
        wheels = bicycles * 2;
        System.out.println("So far, we have " + wheels + " wheels accounted for.");
        System.out.println("So now, we have to account for the remaining wheels to determine the number of tricycles.");
        totalWheels = totalWheels - wheels;
        System.out.println("So, if we have " + totalWheels + " wheels left to account for, and each tricycle has three wheels...");
        tricycles = totalWheels / 3;
        System.out.println("That must mean that we have " + tricycles + " tricycles in our shop.");
        System.out.println("Thank you for visiting Hot Coffee Cycle Shop! Would you be interested in some Java?");
    }
}