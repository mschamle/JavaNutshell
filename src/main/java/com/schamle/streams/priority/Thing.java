package com.schamle.streams.priority;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Comparator;

@Builder
@Getter
@ToString
public class Thing {

    String name;
    Status status;
    Priority priority;

    public enum Status {
        DRAFT,
        READY,
        RETIRED,
        DELETED
    }

    public enum Priority {
        LOW(0),
        MEDIUM(5),
        HIGH(10),
        INTERESTING(8),
        PLATINUM(15);

        Priority(int order){ this.order = order; }

        @Getter
        private int order;

        public static Comparator<Thing> compareByOrder() { return Comparator.comparingInt(value -> value.getPriority().getOrder());}
    }

    static class InvalidThingException extends RuntimeException {
        public static final String PRIORITY = "priority";

        private InvalidThingException(String message){super(message);}

        static InvalidThingException fromProblem (String problem){
            return new InvalidThingException(problem);
        }
    }
}
