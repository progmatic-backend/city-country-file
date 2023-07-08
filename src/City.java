public class City {

    private final String name;
    private final String countryCode;
    private final Integer population;
    private Country country;


    public City(String name, String countryCode, Integer population) {
        this.name = name;
        this.countryCode = countryCode;
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", population=" + population +
                ", country=" + country.getName() +
                '}';
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Integer getPopulation() {
        return population;
    }

    public Country getCountry() {
        return country;
    }
}
