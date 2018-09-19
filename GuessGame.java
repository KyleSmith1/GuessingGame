
package guessinggame;

// Kyle Smith, 14001835

public class GuessGame {
    
    Player p1;
    Player p2;
    Player p3;
    
    public void startGame(){
        
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        //Randomly generate the number that needs to be guessed and store it as a variable
        int correctAnswer = (int) (Math.random() * 10);
        
        // Create the variables to store player guesses in.
        int p1Guess = 0;
        int p2Guess = 0;
        int p3Guess = 0;
        
        while(true){
            System.out.println("Number to guess is... " + correctAnswer);
            
            //Randomly generate a guess for each player with the guess function in the player class
            p1.guess();
            p2.guess();
            p3.guess();
            
            //Store each players guess in a variable
            p1Guess = p1.number;
            p2Guess = p2.number;
            p3Guess = p3.number;
            
            //Display player guesses
            System.out.println("Player 1 guesses: " + p1Guess);
            System.out.println("Player 2 guesses: " + p2Guess);
            System.out.println("Player 3 guesses: " + p3Guess);
            
            //If any of the players guessed correctly, the game is over
            if(p1Guess == correctAnswer || p2Guess == correctAnswer || p3Guess == correctAnswer){
                //Individually check which players guessed correctly
                if (p1Guess == correctAnswer){
                    System.out.println("Player 1 has guessed correctly!");
                }
                if (p2Guess == correctAnswer){
                    System.out.println("Player 2 has guessed correctly!");
                }
                if (p3Guess == correctAnswer){
                    System.out.println("Player 3 has guessed correctly!");
                }
                System.out.println("The game is over!");
                break;
            }
            //If none of the players are correct, the while loop continues until somebody gets it right
            else
            {
                System.out.println("All players failed to guess correctly. Please try again.");
            }
        }
        
        
    }
}
