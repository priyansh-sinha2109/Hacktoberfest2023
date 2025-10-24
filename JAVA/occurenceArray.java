import java.util.Scanner;

public class occurenceArray {
   // Main method
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         // Step 1 :- Taking Size of Array 
     System.out.print("Enter the size  : ");
        int size = input.nextInt();
        int[] nums =  new int[size];
         // Step 2 :- Take Array Element as input
        int i = 0;
        while(i < size){
            System.out.print("Please enter the element " + (i+1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        // Step 3 :- Take number to check for occurence
          System.out.println("Welcome to check the occurence of the number in the array");
          System.out.println("Enter the number you have to check : ");
          int num = input.nextInt();
          // Step 4 :- Call function to count occurence
          int occ = occurence(nums, num);
          // Step 5 :- Display result
          System.out.println("Your number was found " + occ + " times in the Array" );
    }
    // Step 6 :- Method to count occurence of a number in array
    public static int occurence(int[] numArray , int num){
      int occ = 0;
      int i = 0;
      while(i < numArray.length){
        if(numArray[i] == num){
          occ++;
        }
        i++;
      }
     return occ;
    }
}