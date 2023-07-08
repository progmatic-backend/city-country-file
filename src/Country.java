import java.util.ArrayList;
import java.util.List;

public class Country {
    private final String code;
    private final String name;
    private final String continent;
    private final String region;
    private final String area;
    private final Integer independenceDate;
    private final String population;
    private final String headOfCounty;

    private final List<City> cities = new ArrayList<>();


    public Country(String code, String name, String continent, String region, String area, Integer independenceDate, String population, String headOfCounty) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.area = area;
        this.independenceDate = independenceDate;
        this.population = population;
        this.headOfCounty = headOfCounty;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", area='" + area + '\'' +
                ", independenceDate=" + independenceDate +
                ", population='" + population + '\'' +
                ", headOfCounty='" + headOfCounty + '\'' +
                ", cityCount=" + cities.size() +
                '}';
    }

    public void addCity(City city){
        this.cities.add(city);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getRegion() {
        return region;
    }

    public String getArea() {
        return area;
    }

    public Integer getIndependenceDate() {
        return independenceDate;
    }

    public String getPopulation() {
        return population;
    }

    public String getHeadOfCounty() {
        return headOfCounty;
    }

    public List<City> getCities() {
        return cities;
    }
}
