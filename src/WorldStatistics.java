import java.util.ArrayList;
import java.util.List;

public class WorldStatistics {
    static List<String> citiesAsStrings = FileInputHandler.getLinesOfTextFile("res/city.txt");
    static List<String> countriesAsStrings = FileInputHandler.getLinesOfTextFile("res/country.txt");
    static List<City> cities = new ArrayList<>();
    static List<Country> countries = new ArrayList<>();

    public static void main(String[] args) {
        createCities();
        createCountries();
        connectCitiesAndCountries();

        for (City city : cities) {
            System.out.println(city);
        }

        for (Country country : countries) {
            System.out.println(country);
        }


    }

    private static void createCities() {
        for (String cityLine : citiesAsStrings) {
            String[] cityData = cityLine.split(",");
            cities.add(new City(
                    cityData[0],
                    cityData[1],
                    Integer.parseInt(cityData[2])
            ));
        }
    }

    private static void createCountries() {
        for (String countryLine : countriesAsStrings) {
            String[] countryData = countryLine.split(",");
            countries.add(new Country(
                    countryData[0],
                    countryData[1],
                    countryData[2],
                    countryData[3],
                    countryData[4],
                    countryData[5].equals("NULL") ? -1 : Integer.parseInt(countryData[5]),
                    countryData[6],
                    countryData.length <= 7 ? "" : countryData[7]
            ));
        }
    }

    private static void connectCitiesAndCountries() {
        for (Country country : countries) {
            for (City city : cities) {
                if (city.getCountryCode().equals(country.getCode())) {
                    city.setCountry(country);
                    country.addCity(city);
                }
            }
        }
    }
}
