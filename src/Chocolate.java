/**
 * @Class: Chocolate
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 26 January 2023
 *
 * Description - Given 9 bags of chocolate bars, each including two bars, but having room for three bars each, this program is designed
 * to repopulate the chocolate bars to each bag such that three bars are in each bag.
 */

public class Chocolate {
    public static void main(String[]args)
    {
        int chocolateBags = 9;
        int chocolateBars = 2;

        System.out.println("Currently, there are " + chocolateBags + " bags of chocolate.");
        System.out.println("Currently, each bag of chocolate contains " + chocolateBars + " chocolate bars per bag.");
        System.out.println("But wait! We can fit THREE (3) chocolate bars in each bag!");
        System.out.println("Let's use Java to repopulate each bag so we have three bars in each bag.");
        chocolateBars = chocolateBags * chocolateBars;
        System.out.println("There are currently " + chocolateBars + " bars of chocolate.");
        chocolateBars = chocolateBags / 3;
        System.out.println("We have now used Java magic to repopulate these bags.");
        System.out.println("We now have " + chocolateBags + " bags of chocolate bars.");
        System.out.println("In each bag, we now have " + chocolateBars + " bars of chocolate in each bag.");
        System.out.println("Would you like a chocolate bar?");
    }
}
