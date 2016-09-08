package qEquation;

// класс для ввода значений с клавиатуры
import java.util.Scanner;

public class qEquation {


    public static void main(String[] args) {

        double a,b,c; // переменные
        double D; // дискриминант

        System.out.println("----------------------------------------------------");
        System.out.println("Программа решает квадратное уравнение вида ax2 + bx + c = 0");
        System.out.println("Для решения нужно ввести значения переменных a,b и c");
        System.out.println("----------------------------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение а:");
        a = input.nextDouble();
        System.out.println("Введите значение b:");
        b = input.nextDouble();
        System.out.println("Введите значение c:");
        c = input.nextDouble();

        D = b*b - 4*a*c;
        System.out.println("Дискриминант равен " + D);

        // если дискриминант больше нуля
        if (D > 0.000001) {
            double x1,x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Так как дискриминант больше нуля, корней будет два: x1 = " + x1 + ", x2 = " + x2);
        }
        // если дискриминант равен нуля
        else if (D == 0.000001) {
            double x;
            x = -b / (2 * a);
            System.out.println("Так как дискриминант равен нулю, уравнение имеет один корень: x = " + x);
        }
        // если дискриминант меньше нуля
        else {
            System.out.println("Уравнение не имеет действительных корней :(");
        }
    }
}
