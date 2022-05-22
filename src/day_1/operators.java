package day_1;

public class operators {
    public static void main(String[] args) {
        // In Java, the essence of taking a modulo is a formula.(a % b = a - a / b * b)
        System.out.println(10 / 4); //2
        double d = 10.0 / 4;
        System.out.println(d);  //2.5
        System.out.println(10 % 3); //1
        System.out.println(-10 % 3); //-1
        System.out.println(10 % -3); //1
        System.out.println(-10 % -3); //-1
        int i = 10;
        // i++
        ++i;
        System.out.println(i);//11
        int j = 20;
        int k = j++;
        System.out.println(k);//20
        System.out.println(j);//21

    }
}
