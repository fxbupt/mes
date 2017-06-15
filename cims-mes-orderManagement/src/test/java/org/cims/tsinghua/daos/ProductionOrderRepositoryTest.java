package org.cims.tsinghua.daos;

import org.cims.tsinghua.ContextConfig.RootConfig;
import org.cims.tsinghua.models.ProductionOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.transaction.annotation.Transactional;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class ProductionOrderRepositoryTest {
  @Autowired
  private ProductionOrderRepository producitonOrderRepository;
  
  @Test
  //@Transactional
  public void testSelectProductionOrderByID(){
    //assertThat(this.producitonOrderRepository.selectProductionOrderByID(1), instanceOf(ProductionOrder.class));
    ProductionOrder productionOrder = this.producitonOrderRepository.selectProductionOrderByID(1);
    System.out.println(productionOrder);
    assertThat(productionOrder.getOrderID(), equalTo(1));
    assertThat(productionOrder.getProductName(), equalToIgnoringCase("foo"));
  }
}
