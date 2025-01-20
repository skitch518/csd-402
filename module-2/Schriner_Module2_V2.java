/*
* Book said this had no performance difference
* so i did this way instead of importing scanner & random
*/
import java.util.*; 

/**
 *
 * @author jason schriner
 * Module 2
 * 1/18/25
 * 
 * Program is a game of Rock, Paper, Scissors
 */
public class Schriner_Module2_V2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //create scanner    
        Random rand = new Random(); // random number generator
        
        String[] choices = {"rock", "paper", "scissors"};// string of choices
        int user_choice = 0;
        
        System.out.println("This is a game of Rock, Paper, Scissors!"); //introduction
        while (user_choice != 4){
            System.out.println("Enter 1 for Rock, 2 for Paper and 3 for Scissors, or 4 for exit: ");//user instructions
            user_choice = input.nextInt(); //input user selection

            if (user_choice == 4){
                break;
            }
            int computer_choice = rand.nextInt(3) + 1; //computers choice



           //compare user selection to computer selection to determine winner 
           //Realized since I only had 3 outcomes I could use or statement and reduce decisions down to 3
           if (user_choice == computer_choice) {
                System.out.println("The computer selected: " + choices[computer_choice - 1] + 
                                   " You selected: " + choices[user_choice - 1] + " It's a draw");
            } else if (user_choice == 1 && computer_choice == 2 || user_choice == 2 && computer_choice == 3 ||user_choice == 3 && computer_choice == 1) {
                System.out.println("You lose! The computer selected: " + choices[computer_choice - 1] + 
                                   " You selected: " + choices[user_choice - 1]);
            } else if (user_choice == 1 && computer_choice == 3 || user_choice == 3 && computer_choice == 2 || user_choice == 2 && computer_choice == 1) {
                System.out.println("You Win! The computer selected: " + choices[computer_choice - 1] + 
                                   " You selected: " + choices[user_choice - 1]);
                        }
    }
            
      input.close();  