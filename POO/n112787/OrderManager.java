package n112787;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class OrderManager {
    private Collection<Order> orders = new ArrayList<>();

    public OrderManager() {

    }
    public void addOrder(Order order){
        orders.add(order);
    }

    public void removeOrder(int id){
        for (Order order : orders){
            if (order.getId() == id){
                orders.remove(order);
            }
        }
    }
    public Order searchOrder(int id){
        for (Order order : orders){
            if (order.getId() == id){
                return order;
            }
        }
        return null;
    }
    public double calculateOrderCost(int id) {
        Order order = searchOrder(id);
        if (order != null){
            return order.calculateCost();
        }
        return -1;
    }
    public double calculateOrderCostMonth(int month) {
        orders.stream().filter(
                order -> order.getOrderDateTime().getMonthValue() == month).forEach(
                Order::calculateCost);

        return 0;
    }

    public void printAllOrders(){
        Iterator<Order> it = orders.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public Order[] getOrders() {
        return (Order[]) orders.toArray();
    }
}

