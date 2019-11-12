package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;

public class Zebra extends AbstractAnimal implements LargeAnimal, CanBeGroomed, CanHaveMuckSweptOut {

    private LocalDateTime lastGroomed;
    private LocalDateTime lastSwept;

    public Zebra(LocalDate dateOfBirth) {
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
        String groom = MessageFormat.format("{0}; Last Groomed {1};", super.toString(), lastGroomed);
        String swept = MessageFormat.format("Last Swept {0}", lastSwept);
        return groom + " " + swept;
    }

}
