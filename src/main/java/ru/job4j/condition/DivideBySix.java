package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int num) {
        String rsl;
        if (num % 2 == 0 && num % 3 == 0) {
            rsl = "The number divides by 6.";
        } else if (num % 3 == 0 && num % 2 != 0) {
            rsl = "The number divides by 3, but it isn't the even number.";
        } else if (num % 3 != 0 && num % 2 == 0) {
            rsl = "The number doesn't divide by 3, but it is the even number.";
        } else {
            rsl = "The number doesn't divide by 3 and it isn't the even number.";
        }
        return rsl;
    }
}
