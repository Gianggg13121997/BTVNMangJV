import java.util.ArrayList;
import java.util.Scanner;

public class searchArr {

    public static void main(String[] args) {

        int[] arr = {18,52,33,47,56,645,72,5,9};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
       while (true){
           System.out.println();
           System.out.println("tim kiem mot phan tu trong mang tren : ");
           Scanner number = new Scanner(System.in);
           int x = number.nextInt();
           boolean found = false;
           for (int i = 0; i < arr.length; i++) {
               if (arr[i] == x) {
                   System.out.println("phan tu " + x +"nam o vi tri " + i + " trong mang ");
                   found = true;
                   break;
               }
           }if(!found) {
               System.out.println("khong co phan tu do nam trong mang");
           }
       }
    }
}

