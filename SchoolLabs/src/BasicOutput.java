import java.util.Scanner; 

public class BasicOutput {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum = 0;
      int userNum2 = 0;
      System.out.println("Enter integer: ");
      userNum = scnr.nextInt();
      System.out.println("You entered: " + userNum);
      int userNumSquared = userNum * userNum;
      System.out.println(userNum + " squared is " + userNumSquared);
      int userNumCubed = userNum * userNum * userNum ;
      System.out.println("And " + userNum + " cubed is " + userNumCubed +"!!");
      System.out.println("Enter another integer: ");
      userNum2 = scnr.nextInt();
      int userNumsAdded = userNum + userNum2;
      int userNumsMulti = userNum * userNum2;
      System.out.println(userNum + " + " + userNum2 + " is " + userNumsAdded);
      System.out.println(userNum + " * " + userNum2 + " is " + userNumsMulti);
      return;
   }
}