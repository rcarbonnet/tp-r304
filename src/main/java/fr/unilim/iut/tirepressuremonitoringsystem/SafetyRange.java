package fr.unilim.iut.tirepressuremonitoringsystem;

public class SafetyRange {
    private double lowThreshold;
    private double highThreshold;

    public SafetyRange(double lowThreshold, double highThreshold) {
        this.lowThreshold = lowThreshold;
        this.highThreshold = highThreshold;
    }

    public boolean contains(double value) {
        return value >= lowThreshold && value <= highThreshold;
    }

    public boolean doesNotContain(double value) {
        return !contains(value);
    }
}