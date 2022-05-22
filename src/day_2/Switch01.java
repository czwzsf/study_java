package day_2;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个字符(a-g):");
        char c1 = myScanner.next().charAt(0);
        switch (c1) {
            case 'a':
                System.out.println("今天是星期一，猴子穿新衣");
                break;
            default:
                System.out.println("输入不正确～");
        }
    }
}
