package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Elephant extends AbstractAnimal implements LargeAnimal, CanBeGroomed, CanHaveMuckSweptOut {

    private LocalDateTime lastGroomed;
    private LocalDateTime lastSwept;

    public Elephant(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    @Override
    public void beGroomed() {
        lastGroomed = LocalDateTime.now();
    }

    @Override
    public void beSwept() {
        lastSwept = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}; Last Groomed {1}", super.toString(), lastGroomed);
    }

}
