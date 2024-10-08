package dev.mollyzhang.activeto.business.domain.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Locale;

public enum LanguageFilterEnum {
    En(Locale.CANADA.getLanguage()), Fr(Locale.CANADA_FRENCH.getLanguage());

    private String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static LanguageFilterEnum of(String value) {
        if (null == value || value.isEmpty()) {
            return null;
        }
//        TODO: Is there a better way to handle the accept-language value except for contains? e.g. en-US,en;q=0.8,*;q=0.7
        for (LanguageFilterEnum item : LanguageFilterEnum.values()) {
            if (value.toLowerCase().contains(item.getValue().toLowerCase())) {
                return item;
            }
        }
        throw new IllegalArgumentException("Unknown language option: " + value);
    }

    LanguageFilterEnum(String value) {
        this.value = value;
    }
}