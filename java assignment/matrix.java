
import java.util.Scanner;

class mat {
    int[][] arr;
    int maxi = -1;

    public mat() {
        arr = new int[3][3];
    }

    String maxElement() {
        String str = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > maxi) {
                    maxi = arr[i][j];
                    str = maxi + " at " + i + " " + j;
                }
            }
        }
        return str;
    }
}

public class matrix {
    public static void main(String[] args) {
        mat ob = new mat();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in 3X3 matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ob.arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Maximum element present in Matrix is " + ob.maxElement());
        sc.close();
    }
}
