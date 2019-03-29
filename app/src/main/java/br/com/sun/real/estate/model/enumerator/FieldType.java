package br.com.sun.real.estate.model.enumerator;

/**
 * Created by lucienj on 15/03/2019.
 */
public enum FieldType {
    DECIMAL("Decimal"),
    NUMBER("Number"),
    TEXT("Text"),
    OPTIONS("Options");

    private final String value;

    FieldType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
