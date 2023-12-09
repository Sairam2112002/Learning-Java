package learning.json.models;

import lombok.Data;

/**
 * Represents the tax rate section
 */
@Data
public class DutyTaxRate {

    /**
     * Represents the percentage of tax
     */
    private double rate;

    /**
     * Represents the name for the tax.
     */
    private String name;

    /**
     * Represents the formula for the tax.
     */
    private String formula;

}
