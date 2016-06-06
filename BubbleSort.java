//U10416023

//Import the api we need
import java.util.Scanner;

//Main class
class BubbleSort {

  //Main method
  public static void main(String []args) {

    //Declare the variable we need
    int n, c, d, swap;

    //Create a scanner object by using the initial class
    Scanner scanner = new Scanner(System.in);

    //Asking the number input the user
    System.out.println("Input number of integers to sort");
    n = scanner.nextInt();

    //Get the number of elements
    int array[] = new int[n];
    System.out.println("Enter " + n + " integers");

    //input the n elements
    for (c = 0; c < n; c++)
      array[c] = scanner.nextInt();

    //using BubbleSort
    for (c = 1; c < n; c++) {
      for (d = 0; d < n-1 ; d++) {
        if (array[d] > array[d+1]){ /* For descending order use < */
          swap       = array[d];
          array[d]   = array[d+1];
          array[d+1] = swap;
        }
      }
    }

    //show the outcome
    System.out.println("Sorted list of numbers");
    for (c = 0; c < n; c++)
      System.out.println(array[c]);
  }
}
