package aula11.ex3;

import java.io.*;
import java.util.*;

public class EnergyUsageReport {
    private Map<Integer, Customer> customers;

    public EnergyUsageReport() {
        customers = new HashMap<>();
    }

    public void load(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                int customerId = Integer.parseInt(parts[0].trim());
                List<Double> meterReadings = new ArrayList<>();
                for (int i = 1; i < parts.length; i++) {
                    meterReadings.add(Double.parseDouble(parts[i].trim()));
                }
                Customer customer = new Customer(customerId, meterReadings);
                customers.put(customerId, customer);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    public void removeCustomer(int customerId) {
        customers.remove(customerId);
    }

    public Customer getCustomer(int customerId) {
        return customers.get(customerId);
    }

    public double calculateTotalUsage(int customerId) {
        Customer customer = customers.get(customerId);
        if (customer != null) {
            List<Double> meterReadings = customer.getMeterReadings();
            double totalUsage = 0.0;
            for (Double reading : meterReadings) {
                totalUsage += reading;
            }
            return totalUsage;
        } else {
            throw new IllegalArgumentException("Customer not found.");
        }
    }

    public void generateReport(String filename) throws IOException {
        try (FileWriter writer = new FileWriter("aula11/ex3/" + filename)) {
            for (Customer customer : customers.values()) {
                int customerId = customer.getCustomerId();
                double totalUsage = calculateTotalUsage(customerId);
                writer.write("ID: " + customerId + ", Total Energy Usage: " + totalUsage + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}
