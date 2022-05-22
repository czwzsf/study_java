package day_2;
// if-else快速入门

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        // 把年龄保存到age这个int变量里面
        int age = myScanner.nextInt();
        if (age > 18) {
            System.out.println("你的年龄大于18，要对自己的行为负责");
        } else {
            System.out.println("你的年龄不够，这次放过你！");
        }
    }
}
