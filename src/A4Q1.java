
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int O = 0;                                                          //O will keep track of how many times the program runs and which run it is
        int C = 0;                                                          //C will come to keep track of calories
        int One = 0;                                                        //One will represent the calorie count based on which time it is going around
        int Two = 0;                                                        //Putting these statements at the very beginning also eliminates me having to put 'int' into each if statement.
        int Three = 0;                                                      
        int Four = 0;                                                       
        while (true) {
            if (O == 0) {                                                   //Makes first run through ask for a burger choice
                System.out.println("Please enter a burger choice.");
                One = 461;
                Two = 431;
                Three = 420;
            }
            if (O == 1) {                                                   //Makes second run through ask for a side order choice
                System.out.println("Please enter a side order choice.");
                One = 100;
                Two = 57;
                Three = 70;
            }
            if (O == 2) {                                                   //Makes third run through ask for a drink choice
                System.out.println("Please enter a drink choice");
                One = 130;
                Two = 160;
                Three = 118;
            }
            if (O == 3) {                                                   //Makes fourth run through ask for a dessert choice
                System.out.println("Please enter a dessert choice.");
                One = 167;
                Two = 266;
                Three = 75;
            }
            Scanner input = new Scanner(System.in);
            int A = input.nextInt();                                        //Check which number the user orders
            if (A == 1) {                                                   //These lines check the number (between 1 and 4) and impliment the correct calories
                C = (C + One);                                              //The calorie count was already assigned to 'One' through 'Four' based on the run number for the loop.
            }
            if (A == 2) {
                C = (C + Two);
            }
            if (A == 3) {
                C = (C + Three);
            }
            if (A == 4) {
                C = (C + Four);
            }
            O = O + 1;                                                      //Counts how many times while loop is run.
            if (O == 4) {                                                   //Breaks while loop before it attempts to make a fifth go around.
                break;                                                      //Breaks while loop, sending the program to it's final line(s).
            }
        }
        System.out.println("Your total Calorie count is " + C);             //Tells user the calorie count for their order.
    }
}
