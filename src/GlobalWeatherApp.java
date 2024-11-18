import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GlobalWeatherApp {

    public static void main(String[] args) {
        // Replace with your actual OpenWeatherMap API key
        String apiKey = "YOUR_API_KEY";

        String[] cities = {
                "Mumbai,IN", "Delhi,IN", "Bengaluru,IN", "Kolkata,IN", "Chennai,IN",
                "Hyderabad,IN", "Ahmedabad,IN", "Pune,IN",
                "New York,US", "Los Angeles,US", "Chicago,US",
                "London,GB", "Tokyo,JP", "Sydney,AU", "Paris,FR",
                "Berlin,DE", "Moscow,RU", "Beijing,CN",
                "Cape Town,ZA", "Toronto,CA", "Mexico City,MX",
                "Rio de Janeiro,BR", "Singapore,SG", "Dubai,AE",
                "Jakarta,ID", "Istanbul,TR", "Seoul,KR",
                "Bangkok,TH", "Buenos Aires,AR"
        };

        // Fetch and display weather data for each city
        for (String city : cities) {
            fetchWeatherData(city, apiKey);
            try {
                // Add a delay to avoid exceeding API rate limits (60 requests/min for free tier)
                Thread.sleep(1000); // 1-second delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void fetchWeatherData(String city, String apiKey) {
        String weatherUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

        try {
            // Establish HTTP connection
            HttpURLConnection connection = (HttpURLConnection) new URL(weatherUrl).openConnection();
            connection.setRequestMethod("GET");

            // Check the response code
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Parse the JSON response
                JSONObject jsonResponse = new JSONObject(response.toString());

                // Extract weather data
                JSONObject main = jsonResponse.getJSONObject("main");
                double temperature = main.getDouble("temp");
                double feelsLike = main.getDouble("feels_like");
                int humidity = main.getInt("humidity");

                JSONObject wind = jsonResponse.getJSONObject("wind");
                double windSpeed = wind.getDouble("speed");

                String description = jsonResponse.getJSONArray("weather")
                        .getJSONObject(0).getString("description");

                // Display the weather data
                System.out.println("Current Weather in " + city + ":");
                System.out.println("- Temperature: " + temperature + "°C");
                System.out.println("- Feels Like: " + feelsLike + "°C");
                System.out.println("- Humidity: " + humidity + "%");
                System.out.println("- Wind Speed: " + windSpeed + " m/s");
                System.out.println("- Description: " + description);
                System.out.println("---------------------------------------------");
            } else if (responseCode == 400) {
                // Handle bad requests (invalid city names or country codes)
                System.out.println("Error: Invalid request for " + city + ". Check city name and country code.");
            } else {
                // Handle other error responses
                System.out.println("Error: Failed to retrieve weather data for " + city + ". Response Code: " + responseCode);
            }
        } catch (Exception e) {
            // Handle network or other exceptions
            System.out.println("Error: Unable to connect to the Weather API for " + city + ".");
            e.printStackTrace();
        }
    }
}
