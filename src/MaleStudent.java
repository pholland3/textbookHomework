/**
 * @Class: MaleStudent
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 26 January 2023
 *
 * Description - In a middle school, there are 389 students. Of the 389 students, there are 175 female students. This
 * program will determine the number of male students at the school.
 */

public class MaleStudent {
    public static void main(String[] args) {
        int totalStudents = 389;
        int femaleStudents = 175;
        int maleStudents;

        System.out.println("Welcome to Java Middle School!");
        System.out.println("At Java Middle School, we have a total of " + totalStudents + " students.");
        System.out.println("Of these students, we have " + femaleStudents + " female students.");
        System.out.println("Using Java, we will now determine the number of male students.");
        maleStudents = totalStudents - femaleStudents;
        System.out.println("At Java Middle School, we have a total of " + maleStudents + " male students.");
    }
}