package learning.json.models;

import lombok.Data;

/** Represents expenses including duties, taxes and other regulatory fee.
 */
@Data
public class Expense {

    /**
     * Represents duties
     */
    private Duty duty;

    /**
     * Represent tax section
     */
    private Tax tax;

    /**
     * Represents other regulatory fee section
     */
    private OtherRegulatoryFee otherRegulatoryFee;

    /**
     * Represents CIF
     */
    private DutyTaxRate costInsuranceFrieght;

}
