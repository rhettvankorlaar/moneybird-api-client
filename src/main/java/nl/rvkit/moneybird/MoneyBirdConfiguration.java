package nl.rvkit.moneybird;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.Requires;

@ConfigurationProperties(MoneyBirdConfiguration.PREFIX)
@Requires(property = MoneyBirdConfiguration.PREFIX)
public class MoneyBirdConfiguration {
    public static final String PREFIX = "moneybird";
    public static final String MONEYBIRD_API_URL = "https://moneybird.com/api/v2";
    public static final String SALES_INVOICES = "/sales_invoices";
    public static String token;
    private String user;


    public String getUser() {
        return user;
    }

    public void setUser(String userId) {
        this.user = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        MoneyBirdConfiguration.token = token;
    }

    public static  class Routes{
        private static final String ID = "/{id}";

        public static final String SALES_INVOICES = "/sales_invoices";
        public static final String GET_SALES_INVOICE_BY_ID = SALES_INVOICES + ID;
        public static final String SEND_SALES_INVOICE = SALES_INVOICES + ID + "/send_invoice";

        public static final String CONTACTS = "/contacts";
        public static final String GET_CONTACT_BY_ID = CONTACTS + ID;

        public static final String TAX_RATES = "/tax_rates";

        public static final String WORKFLOWS = "/workflows";
    }
}
