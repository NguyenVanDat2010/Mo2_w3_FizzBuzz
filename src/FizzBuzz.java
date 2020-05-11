public class FizzBuzz {
    public static String fizzBuzz(int number) {
//        throw new UnsupportedOperationException("Err");
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "FizzBuzz";
            }
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return number + "";
    }
}
