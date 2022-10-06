public class Main {
    public static void main(String[] args) {
        //draw rectangle
        int a = 5;
        int b = 16;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (j == b - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");

        //draw triangle square 1
        int c = 9;
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");

        //draw triangle square 2
        int d = 9;
        for (int i = 0; i < d; i++) {
            for (int j = d - i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");

        //draw triangle 3
//        int e = 11;
//        int f = 1;
//        int count = 0;
//        int begin = e / 2;
//        while (f <= e) {
//            for (int i = 0; i < e; i++) {
//                if (i >= begin - count && i <= begin + count) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("\n");
//            count++;
//            f += 2;
//        }

        int g = 5;
        for (int i = 1; i <= g; i++) {

        }
    }
}