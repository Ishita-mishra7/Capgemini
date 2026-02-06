import java.util.*;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[2][2];

        // Input
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        // Print original
        System.out.println("Original Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        // Rotation (90 clockwise)
        System.out.println("90 Degree Clockwise Rotated Matrix:");
        System.out.println(m[1][0] + " " + m[0][0]);
        System.out.println(m[1][1] + " " + m[0][1]);
    }
}

