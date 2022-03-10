package nl.rvkit.moneybird.domain;

import io.micronaut.core.annotation.Introspected;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Introspected
@NoArgsConstructor
public class TaxRate {
    private String id;
    private String name;
    private String percentage;
}
