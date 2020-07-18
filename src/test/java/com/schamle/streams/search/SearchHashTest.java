package com.schamle.streams.search;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SearchHashTest {

    @Test
    void testSearchForHash() {
        String hash = "ad35bb9134a00319d0c34e5cd78e9348a6655660";
        SearchHash searchHash = new SearchHash(0, 999999);
        Optional<Pin> pin = searchHash.returnMatchingPin(hash);
        assertEquals(Optional.of(new Pin("831274", hash)), pin);
    }

}