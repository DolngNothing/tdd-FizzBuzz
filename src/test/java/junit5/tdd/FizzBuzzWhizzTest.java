package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzWhizzTest {
    @Test
    void should_return_1_when_play_fizz_buzz_whizz_given_1() {
        //given
        int number = 1;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        //when
        String actual = fizzBuzzWhizz.play(number);
        //should
        assertEquals("1", actual);
    }


}