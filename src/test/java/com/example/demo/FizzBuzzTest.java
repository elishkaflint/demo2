package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzReturnsOne() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        Integer result = fizzBuzz.fizzBuzz(1);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testFizzBuzzReturnsTwo() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        Integer result = fizzBuzz.fizzBuzz(2);

        assertThat(result).isEqualTo(2);
    }

}
