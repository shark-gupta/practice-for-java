/*
1
2  3
4  5  6
7  8  9  10
11 12 13 14 15
 */
package patterns;

import java.util.Scanner;

public class floyds_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int num = sc.nextInt();
        int a=1;
        for (int i = 0; i <=num ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+a);
                a=a+1;
            }
            System.out.println();
        }
    }
}

