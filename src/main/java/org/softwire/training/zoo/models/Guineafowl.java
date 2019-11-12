package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Guineafowl extends AbstractAnimal implements SmallAnimal {

    public Guineafowl(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    @Override
    public void feed() {
        System.out.println("cacoww cacooww");
        super.feed();
    }

}
