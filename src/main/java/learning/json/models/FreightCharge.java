package learning.json.models;

import lombok.Data;

/** Represent the freight and insurance charges section in add related costs
 */
@Data
public class FreightCharge {

    /**
     * Represents freight charge in add related costs
     */
    private double freight;

    /**
     * Represents insurance charge in add related costs
     */
    private double insurance;

}
