package com.example.counter.models;

import java.util.Map;

public class CountResult {

    private Map<String, Long> counts;

    public Map<String, Long> getCounts() {
        return counts;
    }

    public void setCounts(Map<String, Long> counts) {
        this.counts = counts;
    }
}
