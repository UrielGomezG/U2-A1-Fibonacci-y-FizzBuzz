package mx.edu.utez.FizzBuzzFibunacci.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController 
@RequestMapping("/programa")
public class Controller {

    @GetMapping ("/fizzbuzz/{numero}")
    public String fizzBuzz(@PathVariable int numero){
        {
            for (int i = 1; i <= numero; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            } 
            return "Uriel Gomez Garcia";
        }
    }

    @GetMapping ("/fibonacci/{numero}")
    public String fibonacci(@PathVariable int numero){
        int a = 0, b = 1;
        System.out.print("Fibonacci: " + a + " " + b);
        for (int i = 2; i < numero; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        return "Uriel Gomez Garcia";
    }
}
