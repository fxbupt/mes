package org.cims.tsinghua.model;

public class ProductionOrder {
  private Integer productId; // the "productId" identify the order
  private String productName; // the "productName" means the name of product
  private Integer productNumber; // the "productNumber" means the number of product

  public ProductionOrder(Integer id, String name, Integer number) {
    this.productId = id;
    this.productName = name;
    this.productNumber = number;
  }

  public void setId(Integer id) {
    this.productId = id;
  }

  public void setName(String name) {
    this.productName = name;
  }

  public void setNumber(Integer number) {
    this.productNumber = number;
  }

  public Integer getId() {
    return this.productId;
  }

  public String getName() {
    return this.productName;
  }

  public Integer getNumber() {
    return this.productNumber;
  }

  @Override
  public String toString() {
    return "id: " + productId + "/n" + "name: " + productName + "/n" + "number: " + productNumber;
  }
}
