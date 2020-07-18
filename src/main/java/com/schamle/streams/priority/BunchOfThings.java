package com.schamle.streams.priority;

import lombok.Builder;

import java.util.Collection;

@Builder
public class BunchOfThings {
    Collection<Thing> things;

    /**
     * Return highest priority item using comparator
     * @return collection of things
     */
    public Thing getHighestPriorityThing() {
        return things.stream().max(Thing.Priority.compareByOrder())
                .orElseThrow(() -> Thing.InvalidThingException.fromProblem(Thing.InvalidThingException.PRIORITY));
    }
}
