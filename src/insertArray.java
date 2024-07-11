import java.util.Scanner;

public class insertArray {
    public static void main(String[] args) {
        int[] arr = {14,52,63,24,35,66,87,98,19};
        System.out.println("Mang ban dau la :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Nhap so ban muon chen vao : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Nhap vi tri ma ban muon chen :");
        int position = input.nextInt();
       if(position<0 || position>arr.length){
           System.out.println("vi tri khong hop le !");
       }
       int[] newArr = new int[arr.length+1];
       for(int i=0,j=0 ; j<arr.length ; j++){
           if(j==position){
               newArr[i]=number;

           }else {
               newArr[i]=arr[j];


           }
       }
        System.out.println("mang sau khi chen phan tu " + number + "vao vi tri " + position +"la :");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i] + " ") ;
        }
    }
}
