package simplearn.p1;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
      
    	  try( Scanner sc = new Scanner(System.in)){
    		  
        System.out.println("Enter any number:");
        while(true) {
        int n = sc.nextInt();
        

        if (n == 1) {
            System.out.println("You entered 1");
            // Nested if block
            if (n == 1) {
                n = n + 1;
                System.out.println(n + " addition");
            }
        } else if (n == 2) {
            System.out.println("You entered 2");
        } else {
            System.out.println("You entered a number other than 1 or 2");
        }

        // It's good practice to close the Scanner when you're done using it
//        sc.close();
    }
    	  }
}
}

