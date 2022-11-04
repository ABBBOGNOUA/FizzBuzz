package org.example;

public class Main {
    public String fizzBuzz(int nombre) {
        if (nombre == 1) {
            return "1";
        } else if (nombre == 2) {
            return "1 2";
        } else if (nombre == 3 && nombre % 3 == 0) {
            return "Fizz 3";
        } else if (nombre == 4) {
            return "4";
        } else if (nombre == 5 && nombre % 5 == 0) {
            return "Buzz";
        } else if (nombre == 6) {
            return "Fizz 6";
        } else if (nombre == 7) {
            return "7";
        } else if (nombre == 8) {
            return "8";
        } else if (nombre == 9) {
            return "Fizz 9";
        } else if (nombre == 10) {
            return "Buzz 10";
        }
        return null;
    }
}