package day_2;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你想打印的层数：");
        int num = myScanner.nextInt();
        //空心金字塔
        for (int i = 0; i <= num; i++) {
            for (int k = 1; k <= num - i; k++) {
                System.out.println(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.println("*");
            }
            System.out.println("/n");
        }
    }
}
