import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        startCalc();

        while (true) {

            System.out.println("Введите данные: ");
            String line = scanner.nextLine();

            if (line.equals("exit")) {
                exitCalc();
                break;
            }

            try {
                String[] symbols = line.split(" ");
                if (symbols.length != 3) throw new Exception("Что-то пошло не так, попробуйте еще раз");

                Number firstNumber = RomanToArabic.parseAndValidate(symbols[0]);
                Number secondNumber = RomanToArabic.parseAndValidate(symbols[2], firstNumber.getType());
                String result = Operation.calculate(firstNumber, secondNumber, symbols[1]);
                System.out.println("Ответ: \n" + result);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                exitCalc();
                break;
            }
        }

        scanner.close();
    }

    private static void startCalc() {
        System.out.println("Добро пожаловать в Калькулятор");
        System.out.println("Калькулятор выполняет операции сложения, вычитания, умножения и деления с двумя числами:");
        System.out.println("Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.");
        System.out.println("Калькулятор работает только с целыми числами'");
        System.out.println("Для выхода из программы введите 'exit'");
    }

    private static void exitCalc() {

        System.out.println("Выход из калькулятора");

    }
}


