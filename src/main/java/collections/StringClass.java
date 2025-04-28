package collections;

public class StringClass {
    private String value;

    public StringClass(String value) {
        this.value = value;
    }

    public void initialize(String value) {
        this.value = value;
    }

    public String toUpperCase() {
        return value.toUpperCase();
    }


}

