package day_2;

public class For01 {
    public static void main(String[] args) {
        int count = 4;
        for (int i = 0, j = 0; i < count; i++, j += 2) {
            System.out.println("i= " + i + " " + "j=" + j);
        }
    }
}
