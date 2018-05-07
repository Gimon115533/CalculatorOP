package CalOP;

public class CalculatorOP {
    private static double x;//первое число
    private static double y;//второе число
    private static String z;//вид оперции
    private static double rez;//результат

    CalculatorOP(double x, double y, String z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static double getRez() {
        rez=rezMet();
        return rez;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }


    public static double rezMet() {
        switch (z) {
            case "+":
                rez = x + y;
                break;
            case "-":
                rez = x - y;
                break;
            case "/":
                rez = x / y;
                break;
            case "*":
                rez = x * y;
                break;
            default:
                System.out.println("Вы ввели не верное значение: " + z);
        }
        return rez;
    }
}
