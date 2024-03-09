import java.util.*;

public class Main{
    public static void main(String[] args) {

        
        int randomNumber = (int) (Math.random() * 100) + 1;

         Scanner sc = new Scanner(System.in);

         boolean guessedCorrectly = false;
		        int numberOfAttempts = 0;
		        System.out.println("Guess a number between 1 and 100: "
		        		+ "\nSystem Generated Number is "+randomNumber);

                       
                        while (!guessedCorrectly && numberOfAttempts < 232) 
                        {
                            
                            int userGuess = sc.nextInt();
        
                            
                            if (userGuess == randomNumber) 
                            {
                                guessedCorrectly = true;
                            } 
                            else 
                            {
                                numberOfAttempts++;
                                if (userGuess > randomNumber) 
                                {
                                    System.out.println("Your guess is too high.");
                                } else 
                                {
                                    System.out.println("Your guess is too low.");
                                }
                            }
                        }
        
                        
                        sc.close();
        
                        
                        if (guessedCorrectly) 
                        {
                            System.out.println("Congratulations! You guessed correctly! The number was " + randomNumber);
                        } else 
                        {
                            System.out.println("Sorry, you ran out of guesses. The correct answer was " + randomNumber);
                        }
                    
                
        
                
                
            }
        
        }                
        
    
