package nl.rvkit.moneybird.domain;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class SaleInvoiceLine {
    private String id;
    private String amount;
    private Double amountDecimal;
    private String description;
    private String taxRateId;
    private Double price;
    private String period;

    public SaleInvoiceLine() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Double getAmountDecimal() {
        return amountDecimal;
    }

    public void setAmountDecimal(Double amountDecimal) {
        this.amountDecimal = amountDecimal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTaxRateId() {
        return taxRateId;
    }

    public void setTaxRateId(String taxRateId) {
        this.taxRateId = taxRateId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
