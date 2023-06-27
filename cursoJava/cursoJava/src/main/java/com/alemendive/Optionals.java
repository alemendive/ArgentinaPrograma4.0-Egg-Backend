package com.alemendive;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();

        countries.add("Argentina");
        countries.add("Brazil");
        countries.add("Spain");
        countries.add("France");
        countries.add("Italy");
        countries.add("Germany");
        countries.add("Portugal");
        countries.add("Greece");
        countries.add("Romania");
        countries.add("Belgium");
        countries.add("Austria");
        countries.add("Sweden");

        Optional<String> country = countries.stream()
                .filter(c -> c.startsWith("Arg")).findFirst();

        country.ifPresent(System.out::println);

    }

   public static void exampleOptional(){
       Optional<Double> result = averageScores(7.0, 8.0, 5.0, 10.0);
       if (result.isPresent()){
           System.out.println(result.get());
       } else {
           System.out.println("No scores");
       }
   }

    public static Optional<Double> averageScores(Double ...scores){
        if (scores.length == 0){
            return Optional.empty();
        }
        double sum = 0;
        for (Double score : scores) sum += score;
        return Optional.of(sum / scores.length);
        }
    }

