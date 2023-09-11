public class Exam2 {

    public static void main(String[] args) {
        삼각형(3);
        System.out.println();
        삼각형(5);
        System.out.println();
        삼각형(7);
    }


    public static void 삼각형(int h) {
        for (int i = 1; i <= h; i++) {

            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}