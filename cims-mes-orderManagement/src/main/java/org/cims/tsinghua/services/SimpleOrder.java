package org.cims.tsinghua.services;

import org.cims.tsinghua.models.ProductionOrder;
import org.springframework.stereotype.Service;

@Service
public class SimpleOrder {
  private ProductionOrder productionOrder;
  
  public void setProductionOrder(ProductionOrder productionOrder){
    this.productionOrder = productionOrder;
  }
  
  public String retriveName(){   
    return productionOrder.getName();
  }
}
