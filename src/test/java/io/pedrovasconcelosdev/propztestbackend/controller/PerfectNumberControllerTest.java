package io.pedrovasconcelosdev.propztestbackend.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PerfectNumberControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnTrueWhenGivenNumberIsAPerfectNumberAndShouldReturnStatus200()
            throws Exception {
        this.mockMvc.perform(get("/api/is-perfect")
                        .param("number", "28"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("true")));
    }

    @Test
    void shouldReturnFalseWhenGivenNumberIsAPerfectNumberAndShouldReturnStatus200()
            throws Exception {
        this.mockMvc.perform(get("/api/is-perfect")
                        .param("number", "12"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("false")));
    }

    @Test
    void shouldReturnAllPerfectNumbersBetweenTwoGivenNumbersAndShouldReturnStatus200()
            throws Exception {
        this.mockMvc.perform(get("/api/get-perfect-numbers")
                        .param("start", "0")
                        .param("end", "28"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("[0,6,28]")));
    }

    @Test
    void shouldReturnAnEmptyListBecauseBetweenTheTwoGivenNumbersDoNotHaveAnPerfectNumberAndShouldReturnStatus200()
            throws Exception {
        this.mockMvc.perform(get("/api/get-perfect-numbers")
                        .param("start", "30")
                        .param("end", "40"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("[]")));
    }


}
