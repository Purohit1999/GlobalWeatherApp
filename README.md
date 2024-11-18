

---

# 🌍 Global Weather App

A comprehensive **Java-based console application** that retrieves real-time weather data for major cities across the globe. This project demonstrates the use of APIs, JSON parsing, and HTTP connections in Java.

---

## 🚀 Features

- 🌐 **Global Weather Data**: Fetches and displays weather data for major cities, including:
  - **Indian Cities**: Mumbai, Delhi, Bengaluru, Kolkata, Chennai, etc.
  - **Global Cities**: New York, London, Tokyo, Paris, Dubai, etc.
- 📡 **Real-Time API Integration**: Leverages the OpenWeatherMap API to fetch accurate weather information.
- 🛠️ **JSON Parsing**: Parses API responses to extract weather details like temperature, humidity, wind speed, and more.
- ⚡ **Error Handling**: Gracefully handles errors for invalid city names or API response issues.
- 📏 **Formatted Output**: Displays weather data neatly in the console with precise formatting.

---

## 📋 How to Use

1. **Run the Program**:
   - Open the project in IntelliJ IDEA or any other Java IDE.
   - Run the `GlobalWeatherApp` class.

2. **Output**:
   - The program will fetch and display the current weather for predefined cities.

---

## 🌦️ Weather Data

For each city, the following weather details are retrieved:
- 🌡️ **Temperature**: Current temperature in Celsius.
- ❄️ **Feels Like**: What the temperature feels like.
- 💧 **Humidity**: Percentage of humidity.
- 🌬️ **Wind Speed**: Wind speed in meters/second.
- ☁️ **Weather Description**: General description (e.g., clear sky, haze, rain).

---

## 🛠️ Project Setup

### Prerequisites:
- Java 8 or higher installed on your system.
- IntelliJ IDEA or any other Java IDE for development.
- An active internet connection for API calls.
- OpenWeatherMap API Key (Free or paid).

### Setting up the API Key:
1. Create an account at [OpenWeatherMap](https://openweathermap.org/).
2. Obtain your free API key from the **API Keys** section in your account.
3. Replace `YOUR_API_KEY` in the `GlobalWeatherApp.java` file with your actual API key.

---

### Run the Application:
1. **Using IntelliJ IDEA**:
   - Open the project in IntelliJ IDEA.
   - Locate the `GlobalWeatherApp` class and run it.

2. **Using the Command Line**:
   - Compile the program:
     ```bash
     javac -cp libs/json-20231013.jar GlobalWeatherApp.java
     ```
   - Run the compiled program:
     ```bash
     java -cp .:libs/json-20231013.jar GlobalWeatherApp
     ```

---

## 🌍 Cities Included

| Region       | Cities                                  |
|--------------|-----------------------------------------|
| **India**    | Mumbai, Delhi, Bengaluru, Kolkata, Chennai, Hyderabad, Ahmedabad, Pune |
| **USA**      | New York, Los Angeles, Chicago          |
| **Europe**   | London, Paris, Berlin                  |
| **Asia**     | Tokyo, Beijing, Singapore, Seoul, Bangkok |
| **Australia**| Sydney                                  |
| **Africa**   | Cape Town                               |
| **Others**   | Dubai, Buenos Aires, Rio de Janeiro     |

---

## ✨ Example Output

### Sample Console Output:
```
Current Weather in Mumbai,IN:
- Temperature: 32.99°C
- Feels Like: 31.85°C
- Humidity: 29%
- Wind Speed: 4.12 m/s
- Description: smoke
---------------------------------------------
Current Weather in London,GB:
- Temperature: 7.76°C
- Feels Like: 6.53°C
- Humidity: 89%
- Wind Speed: 2.06 m/s
- Description: broken clouds
---------------------------------------------
Error: Invalid request for New York,US. Check city name and country code.
```

---

## 💻 Technologies Used

- **Programming Language**: Java
- **Development Environment**: IntelliJ IDEA
- **API**: OpenWeatherMap
- **Libraries**:
  - `java.net.HttpURLConnection`: For HTTP requests.
  - `org.json.JSONObject`: For parsing JSON responses.
  - `java.util.Scanner`: For optional user inputs.
  - `java.text.DecimalFormat`: For formatting numeric output.

---

## 🤝 Contributing

Contributions are welcome! Follow the steps below to contribute:

1. Fork this repository.
2. Create a new branch for your feature:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Added feature description"
   ```
4. Push to your branch:
   ```bash
   git push origin feature-name
   ```
5. Open a Pull Request and describe your changes.

---

## 📜 License

This project is licensed under the **Modified MIT License**. For details, please refer to the [LICENSE](https://github.com/Purohit1999/GlobalWeatherApp/blob/main/LICENSE) file in this repository.


Copyright (c) 2024 [Param Purohit]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software with the following restrictions:

1. Any use of the Software, including modified versions, must give appropriate
   credit to the original author, Param Purohit, by including this notice in the
   source code and documentation.

2. Redistribution of the Software, in its original or modified form, must
include this license in full, without modification.

3. Commercial use of the Software is permitted, provided that the original
author is credited in any public-facing documentation or applications.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

---

## 👤 Author

**[Purohit1999](https://github.com/Purohit1999)**  

---

