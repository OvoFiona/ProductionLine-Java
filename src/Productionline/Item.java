
package Productionline;

import java.util.*;

public interface Item {
    // Constant
    String MANUFACTURER = "OracleProduction";

    // Method to set the production number
    void setProductionNumber(int productionNumber);

    // Method to set the name
    void setName(String name);

    // Method to get the name
    String getName();

    // Method to get the manufacture date
    Date getManufactureDate();

    // Method to get the serial number
    int getSerialNumber();
}


