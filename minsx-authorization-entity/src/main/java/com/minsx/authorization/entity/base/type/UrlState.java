package com.minsx.authorization.entity.base.type;

public enum UrlState {

    ENABLE(1), DISABLE(-1), UNKNOWN(0);

    Integer value;

    UrlState(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public static UrlState getUrlState(Integer value) {
        switch (value) {
            case 1:
                return ENABLE;
            case -1:
                return DISABLE;
            default:
                return UNKNOWN;
        }
    }
}
