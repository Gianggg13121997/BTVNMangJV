import java.util.Scanner;

public class AddArray {
    public static int[] addArray() {
        System.out.println("Nhap vao kich thuoc cua mang :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Nhap cac phan tu cua mang : ");
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu thu " + (i+1) + ":");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = addArray();
        System.out.println("Mang vua nhap la :");
        for(int arr1 : arr) {
            System.out.println(arr+"");

        }
        System.out.println();
    }
}
