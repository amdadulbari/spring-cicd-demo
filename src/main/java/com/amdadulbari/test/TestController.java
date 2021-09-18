package com.amdadulbari.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String index(@RequestParam int firstNumber, @RequestParam int secondNumber) {
        int sum = firstNumber + secondNumber;
        return "Sum = "+sum;
    }
}
