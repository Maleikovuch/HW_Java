import java.util.Scanner; // импорт сканера
import java.io.*;

class HW_2 {
    public static void main(String args[]) {

        System.out.print("Введите число, которое надо возвести в степень: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Введите степень: ");
        int b = scan.nextInt();
        System.out.println("Возвести число " + (a) + " в степень " + (b));
        scan.close();
        
    
        double result = Math.pow(a, b);
        System.out.println(result);
        newFile(result);

    }

    public static void newFile(double result) {
        try {
            PrintWriter printWriter = new PrintWriter("result.txt");
            printWriter.println(result);
            printWriter.close();
        } catch (FileNotFoundException ex) {

        }
    }
}
