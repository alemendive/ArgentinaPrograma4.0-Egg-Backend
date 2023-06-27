package com.alemendive;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class VariablesAtomicas2 {
    private static Map<String, Double> pricesByAirline;

    public static void main(String[] args) {
        init();

        String from = "BCN";
        String to = "JFK";

        Double lowestPrice = getLowestPrice(from, to);
        Double avgPrice = getAvgPrice(from, to);

        System.out.println("Lowest Price: " + lowestPrice);
        System.out.println("Avg Price: " + avgPrice);
    }

    private static Double getLowestPrice(String from, String to) {
        AtomicReference<Double> lowestPrice = new AtomicReference<>(null);
        pricesByAirline.keySet().stream().parallel().forEach(airline -> {
            Double price = getPriceTrip(airline, from, to);
            if (lowestPrice.get() == null || price < lowestPrice.get())
                lowestPrice.set(price);
        });
        return lowestPrice.get();
    }

    private static Double getAvgPrice(String from, String to) {
        AtomicReference<Double> sumPrice = new AtomicReference<>(0.0);
        AtomicInteger countAirlines = new AtomicInteger(0);
        pricesByAirline.keySet().stream().parallel().forEach(airline -> {
            Double price = getPriceTrip(airline, from, to);
            Double result = sumPrice.get() + price;
            sumPrice.set(result);
            countAirlines.incrementAndGet();
        });
        return sumPrice.get() / countAirlines.get();
    }

    private static void init() {
        pricesByAirline = new HashMap<>();
        pricesByAirline.put("Iberia", 23.0);
        pricesByAirline.put("Aerolineas", 25.0);
        pricesByAirline.put("Latam", 30.0);
        pricesByAirline.put("Gol", 35.0);
        pricesByAirline.put("Air France", 40.0);
        pricesByAirline.put("Ryanair", 45.0);
        pricesByAirline.put("United Airlines", 50.0);
        pricesByAirline.put("Qatar Airways", 55.0);
        pricesByAirline.put("Lufthansa", 60.0);
        pricesByAirline.put("KLM", 65.0);
        pricesByAirline.put("Emirates", 70.0);
        pricesByAirline.put("TUI Fly Belgium", 75.0);
        pricesByAirline.put("Air China", 80.0);
        pricesByAirline.put("Air India", 85.0);

    }

    private static Double getPriceTrip(String airline, String from, String to) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return pricesByAirline.get(airline);
    }
}
