package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Lion extends AbstractAnimal implements LargeAnimal, CanHaveMuckSweptOut {

    private LocalDateTime lastSwept;

    public Lion(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    @Override
    public void beSwept() {
        lastSwept = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}; Last Swept {1}", super.toString(), lastSwept);
    }

}
