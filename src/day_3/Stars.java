package day_3;

public class Stars {
    //编写一个main方法
    public static void main(String[] args) {
        //打印空心金字塔
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
        }
    }
}
