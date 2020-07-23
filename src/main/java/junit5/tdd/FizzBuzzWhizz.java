package junit5.tdd;

public class FizzBuzzWhizz {
    public String play(int number) {
        StringBuffer result = new StringBuffer();
        if(number % 3 ==0){
            result.append("fizz");
        }

        if(number % 5==0){
            result.append("buzz");
        }

        if (result.length() == 0) {
            result.append(number);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        fizzBuzzWhizz.play(1);
    }
}
