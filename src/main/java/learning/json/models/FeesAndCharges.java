package learning.json.models;

import lombok.Data;

/** Represents DHL express charges when user selects express charges while adding related costs.
 */
@Data
public class FeesAndCharges {

    /**
     * Represent the name of express charge
     */
    private String name;
    /**
     * Amount of express charge
     */
    private double amount;
    /**
     * Represent the currency of charge
     */
    private String currency;
}
