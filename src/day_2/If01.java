package day_2;
//单分支

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        // 定义一个scanner对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        // 把年龄保存到age这个int变量里面
        int age = myScanner.nextInt();
        if (age > 18) {
            System.out.println("你的年龄大于18，要对自己的行为负责");
        }
        System.out.println("程序继续运行");
    }
}
