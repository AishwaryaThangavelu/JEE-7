package aish.vaishno.hibernatesample;

import java.util.List;


/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args )
    {
       FoodOrderDao foodOrderDao=new FoodOrderDao();
     /*  List<FoodOrder> foodOrderList=foodOrderDao.getFoodOrderList();
        for (FoodOrder foodOrder : foodOrderList) {
            System.out.println("Food Order: "+foodOrder);
        }
    
        System.out.println(foodOrderDao.getParticularFoodOrder(3l));
        FoodOrder foodOrder=new FoodOrder();
        foodOrder.setId(3l);
        foodOrder.setItemName("DHUMM BRIYANI");
        System.out.println("Update Result: "+foodOrderDao.updateFoodOrder(foodOrder));
              */
        FoodOrder foodOrder=new FoodOrder();
        foodOrder.setId(3l);
        System.out.println("result : ");
        foodOrderDao.getListThroughGetLoad();
    }
}
