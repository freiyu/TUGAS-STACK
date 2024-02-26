package tugas4_Stack;
import java.util.Scanner;

public class Main {
    // Fungsi untuk mengubah bilangan desimal menjadi biner
    public static void decimalToBinary(int decimal)
    {
        Stack stack = new Stack();

        if(decimal == 0){
            int x = 0;
            System.out.println(x);
        }

        int n = decimal;
        while(n > 0){
            int rem = n % 2;
            stack.push(rem);
            n /= 2;
        }

        stack.printStack();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Decimal : ");
        int decimal = scanner.nextInt();
        System.out.print("Hasil Decimal ke Binary : ");
        decimalToBinary(decimal);
    }
}
