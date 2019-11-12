package org.softwire.training.zoo.models;

import java.util.List;

public class SchedulerClass {

    public void assignJobs(List<Keeper<? extends Animal>> keepers) {
        keepers.forEach(keeper -> keeper.getResponsibleAnimals().forEach(keeper::feed));
    }

}
