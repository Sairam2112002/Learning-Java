package learning.json.models;

import lombok.Data;

import java.util.List;

/** Represents taxes section
 */
@Data
public class Tax {

    /**
     * Represents total calculation amount of tax section.
     */
    private double totalTaxes;

    /**
     * Represents different tax rates
     */
    private List<DutyTaxRate> taxRates;

}
