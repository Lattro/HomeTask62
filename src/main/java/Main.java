import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        double val1 = scanner.nextDouble();
        double val2 = scanner.nextDouble();
        System.out.println("Введите арифметический оператор");
        char operator = scanner.next().charAt(0);
        scanner.close();
        Calculate calculate = (double value1, double value2, char sign)
                -> {
            switch (sign)
            {
                case '+':
                    System.out.println(value1+value2);
                    break;
                case '-':
                    System.out.println(value1-value2);
                    break;
                case '*':
                    System.out.println(value1*value2);
                case '/':
                    System.out.println(value1/value2);
                    break;
                case '%':
                    System.out.println(value1%value2);
                    break;
                default:
                    System.out.println("Неопознанный оператор");
                    break;
            }
        };
        calculate.getValue(val1,val2,operator);
    }


}
