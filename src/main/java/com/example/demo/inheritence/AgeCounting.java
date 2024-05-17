package com.example.demo.inheritence;

/**
 * @author shyam CH
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class AgeCounting {
    public static void main(String[] args) {
            try {
                String url = "https://coderbyte.com/api/challenges/json/age-counting";
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("GET");

                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                String data = response.toString().split(":")[1];
                data=   data.replace("}","").replace("\"","");
                String[] items = data.split(", ");
                int count = 0;
                for (String item : items) {
                    if (item.startsWith("age=")) {
                      // Integer age = Integer.parseInt(item.substring(4));
                       Integer age = Integer.parseInt(item.split("=")[1]);
                        System.out.println(age);
                       // System.out.println(item);
                        if (age >= 50) {
                            count++;
                        }
                    }
                }
                System.out.println(count);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
