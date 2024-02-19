package io.pedrovasconcelosdev.propztestbackend.service;

import io.pedrovasconcelosdev.propztestbackend.service.impl.PerfectNumberServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PerfectNumberServiceTest {

    private final PerfectNumberService perfectNumberService = Mockito.mock(PerfectNumberServiceImpl.class);


    @Test
    public void shouldReturnTrueIfAGivenNumberIsPerfectNumber() {
        final int number = 6;
        when(perfectNumberService.isPerfectNumber(number)).thenReturn(true);
        boolean result = perfectNumberService.isPerfectNumber(number);
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseIfAGivenNumberIsPerfectNumber() {
        final int number = 8;
        when(perfectNumberService.isPerfectNumber(number)).thenReturn(false);
        boolean result = perfectNumberService.isPerfectNumber(number);
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnAllPerfectNumbersBetweenTwoGivenNumbers() {
        final int start = 0;
        final int end = 28;
        final List<Integer> expectedResult = List.of(0, 6, 28);

        when(perfectNumberService.getPerfectNumbers(start, end)).thenReturn(expectedResult);
        List<Integer> result = perfectNumberService.getPerfectNumbers(start, end);
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturnAnEmptyListBecauseBetweenTheTwoGivenNumbersDoNotHaveAnPerfectNumber() {
        final  int start = 1;
        final int end = 10;
        when(perfectNumberService.getPerfectNumbers(start, end)).thenReturn(Collections.emptyList());
        List<Integer> result = perfectNumberService.getPerfectNumbers(start, end);
        assertEquals(Collections.emptyList(), result);
    }


}
