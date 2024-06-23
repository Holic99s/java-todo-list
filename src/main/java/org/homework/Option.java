package org.homework;

public enum Option {
    ADD("1"), DELETE("2"), FIND("3"), EXIT("4"), NONE("-1");

    private final String value;

    Option(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Option of(String n) {
        for (Option option : Option.values()) {
            if (option.getValue().equals(n)) {
                return option;
            }
        }
        return NONE;
    }
}
