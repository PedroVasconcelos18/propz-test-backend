package io.pedrovasconcelosdev.propztestbackend.service.impl;

import io.pedrovasconcelosdev.propztestbackend.service.PerfectNumberService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PerfectNumberServiceImpl implements PerfectNumberService {

    @Override
    public boolean isPerfectNumber(final int number) {
        int somaDivisores = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == number;
    }

    @Override
    public List<Integer> getPerfectNumbers(final int start, final int end) {
        List<Integer> perfectNumberList = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPerfectNumber(i)) {
                perfectNumberList.add(i);
            }
        }
        return perfectNumberList;
    }

}
