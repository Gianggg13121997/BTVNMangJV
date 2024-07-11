import java.util.Scanner;

public class deleteArr {
    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 6, 1, 3};


        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập phần tử bạn muốn xóa: ");
        int deleteElement = sc.nextInt();


        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == deleteElement) {
                index = i;
                break;
            }
        }


        if (index == -1) {
            System.out.println("Không tìm thấy phần tử cần xóa trong mảng.");
            return;
        }


        int[] newArr = new int[arr.length - 1];
        int newIndex = 0; //

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            newArr[newIndex++] = arr[i];
        }

        //
        System.out.print("Mảng sau khi xóa phần tử " + deleteElement + ": ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }




}

