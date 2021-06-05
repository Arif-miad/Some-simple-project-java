
package objectorientedlab;

import java.util.Scanner;


public class Assingment1 {
    public static void main(String[] args) {
        int num,i,counte = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value of number : ");
       num = input.nextInt();
       for(i=2;i<num-1;i++)
       {
           if(num%2==0){
               counte++;
               break;
           }
       }
       if(counte==0)
       {
           System.out.println("It is prime Number");
       }
       else
       {
           System.out.println("It is not prime Number");
       }
    }
}
