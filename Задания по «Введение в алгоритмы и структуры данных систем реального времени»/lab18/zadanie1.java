package lab18;

public class zadanie1 {

    // Шаг 1
    // Программа дает сбой, потому что пытается выполнить деление на ноль, которое она не в состоянии выполнить.
//    public static void exceptionDemo() {
//        System.out.println( 2 / 0 );
//    }


    // Шаг 2
    // Без изменений
//    public static void exceptionDemo() {
//        System.out.println( 2,0 / 0,0 );
//    }


    // Шаг 3
    // В блоке try заключен код, в котором может произойти исключение, а в блоке catch заключен код по обработке исключения
    public static void exceptionDemo() {
        try {
            System.out.println( 2/0 );
        }
        catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }


    public static void main(String[] args) {
        exceptionDemo();
    }
}
