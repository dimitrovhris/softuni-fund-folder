package basicSyntaxEx;

import java.util.Scanner;

public class BasicEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int k = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.printf("%d ",k);
            }
            System.out.println();
            k++;
        }
    }
}
