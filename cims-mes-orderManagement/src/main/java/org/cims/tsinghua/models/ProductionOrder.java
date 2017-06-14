package org.cims.tsinghua.models;

import java.util.Date;

public class ProductionOrder {
  private Integer orderID;
  private String orderSerialNumber;
  private String productName;
  private Integer productQuantity;
  private Date expectedStartDate;
  private Date expectedEndDate;
  private Integer priority;
  
  public void setOrderID(Integer orderID){
    this.orderID = orderID;
  }
  public void setOrderSerialNumber(String orderSerialNumber){
    this.orderSerialNumber = orderSerialNumber;
  }
  public void setProductName(String productName){
    this.productName = productName;
  }
  public void setProductQuantity(Integer productQuantity){
    this.productQuantity = productQuantity;
  }
  public void setExpectedStartDate(Date expectedStartDate){
    this.expectedStartDate = expectedStartDate;
  }
  public void setExpectedEndDate(Date expectedEndDate){
    this.expectedEndDate = expectedEndDate;
  }
  
  public Integer getOrderID(){
    return this.orderID;
  }
  public String getOrderSerialNumber(){
    return this.orderSerialNumber;
  }
  public String getProductName(){
    return this.productName;
  }
  public Integer getProductQuantity(){
    return this.productQuantity;
  }
  public Date getExpectedStartDate(){
    return this.expectedStartDate;
  }
  public Date getExpectedEndDate(){
    return this.expectedEndDate;
  }
  public Integer getPriority(){
    return this.priority;
  }
  
  @Override
  public String toString(){
    return "Order ID:" + orderID + "\n" + "Order Serial Number" + orderSerialNumber + "\n" + "Product Name:" + productName;
  }
}
