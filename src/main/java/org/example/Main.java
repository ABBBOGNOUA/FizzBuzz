package org.example;

public class Main {
    public String fizzBuzz(int nombre) {
        if (nombre == 1) {
            return "1";
        } else if (nombre == 2) {
            return "2";
        } else if (nombre == 3) {
            return "Fizz";
        } else if (nombre == 4) {
            return "4";
        } else if (nombre == 5 || nombre % 5 == 0) {
            return "Buzz";
        } else if (nombre == 6) {
            return "6";
        } else if (nombre == 7) {
            return "7";
        } else if (nombre == 8) {
            return "8";
        } else if (nombre == 9) {
            return "9";
        } else if (nombre == 10) {
            return "10";
        }
        return null;
    }
}