import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("Nhập số muốn chèn vào mảng: ");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí index muốn chèn vào mảng: ");
        int index = scanner.nextInt();
        int[] newArr = new int[arr.length + 1];
        if (index <= -1 && index >= arr.length) {
            System.out.println(" Ko chèn được vị trí vào mảng ");
        } else {
            System.out.println("Mảng mới là: ");
            for (int i = 0; i < newArr.length; i++) {
                if (i < index) {
                    newArr[i] = arr[i];
                } else if (i == index) {
                    newArr[i] = x;
                } else {
                    newArr[i] = arr[i - 1];
                }
                System.out.print(newArr[i]+ "  ");
            }

        }


    }
}