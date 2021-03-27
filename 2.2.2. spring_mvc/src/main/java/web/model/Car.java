package web.model;

public class Car {
    private String VIN;
    private String model;
    private int productionYear;

    public Car(String VIN, String model, int productionYear) {
        this.VIN = VIN;
        this.model = model;
        this.productionYear = productionYear;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
