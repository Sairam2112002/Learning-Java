package learning.json.models;

import lombok.Data;

import java.util.List;

/**Represents other regulatory fee section
 */
@Data
public class OtherRegulatoryFee {

    /**
     * Represents the amount of fee applicable
     */
    private double totalRegulatoryFees;
    /**
     * List of different regulatory fees
     */
    private List<RegulatoryFee> regulatoryFees;

}