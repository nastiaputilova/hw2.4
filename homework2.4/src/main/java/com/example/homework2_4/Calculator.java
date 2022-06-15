package com.example.homework2_4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/calculator")
@RestController
public class Calculator {

    @GetMapping()
    public String greeting(){
        return "Welcome to Calculator";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") float a, @RequestParam("num2") float b){
        return a + " + " + b + " = " + (a + b);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") float a, @RequestParam("num2") float b){
        return a + " - " + b + " = " + (a - b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") float a, @RequestParam("num2") float b){
        return a + " * " + b + " = " + (a * b);
    }

    @GetMapping("/division")
    public String division(@RequestParam("num1") float a, @RequestParam("num2") float b){
        if (b == 0){
            return "error";
        }else{
        return a + " / " + b + " = " + (a / b);
    }

}
}