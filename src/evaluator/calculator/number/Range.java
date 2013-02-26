package evaluator.calculator.number;

class Range {

    private Double upperLimit;
    private Double lowerLimit;

    public Range() {
        this(null, null);
    }

    public Range(Double upperLimit, Double lowerLimit) {
        this.upperLimit = upperLimit == null ? Double.MAX_VALUE : upperLimit;
        this.lowerLimit = lowerLimit == null ? Double.MIN_VALUE : lowerLimit;
    }

    public void setUpperLimit(Double upperLimit, Double lowerLimit) {
        this.upperLimit = upperLimit;
        this.lowerLimit = lowerLimit;
    }

    public Double getUpperLimit() {
        return upperLimit;
    }

    public Double getLowerLimit() {
        return lowerLimit;
    }
}
