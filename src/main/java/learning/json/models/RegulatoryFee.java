package learning.json.models;

import lombok.Data;

/**
 * Class is used to represent different types of regulatory fees
 */
@Data
public class RegulatoryFee {

    /**
     * Represent the name of express charge
     */
    private String name;
    /**
     * Amount of express charge
     */
    private double amount;
    /**
     * formula for regulatory fees
     */
    private String formula;
}