package day_4;

import java.util.Scanner;

public class if01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入信用分：");
        int grade = myScanner.nextInt();
        if (grade == 100) {
            System.out.println("信用极好");
        } else if (grade > 80 && grade <= 99) {
            System.out.println("信用优秀");
        } else {
            System.out.println("信用不及格");
        }
    }
}
