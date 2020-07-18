package com.schamle.streams.priority;

import com.schamle.streams.priority.BunchOfThings;
import com.schamle.streams.priority.Thing;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class BunchOfThingsTest {

    @Test
    void getHighestPriorityThing() {
        BunchOfThings things = BunchOfThings.builder().things(getSomeThings()).build();
        Thing best = things.getHighestPriorityThing();
        assertEquals(Thing.Priority.PLATINUM, best.getPriority());
    }

    private Collection<Thing> getSomeThings(){
        return Arrays.asList(
                Thing.builder().name("crap").status(Thing.Status.DRAFT).priority(Thing.Priority.LOW).build(),
                Thing.builder().name("ok stuff").status(Thing.Status.READY).priority(Thing.Priority.MEDIUM).build(),
                Thing.builder().name("nice!").status(Thing.Status.RETIRED).priority(Thing.Priority.INTERESTING).build(),
                Thing.builder().name("sweet!").status(Thing.Status.DELETED).priority(Thing.Priority.HIGH).build(),
                Thing.builder().name("awesome!").status(Thing.Status.READY).priority(Thing.Priority.PLATINUM).build()
        );
    }

}