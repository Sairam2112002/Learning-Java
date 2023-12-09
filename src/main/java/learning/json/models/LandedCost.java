package learning.json.models;

import lombok.Data;

import java.util.List;

@Data
public class LandedCost {
    /**
     * Represent product value, unit and total
     */
    private ProductValue productValue;
    /**
     * Represent freight charges details
     */
    private FreightCharge freightCharge;

    /**
     * Represents express charges details
     */
    private List<FeesAndCharges> expressCharges;

    /**
     * Represents duty expenses related to import such as import duty, tax and other regulatory fee
     */
    private Expense importExpense;

    /**
     * Represent the total
     */
    private double totalEstimatedLandedCost;

    /**
     * Represents disclaimer note
     */
    private List<String> disclaimer;

    /**
     * Represent other add on charges
     */
    private double otherCharges;
    /**
     * Represent isExciseDutyDisclaimerApplicable flag
     */
    private Boolean isExciseDutyDisclaimerApplicable;
}
