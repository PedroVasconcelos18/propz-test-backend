package io.pedrovasconcelosdev.propztestbackend.service;


import java.util.List;

public interface PerfectNumberService {

    boolean isPerfectNumber(final int number);

    List<Integer> getPerfectNumbers(final int start, final int end);

}
