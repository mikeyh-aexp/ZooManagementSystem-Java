package org.softwire.training.zoo.services;

import org.softwire.training.zoo.models.*;

import java.util.List;

public class GroomingScheduler implements Scheduler {
    private static GroomingScheduler instance;

    private GroomingScheduler() {
    }

    public static GroomingScheduler getInstance() {
        if (instance == null) {
            instance = new GroomingScheduler();
        }
        return instance;
    }

    public void assignJobs(List<Keeper<? extends Animal>> keepers) {
        keepers.forEach(keeper -> keeper.getResponsibleAnimals().forEach(animal -> {
            if (animal instanceof CanBeGroomed) {
                keeper.groom((CanBeGroomed) animal);
            }
        }));
    }

}
