package org.cims.tsinghua.mappers;

import java.util.List;
import org.cims.tsinghua.models.ProductionOrder;

public interface ProductionOrderMapper {
  public List<ProductionOrder> selectAllProductionOrder();
  public ProductionOrder selectProductionOrderByID(Integer orderID);
  public void insertProductionOrder(ProductionOrder productionOrder);
}
