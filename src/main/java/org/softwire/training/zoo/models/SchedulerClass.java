package org.softwire.training.zoo.models;

import java.util.List;

public abstract class SchedulerClass {

    public abstract void assignJobs(List<Keeper<? extends Animal>> keepers);

}
