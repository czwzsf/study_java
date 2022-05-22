package day_2;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        /*
        goal:参加歌手比赛，如果初赛成绩大于8.0就进入决赛，
        否则提示淘汰.并且根据性别提示进入男子组或女子组。
        提示：double score; char gender;
        接收字符：char gender = scanner.next().charAt(0);
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入该歌手的成绩");
        double score = myScanner.nextDouble();
        if (score > 8.0) {
            System.out.println("请输入性别：");
            //将输入的变为字符串形式
            char gender = myScanner.next().charAt(0);
            if (gender == '男') {
                System.out.println("进入男子组!");
            } else if (gender == '女') {
                System.out.println("进入女子组!");
            } else {
                System.out.println("不能参加比赛～～");
            }
        } else {
            System.out.println("Sorry, 你被淘汰了～");
        }
    }
}
