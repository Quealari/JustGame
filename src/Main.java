
import java.util.function.BiFunction;
// лямбда-выражения: функция как возвращаемое значение



public class Main {

    static BiFunction<Integer, Integer, Integer> MakeSum() {
        return (a, b) -> a + b;

    }

    static BiFunction<Integer,Integer,Integer> MakeMultiplication() {
        return (a, b) -> a * b;
    }


    public static void main(String[] args) {
        var sumFunc = MakeSum();
        var multiplicationFunc = MakeMultiplication();
        var sum = sumFunc.apply(5,8);
        var multiplication = multiplicationFunc.apply(5,8);

        System.out.println("sum is " + sum + " and " + "multiplication is " + multiplication);
    }

}
