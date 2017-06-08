package org.cims.tsinghua.ContextConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.cims.tsinghua.models.ProductionOrder;
import org.cims.tsinghua.services.SimpleOrder;

@Configuration
public class RootConfig {
  @Bean
  public ProductionOrder productionOrder(){
    ProductionOrder productionOrder = new ProductionOrder();
    productionOrder.setId(0);
    productionOrder.setName("foo");
    productionOrder.setNumber(0);
    return productionOrder;
  }
  
  @Bean
  public SimpleOrder simpleOrder(ProductionOrder productionOrder){
    SimpleOrder simpleOrder = new SimpleOrder();
    simpleOrder.setProductionOrder(productionOrder);
    return simpleOrder;
  }
}
