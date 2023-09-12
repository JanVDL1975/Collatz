package com.sequence.collatz.Collatz.Controller;

import com.sequence.collatz.Collatz.Service.CollatzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collatz")
public class CollatzController {

    private final CollatzService collatzService;

    @Autowired
    public CollatzController(CollatzService collatzService) {
        this.collatzService = collatzService;
    }

    @GetMapping("/sequence-length")
    public ResponseEntity<String> collatzSequenceLength(@RequestParam String n) {
        try {
            int number = Integer.parseInt(n);
            if (number < 0) {
                throw new IllegalArgumentException("Input must be a non-negative number.");
            }
            int length = collatzService.calculateCollatzSequenceLength(number);
            return ResponseEntity.ok("Collatz sequence length for " + number + " is " + length);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Invalid input: " + n + " is not a valid number.");
        }
    }
}

