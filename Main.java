package Lambda;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(2,1);
        int c = calc.devide.apply(a, b); // деление на ноль, не совсем понял как сделать по аналогии с abs. Что должно выводиться в случае ошибки?
        calc.println.accept(c);
    }
}
