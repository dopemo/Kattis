import java.util.*;
 public class MyConsoleIO 
    {
        // Create a single shared Scanner for keyboard input
        private static Scanner scanner = new Scanner( System.in );

        // Program execution starts here
        public static void main ( String [] args )
        {
            // Prompt the user
            System.out.print( "Type some data for the program: " );


            // Read a line of text from the user.
            String input = scanner.nextLine();

            // Display the input back to the user.
            System.out.println( "input = " + input );

        } // end main method

    } // end MyConsoleIO cla