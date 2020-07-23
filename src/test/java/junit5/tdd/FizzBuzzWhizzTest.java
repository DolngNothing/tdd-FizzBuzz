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

    @Test
    void should_return_fizz_when_play_fizz_buzz_whizz_given_3() {
        //given
        int number = 3;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        //when
        String actual = fizzBuzzWhizz.play(number);
        //should
        assertEquals("fizz", actual);
    }

    @Test
    void should_return_buzz_when_play_fizz_buzz_whizz_given_5() {
        //given
        int number = 10;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        //when
        String actual = fizzBuzzWhizz.play(number);
        //should
        assertEquals("buzz", actual);
    }
}
