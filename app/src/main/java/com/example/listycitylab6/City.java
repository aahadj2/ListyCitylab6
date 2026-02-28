package com.example.listycitylab6;
/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    /**
     * This is the name of the city.
     */
    private String city;
    /**
     * This is the name of the province
     */
    private String province;
    /**
     * This is the constructor for the City class.
     * @param city
     * The name of the city.
     * @param province
     * The name of the province.
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * This returns the name of the city.
     * @return
     * Returns the city name.
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This returns the name of the province.
     * @return
     * Returns the province name.
     *
     */
    String getProvinceName() {
        return this.province;
    }
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }
    }
    //file:///Users/ahadj/Downloads/SELab05/lab-05/ListyCity/javadoc/com/example/listycitylab6/package-summary.html