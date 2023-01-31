package exercise1;

import java.lang.Math; 
import java.util.Scanner; 
import java.util.Arrays;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Juliean Do Jan 31, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Card card = new Card();
        

        for (int i = 0; i < hand.length; i++) {
           
            //card.setValue(insert call to random number generator here)
            card.getValue((int)(Math.random() * 13 + 1));
            card.getSuit(Card.SUITS[(int)(Math.random())]);

            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            
                    // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter and card value:");
        int cardPut = input.nextInt(); 
        
        System.out.println("Enter card suit: ");
        int cardPutSuit = input.nextInt(); 
        

        for (int i = 0; i < hand.length; i++){
            if(cardPut == card.getValue() && cardPutSuit == card.getSuit){
            System.out.println(" Your card is a match!");
            }
            else {
            System.out.println("Your card is not a match");
        
            }
        }
        


            
    }
        
        // If the guess is successful, invoke the printInfo() method below.
        
   

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Juliean DO Jan 31, 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Juliean Do, but you can call me Juliean");
        System.out.println();
        
        System.out.println("My career ambitions: To work in mental health tech");
        System.out.println("-- Create more networking connections");
        System.out.println("-- Learn more and get decent grades");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Hiking");
        System.out.println("-- Travelling ");
        System.out.println("-- Binge watching shows");
        System.out.println("-- Crocheting");

        System.out.println();
        
        
    
    }

}
