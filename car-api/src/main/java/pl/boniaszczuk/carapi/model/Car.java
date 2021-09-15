package pl.boniaszczuk.carapi.model;


public class Car {

  private long carId;
  private String brand;
  private String model;
  private String color;
  private long productionDate;

  public Car() {
  }

  public Car(long carId, String brand, String model, String color, long productionDate) {
    this.carId = carId;
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.productionDate = productionDate;
  }

  public long getCarId() {
    return carId;
  }

  public void setCarId(long carId) {
    this.carId = carId;
  }


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }


  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  public long getProductionDate() {
    return productionDate;
  }

  public void setProductionDate(long productionDate) {
    this.productionDate = productionDate;
  }

  @Override
  public String toString() {
    return "Cars{" +
            "carId=" + carId +
            ", brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", color='" + color + '\'' +
            ", productionDate=" + productionDate +
            '}';
  }
}
