package com.schamle.streams.search;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

/**
 * Search through a range of numbers to find a specific hash.
 *
 * Example: bruteforce attack on a hashed pinned code
 */
@AllArgsConstructor
public class SearchHash {
    private final int startRange;
    private final int endRange;


    /**
     * Search through the specified range for an Pin with a matching hash.
     * Uses parallel stream
     * @param hash - the has we are searching for
     * @return Optional of resulting Pin
     */
    public Optional<Pin> returnMatchingPin(String hash){
        List<Integer> range = IntStream.rangeClosed(startRange, endRange).boxed().collect(Collectors.toList());

        return range.parallelStream()
                .map(this::format)
                .map(this::sha1)
                .filter(pin -> pin.getHash().equals(hash))
                .findFirst();

    }


    private String format(Integer input){
        StringBuilder result = new StringBuilder(input.toString());
        while (result.length() < 6){
            result.insert(0, "0");
        }
        return result.toString();
    }

    private Pin sha1(String input) {
        try {
            var md = java.security.MessageDigest.getInstance("SHA1");
            var hash = org.apache.commons.codec.binary.Hex.encodeHexString(md.digest(input.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
            return Pin.builder().pin(input).hash(hash).build();
        } catch (Exception x) {
            throw new RuntimeException(x);
        }
    }
}
