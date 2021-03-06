package ru.job4j.tracker.io;

import ru.job4j.tracker.io.Input;
import ru.job4j.tracker.io.Output;

/**
 * Получение данных из системы ввода до тех пор, пока не введут правильные символы.
 */
public class ValidateInput implements Input {
    private final Output out;
    private final Input in;

    public ValidateInput(Input input, Output out) {
        this.out = out;
        this.in = input;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = in.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}

