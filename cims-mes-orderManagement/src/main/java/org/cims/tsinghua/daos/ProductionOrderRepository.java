package org.cims.tsinghua.daos;

import java.util.List;
import org.cims.tsinghua.models.ProductionOrder;

public interface ProductionOrderRepository {
  public List<ProductionOrder> selectAllProductionOrder();
  public ProductionOrder selectProductionOrderByID(Integer orderID);
  public void insertProductionOrder(ProductionOrder productionOrder);
}




