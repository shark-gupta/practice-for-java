/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */
package patterns;

import java.util.Scanner;

public class zero_1_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows number: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i ; j++) {
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}