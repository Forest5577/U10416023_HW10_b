import java.util.Scanner;

class BubbleSort {
  public static void main(String []args) {
    int n, c, d, swap;
    Scanner in = new Scanner(System.in);
    //prompt the user
    System.out.println("Input number of integers to sort");
    n = in.nextInt();
    //get the number of elements
    int array[] = new int[n];

    System.out.println("Enter " + n + " integers");
    //input the n elements
    for (c = 0; c < n; c++)
      array[c] = in.nextInt();
    //using BubbleSort like C++
    for (c = 1; c < n; c++) {
      for (d = 0; d < n-1 ; d++) {
        if (array[d] > array[d+1]) /* For descending order use < */
        {
          swap       = array[d];
          array[d]   = array[d+1];
          array[d+1] = swap;
        }
      }
    }

    System.out.println("Sorted list of numbers");
    //show the outcome
    for (c = 0; c < n; c++)
      System.out.println(array[c]);
  }
}
