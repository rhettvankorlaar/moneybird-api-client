package nl.rvkit.moneybird;

import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.jackson.annotation.JacksonFeatures;
import nl.rvkit.moneybird.domain.Contact;
import nl.rvkit.moneybird.domain.SaleInvoice;
import nl.rvkit.moneybird.domain.TaxRate;
import nl.rvkit.moneybird.domain.Workflow;

import java.util.List;

import static com.fasterxml.jackson.databind.SerializationFeature.WRAP_ROOT_VALUE;

@Client(MoneyBirdConfiguration.MONEYBIRD_API_URL)
@JacksonFeatures(enabledSerializationFeatures = WRAP_ROOT_VALUE)
public interface MoneyBirdApiClient {

    @Get(MoneyBirdConfiguration.Routes.SALES_INVOICES)
    List<SaleInvoice> getAllSalesInvoices();

    @Get(MoneyBirdConfiguration.Routes.GET_SALES_INVOICE_BY_ID)
    SaleInvoice getSalesInvoiceById(@PathVariable String id);

    @Post(MoneyBirdConfiguration.Routes.SALES_INVOICES)
    SaleInvoice createSalesInvoice(@Body SaleInvoice invoice);

    @Patch(MoneyBirdConfiguration.Routes.SEND_SALES_INVOICE)
    SaleInvoice sendSalesInvoice(@PathVariable String id);

    @Get(MoneyBirdConfiguration.Routes.CONTACTS)
    List<Contact> getAllContacts();

    @Get(MoneyBirdConfiguration.Routes.GET_CONTACT_BY_ID)
    Contact getContactById(@PathVariable String id);

    @Get(MoneyBirdConfiguration.Routes.TAX_RATES)
    List<TaxRate> getAllTaxRates();

    @Get(MoneyBirdConfiguration.Routes.WORKFLOWS)
    List<Workflow> getAllWorkflows();

}
