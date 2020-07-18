package com.schamle.streams.search;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Builder
@EqualsAndHashCode
public class Pin {
    String pin;
    String hash;
}
