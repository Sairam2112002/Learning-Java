package learning.json.models;

import lombok.Data;

/**
 * Class is used to represent product price, units and total value
 */
@Data
public class ProductValue {
    /**
     * Represents the price of the product.
     */
    private double productPrice;

    /**
     * Represents the quantity of the product.
     */
    private int totalUnits;

    /**
     * Represents the totalValue based on product price and no of units.
     */
    private double totalValue;
}
