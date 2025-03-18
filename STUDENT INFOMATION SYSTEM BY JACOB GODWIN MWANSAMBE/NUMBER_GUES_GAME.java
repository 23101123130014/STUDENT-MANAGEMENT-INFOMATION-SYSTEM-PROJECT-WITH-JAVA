import java.util.Scanner;
import java.util.Random;

public class NUMBER_GUES_GAME
{
  public static void main(String [] args)
  {
    //number guessing game
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    
    int guess;
    int attempt = 0;
    int min = 1;
    int max = 100;
    int randomNumber = random.nextInt(min, max + 1);
 
    System.out.println("Number guessing game");
    System.out.println("enter the number bewtween 0k - 101 ");
    
    do{
     System.out.print(" Enter a guess number: ");
     guess = scanner.nextInt();
     attempt++;
     if(guess < randomNumber)
     {
         System.out.println(" too low! Try Again");
     }
     else if(guess > randomNumber)
     {
         System.out.println(" too high! Try Again ");
     }
     
     else
     {
         System.out.println(" weldone");
         System.out.println(" the number of attemp was " + attempt);
     }
    }
    while(guess != randomNumber);
    System.out.println(" you have won");
    
  }
}