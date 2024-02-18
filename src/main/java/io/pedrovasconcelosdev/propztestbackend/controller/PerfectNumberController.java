package io.pedrovasconcelosdev.propztestbackend.controller;

import io.pedrovasconcelosdev.propztestbackend.service.PerfectNumberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PerfectNumberController {

    private final PerfectNumberService perfectNumberService;

    public PerfectNumberController(final PerfectNumberService perfectNumberService) {
        this.perfectNumberService = perfectNumberService;
    }

    @GetMapping(value = "/is-perfect", params = "number")
    public boolean isPerfectNumber(@RequestParam final int number) {
        return perfectNumberService.isPerfectNumber(number);
    }

    @GetMapping(value = "/get-perfect-numbers", params = {"start", "end"})
    public List<Integer> getPerfectNumbers(@RequestParam final int start, @RequestParam final int end) {
        int lowerBound = Math.min(start, end);
        int upperBound = Math.max(start, end);
        return perfectNumberService.getPerfectNumbers(lowerBound, upperBound);
    }

}
