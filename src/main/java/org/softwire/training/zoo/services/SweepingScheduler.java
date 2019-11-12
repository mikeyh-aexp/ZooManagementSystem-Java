package org.softwire.training.zoo.services;

import org.softwire.training.zoo.models.*;

import java.util.List;

public class SweepingScheduler extends SchedulerClass {

    private static SweepingScheduler instance;

    private SweepingScheduler() {
    }

    public static SweepingScheduler getInstance() {
        if (instance == null) {
            instance = new SweepingScheduler();
        }
        return instance;
    }

    @Override
    public void assignJobs(List<Keeper<? extends Animal>> keepers) {
        keepers.forEach(keeper -> keeper.getResponsibleAnimals().forEach(animal -> {
            if (animal instanceof CanHaveMuckSweptOut) {
                keeper.swept((CanHaveMuckSweptOut) animal);
            }
        }));
    }

}
