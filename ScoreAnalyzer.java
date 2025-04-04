 
                                               Explanation
Scanner Input Handling:

The Scanner class is used to get input from the user.
 nextLine() is used to get the entire line of input, including spaces.
nextInt() is used to get an integer value from the user.

String Manipulation:

    String concatenation is used to build the greeting message.
    toUpperCase() and toLowerCase() methods are used to convert the greeting message to uppercase and lowercase respectively.

Validating n:

    Validating n is important to prevent the program from running with invalid input.
  If n is not between 1 and 10, the program prints an error message and exits.

                                How it Works
1. The program prompts the user to enter their name and a positive integer n.
2. It checks if n is between 1 and 10. If not, it prints an error message and exits.
3. It uses a for loop to print the greeting message n times.
4. Inside the loop, it checks if the current iteration is even or odd using the modulo operator (i % 2 == 0).
5. If the iteration is even, it prints the greeting message in lowercase. If it's odd, it prints the greeting message in uppercase.