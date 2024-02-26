package n112787;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class OrderTest {
    public static void main(String[] args) throws FileNotFoundException {
        List<Order> Orders = new ArrayList<>();
        List<Item> items = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader("n112787/pedidos.txt"));
        boolean expresso = false;
        String[] lst = sc.nextLine().split("\t");

        while (sc.hasNextLine()) {
            String[] values = sc.nextLine().split(";");
            String idClient = values[0];
            String idStore = values[1];
            System.out.println(values[2]);
            String[] order = values[2].split("\\|");
            for (String x : values[2].split("\\|")) {

                String[] item = x.split(":");
                String name = item[0];
                double price = Double.parseDouble(item[1]);
                Item item1 = new Item(name, price);
                items.add(item1);
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime dateAndTime = LocalDateTime.parse(values[3], formatter);
            if (Objects.equals(values[4], "expresso")) {
                expresso = true;
            } else {
                expresso = false;
            }

            Order order1 = new Order(idClient, idStore, dateAndTime, items, expresso);
            Orders.add(order1);
        }
        //Adiciomar Pedidos
        OrderManager orderManager = new OrderManager();
        orderManager.addOrder(Orders.get(0));
        orderManager.addOrder(Orders.get(1));
        orderManager.addOrder(Orders.get(2));
        orderManager.printAllOrders();

        //Remover Pedidos
        orderManager.removeOrder(1);
        orderManager.printAllOrders();

        //Procurar Pedidos
        System.out.println(orderManager.searchOrder(2));

        //Calcular Preço
        System.out.println(orderManager.calculateOrderCost(2));

        //Calcular Preço dos pedidos de um Mês

        OrderFile(orderManager);
    }

    public static void OrderFile(OrderManager manager) {
        try (FileWriter writer = new FileWriter("112787/OrderFile.txt")) {
            for (Order x : manager.getOrders()) {
                String clientID = x.getClientId();
                String StoreID = x.getStoreId();
                List<Item> order = x.getItems();
                LocalDateTime dateAndTime = x.getOrderDateTime();
                if (x.isPddExpresso()){
                    writer.write(clientID + ";" + StoreID + ";"+ order + ";"+ dateAndTime + ";"+ "expresso" );
                }
                else {
                    writer.write(clientID + ";" + StoreID + ";"+ order + ";"+ dateAndTime + ";"+ "normal" );
                }
            }
        } catch (IOException e) {
                throw new RuntimeException(e);
        }
    }
}


