/**
 * @Class Name: SpeedLight
 * @Author: Peyton Holland
 * @Version: 1.0
 * @Date: 26 January 2023
 * Description: A program designed to calculate the distance between a lightning strike and the observer, given
 * the speed of light at 340 meters per second, and the observer hearing the sound of thunder 5 seconds later.
 */

public class SpeedLight {
    public static void main(String[]args)
    {
        int speedOfSound = 340;
        int soundOfThunder = 5;
        double distance = speedOfSound / soundOfThunder;
        System.out.println("The observer sees a flash of lightning, followed by the sound of thunder.");
        System.out.println("The observer hears the sound of thunder " + soundOfThunder + " seconds after the lightning.");
        System.out.println("Given that the speed of sound is " + speedOfSound + " meters per second,");
        System.out.println("the observer is " + distance + " meters away from the lightning strike.");
    }
}
