package org.softwire.training.zoo.services;

import org.softwire.training.zoo.models.Animal;
import org.softwire.training.zoo.models.Keeper;
import org.softwire.training.zoo.models.Scheduler;
import org.softwire.training.zoo.models.SchedulerClass;

import java.util.List;

public class FeedingScheduler extends SchedulerClass {
    private static FeedingScheduler instance;

    private FeedingScheduler() {
    }

    public static FeedingScheduler getInstance() {
        if (instance == null) {
            instance = new FeedingScheduler();
        }
        return instance;
    }

}
