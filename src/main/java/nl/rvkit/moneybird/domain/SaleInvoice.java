package nl.rvkit.moneybird.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.micronaut.core.annotation.Introspected;

import java.util.Date;
import java.util.List;

@Introspected
@JsonRootName("sales_invoice")
public class SaleInvoice {
    private String id;
    private String contactId;
    private String invoiceId;
    private String workflowId;
    private String state;
    private Date invoiceDate;
    private Date dueDate;
    private Date sentAt;
    private List<SaleInvoiceLine> details;

    public SaleInvoice() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getSentAt() {
        return sentAt;
    }

    public void setSentAt(Date sentAt) {
        this.sentAt = sentAt;
    }

    @JsonProperty("details_attributes")
    public List<SaleInvoiceLine> getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(List<SaleInvoiceLine> details) {
        this.details = details;
    }
}

