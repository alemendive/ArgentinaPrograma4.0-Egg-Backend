package com.alemendive;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concurrency {
    public static void main(String[] args) throws IOException {
        //Download webs

        List<String> links = new ArrayList<>();
        links.add("https://www.bbc.com/sport/cricket/65998776");
        links.add("https://www.bbc.com/future/article/20230622-why-do-we-love-ugly-animals");
        links.add("https://www.bbc.com/news/world-africa-65972744");
        links.add("https://www.bbc.co.uk/food/collections/quick_and_easy_dips");
        links.add("https://www.bbc.com/news/uk-northern-ireland-65982715");
        links.add("https://www.bbc.com/sport/cricket/65998776");
        links.add("https://www.bbc.com/future/article/20230622-why-do-we-love-ugly-animals");
        links.add("https://www.bbc.com/news/world-africa-65972744");
        links.add("https://www.bbc.co.uk/food/collections/quick_and_easy_dips");
        links.add("https://www.bbc.com/news/uk-northern-ireland-65982715");


        links.stream().parallel().forEach(link -> getWebContent(link));

        String link = "https://www.bbc.com/";
        String result = getWebContent(link);

    }

    private synchronized static String getWebContent(String link) {
        System.out.println("INIT");
        System.out.println(link);
        try {
            URL url = new URL(link);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            String encoding = conn.getContentEncoding();
            InputStream input = conn.getInputStream();

            Stream<String> lines = new BufferedReader(new InputStreamReader(input))
                    .lines();
            System.out.println("END");
            return lines.collect(Collectors.joining());


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }
}



