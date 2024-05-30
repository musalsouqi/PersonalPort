import java.util.Scanner;
import java.util.*;

public class PeopleWeights {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double userInput1 = 0;
      double userInput2 = 0;
      double userInput3 = 0;
      double userInput4 = 0;
      double userInput5 = 0;
      
      System.out.println("Enter weight 1: ");
      userInput1 = scnr.nextDouble();
      
      
      System.out.println("Enter weight 2: ");
      userInput2 = scnr.nextDouble();


      System.out.println("Enter weight 3: ");
      userInput3 = scnr.nextDouble();


      System.out.println("Enter weight 4: ");
      userInput4 = scnr.nextDouble();

      
      System.out.println("Enter weight 5: ");
      userInput5 = scnr.nextDouble();
      System.out.println();
      
      double[] weightArray = {userInput1, userInput2, userInput3, userInput4, userInput5};
      
      System.out.println("You entered: " + weightArray[0] + " " + weightArray[1] + " " +  weightArray[2]+ " " + weightArray[3]+ " " + weightArray[4]+ " ");
      System.out.println("Total weight: " + Arrays.stream(weightArray).sum());
      OptionalDouble average = Arrays.stream(weightArray).average();
      System.out.println("Average weight: " + average.getAsDouble());
      OptionalDouble max = Arrays.stream(weightArray).max();
      System.out.println("Max weight: " + max.getAsDouble());
      return;
   }
}