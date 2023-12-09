package learning.json.models;

import lombok.Data;

import java.util.List;

/**
 * Represents the import duty details
 */
@Data
public class Duty {

    /**
     * Represents the total of all duty rates
     */
    private double totalDuties;

    /**
     * Represents the general duty rate details which can also be used as additional duty rate based on the additional duty rate flag.
     */
    private List<DutyTaxRate> dutyRates;
}
