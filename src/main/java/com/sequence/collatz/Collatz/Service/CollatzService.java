package com.sequence.collatz.Collatz.Service;

import org.springframework.stereotype.Service;

@Service
public class CollatzService {

    public int calculateCollatzSequenceLength(int n) {
        // Calculation for the sequence length
        int length = 1;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            length++;
        }
        return length;
    }
}

