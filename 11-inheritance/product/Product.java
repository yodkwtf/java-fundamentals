package product;

public abstract class Product {
  private double price;
  private String color;
  private String brand;

  // # Constructor
  public Product(double price, String color, String brand) {
    this.price = price;
    this.color = color;
    this.brand = brand;
  }

  // # Getters
  public double getPrice() {
    return this.price;
  }

  public String getColor() {
    return this.color;
  }

  public String getBrand() {
    return this.brand;
  }

  // # Setters
  public void setPrice(double price) {
    this.price = price;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  // # Methods
  public void fold() {
    System.out.println("Folding my " + this.brand + " " + this.color + " " + this.getClass().getSimpleName() + "...");
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName().toUpperCase() + ": " + this.brand + " " + this.color + " "
        + this.getClass().getSimpleName() + " for $" + this.price + ".";
  }

  public abstract void wear();
}
