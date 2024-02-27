package n112787;

import java.util.List;

public class StandartOrderCalculator implements OrderCostCalculator{
    private double price;

    @Override
    public double calculateOrderCost(Order order){
        List<Item> lst = order.getItems();
        for(Item x : lst){
            price+= x.getPrice();
        }
        if (order.isPddExpresso()){
            price = price + price*0.3;
            return price;
        }
        else{
            return price;
        }
    }
}
