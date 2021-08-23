public class Operation {

    public static String calculate(Number a, Number b, String operation) throws Exception {

        int result;

        switch (operation) {
            case "+":
                result = a.getValue() + b.getValue();
                break;
            case "-":
                result = a.getValue() - b.getValue();
                break;
            case "*":
                result = a.getValue() * b.getValue();
                break;
            case "/":
                result = a.getValue() / b.getValue();
                break;
            default:
                throw new Exception("Неправильный символ операции, используйте: +, -, *, /");
        }

        if (a.getType() == NumType.ROMAN) {
            return RomanToArabic.toRomanNumber(result);
        } else return String.valueOf(result);
    }
}
