package nl.rvkit.moneybird.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
public class Workflow {
    private String id;
    private String type;
    private String name;
    @JsonProperty("default")
    private Boolean defaultValue;
    private String currency;
    private String language;
    private Boolean active;
    private Boolean pricesAreInclTax;

    public Workflow() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Boolean defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getPricesAreInclTax() {
        return pricesAreInclTax;
    }

    public void setPricesAreInclTax(Boolean pricesAreInclTax) {
        this.pricesAreInclTax = pricesAreInclTax;
    }
}
