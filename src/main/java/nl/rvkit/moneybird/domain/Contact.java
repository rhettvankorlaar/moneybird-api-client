package nl.rvkit.moneybird.domain;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Contact {
    private String id;
    private String companyName;
    private String address1;
    private String zipcode;
    private String city;
    private String phone;
    private String customerId;
    private String taxNumber;
    private String chamberOfCommerce;
    private String bankAccount;
    private String email;
    private String sendInvoicesToAttention;
    private String sendInvoicesToEmail;

    public Contact() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getChamberOfCommerce() {
        return chamberOfCommerce;
    }

    public void setChamberOfCommerce(String chamberOfCommerce) {
        this.chamberOfCommerce = chamberOfCommerce;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSendInvoicesToAttention() {
        return sendInvoicesToAttention;
    }

    public void setSendInvoicesToAttention(String sendInvoicesToAttention) {
        this.sendInvoicesToAttention = sendInvoicesToAttention;
    }

    public String getSendInvoicesToEmail() {
        return sendInvoicesToEmail;
    }

    public void setSendInvoicesToEmail(String sendInvoicesToEmail) {
        this.sendInvoicesToEmail = sendInvoicesToEmail;
    }
}
