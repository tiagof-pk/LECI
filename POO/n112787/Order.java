package n112787;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id = 0;
    private int nextID;
    private double price;
    private String storeId;
    private String clientId;
    private LocalDateTime orderDateTime;
    private List<Item> lst = new ArrayList<>();
    private boolean pddExpresso;


    public Order(String storeId, String clientId, LocalDateTime orderDateTime, List<Item> lst, boolean pddExpresso) {
        nextID++;
        this.id=nextID;
        this.storeId = storeId;
        this.clientId = clientId;
        this.orderDateTime = orderDateTime;
        this.lst = lst;
        this.pddExpresso = pddExpresso;
    }
    public double calculateCost(){
        for(Item x : lst){
            price+= x.getPrice();
        }
        return price;
    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getStoreId(){
        return storeId;
    }

    public void setStoreId(String storeId){
        this.storeId = storeId;
    }

    public String getClientId(){
        return clientId;
    }

    public void setClientId(String clientId){
        this.clientId = clientId;
    }

    public LocalDateTime getOrderDateTime(){
        return orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime){
        this.orderDateTime = orderDateTime;
    }

    public boolean isPddExpresso() {
        return pddExpresso;
    }

    public void setPddExpresso(boolean pddExpresso) {
        this.pddExpresso = pddExpresso;
    }

    public List<Item> getItems() {
        return lst;
    }

    public void setItems(List<Item> lst) {
        this.lst = lst;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order: " +id +
                "\n price=" + calculateCost() +
                "\n storeId='" + storeId + '\'' +
                "\n clientId='" + clientId + '\'' +
                "\n orderDateTime=" + orderDateTime +
                "\n lst=" + lst +
                "\n pddExpresso=" + pddExpresso;
    }
}
