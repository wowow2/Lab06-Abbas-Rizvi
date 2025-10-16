package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    /**
     * This method compares two city objects
     * @param city the object to be compared.
     * @return 0, <1, or >1 if two values are equal, a<b, a>b
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * This method checks if two city objects are equal
     * @param o
     * This is the object to be compared
     * @return true if they are same, else false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City city = (City) o;
        return this.city.equals(city.getCityName()) &&
                this.province.equals(city.getProvinceName());
    }

}
