import java.util.Scanner;

class MatrixFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Flipped Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
