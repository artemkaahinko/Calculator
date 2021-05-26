import java.util.Scanner;

public class Calculator {
    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 =getInt();
        char operation = getOperation();
        int results = calc(num1, num2, operation);
        System.out.println("Результат операции:" +results);
}
    public static int getInt() {
        System.out.println("Введите число: ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку, попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }
    public static char getOperation() {
        System.out.println("Введите операцию: ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);

        } else {
            System.out.println("Вы допустили ошибку, повторите ввод.");
            scanner.next();
            operation =  getOperation();
        }
        return operation;
    }
    public static int calc (int num1, int num2, char operation) {
        int results;

        switch (operation) {
            case '+':
                results = num1 + num2;
                break;
            case '-':
                results = num1 - num2;
                break;
            case '*':
                results = num1 * num2;
                break;
            case '/':
                results = num1 / num2;
                break;
            default:
                System.out.println("Ввод был не верный, повторите еще раз.");
                results = calc(num1, num2, getOperation());
        }
        return results;
    }

    public static void setScanner(Scanner scanner) {
        Calculator.scanner = scanner;
    }

}
