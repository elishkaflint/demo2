package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzReturnsNumber() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        Integer result = fizzBuzz.fizzBuzz(1);

        assertThat(result).isEqualTo(1);
    }

}
