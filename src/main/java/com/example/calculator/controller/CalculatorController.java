package com.example.calculator.controller;

import com.example.calculator.model.CalculatorInput;
import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/calculate")
    public double calculate(@RequestBody CalculatorInput input) {
        return calculatorService.calculate(input);
    }
}
