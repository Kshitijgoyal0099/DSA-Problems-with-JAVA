/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonaicc;

/**
 *
 * @author kkgoy
 */
import java.util.*;
public class Fibonaicc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Please Enter the number till which you want it to be printed:");
        int n=sc.nextInt(); 
   System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
        // TODO code application logic here
    }
    
}
