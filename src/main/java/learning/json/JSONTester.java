package learning.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import learning.json.models.LandedCost;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class JSONTester {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/resources/jsonResponses/landedCost_1.json");
        LandedCost landedCost = objectMapper.readValue(file, LandedCost.class);
        System.out.println();

        String actualString = "36,252,800.00";
        double expectedDouble = landedCost.getProductValue().getTotalValue();

        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
        String expectedString = decimalFormat.format(expectedDouble);

        System.out.println(actualString.equals(expectedString));
    }
}
