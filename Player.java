
package guessinggame;

// Kyle Smith, 14001835

public class Player {
    
    int number = 0; 
    
    public void guess(){
       //Randomly generate a guess
       number = (int) (Math.random() * 10);
       
    }
    
    
}
