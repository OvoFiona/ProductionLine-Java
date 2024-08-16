
package Productionline;

import java.util.*;

public abstract class Product implements Item {

    private int serialNumber;
    private final String manufacturer = MANUFACTURER;
    private final Date manufacturedOn;
    private String name;
    private static int currentProductionNumber = 1;

    public Product(String name) {
        this.name = name;
        this.serialNumber = currentProductionNumber++;
        this.manufacturedOn = new Date();
    }

    @Override
    public void setProductionNumber(int productionNumber) {
        this.serialNumber = productionNumber;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getManufactureDate() {
        return manufacturedOn;
    }

    @Override
    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer +
               "\nSerial Number: " + serialNumber +
               "\nDate: " + manufacturedOn +
               "\nName: " + name;
    }
}



