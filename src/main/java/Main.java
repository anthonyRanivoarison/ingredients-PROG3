import java.time.Instant;
import java.util.List;

import static java.time.Instant.now;

public class Main {
    public static void main(String[] args) {
//        DataRetriever dataRetriever = new DataRetriever();
//        Dish saladeVerte = dataRetriever.findDishById(1);
//        System.out.println(saladeVerte);
//
//        Dish poulet = dataRetriever.findDishById(2);
//        System.out.println(poulet);
//
//        Dish rizLegume = dataRetriever.findDishById(3);
//        rizLegume.setPrice(100.0);
//        Dish newRizLegume = dataRetriever.saveDish(rizLegume);
//        System.out.println(newRizLegume); // Should not throw exception


//        Dish rizLegumeAgain = dataRetriever.findDishById(3);
//        rizLegumeAgain.setPrice(null);
//        Dish savedNewRizLegume = dataRetriever.saveDish(rizLegume);
//        System.out.println(savedNewRizLegume); // Should throw exception

//        Ingredient laitue = dataRetriever.findIngredientById(1);
//        System.out.println(laitue);
        DataRetriever dataRetriever = new DataRetriever();
//        Order orderOne = dataRetriever.findOrderByReference("ORD001");
//
//        Order newOrder = new Order();
//        newOrder.setId(2);
//        newOrder.setReference("ORD002");
//        List<DishOrder> dishOrderList = orderOne.getDishOrderList();
//        DishOrder newDishOrder = new DishOrder();
//        newDishOrder.setDishdataRetriever.findDishById(2));
//        newDishOrder.setQuantity(1);
//        dishOrderList.add(newDishOrder);
//        newOrder.setDishOrderList(dishOrderList);
//        newOrder.setCreationDatetime(now());
//        Order savedOrder = dataRetriever.saveOrder(newOrder);
//        System.out.println(savedOrder);

//        var ingredient = dataRetriever.findIngredientById(1);
//        System.out.println("Get stock value at [JAVA] : " + ingredient.getStockValueAt(Instant.now()));
//        System.out.println("Get stock value at [SQL] : " + dataRetriever.getStockValueAt(Instant.now(), ingredient.getId()));
          var dish = dataRetriever.findDishById(1);
        System.out.println("Get dish cost [JAVA] : " + dish.getDishCost());
        System.out.println("Get dish cost [SQL]: " + dataRetriever.getCrossMargin(1));
        System.out.println(dataRetriever.getStockStats("JOUR", "2026-01-01 00:00:00", "2026-01-05 00:00:00"));
    }
}
