package nl.rvkit.moneybird.domain;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class TaxRate {
    private String id;
    private String name;
    private String percentage;

    public TaxRate() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }
}
