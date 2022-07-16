import java.util.Scanner;
public class Main {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

   /* Напишем программу, которая будет просчитывать возможность существования треугольника на основе длин его сторон.
    Для этого тебе нужно:
    Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника.
    Определить возможность существования треугольника по сторонам.*/

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();
        boolean t1 = s1 < (s2 + s3);
        boolean t2 = s2 < (s1 + s3);
        boolean t3 = s3 < (s2 + s1);
        boolean t4 = t1 && t2 && t3;
        if (t4) {
            System.out.println( TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }


    }
}