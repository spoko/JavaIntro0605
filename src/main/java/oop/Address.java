package oop;

public class Address {
    private String country;
    private String city;
    private int zipCode;
    private String location;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (!country.isEmpty()){
            this.country = country;
        }else {
            System.out.println("Error: invalid entry for country");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (!city.isEmpty()){
            this.city = city;
        }else {
            System.out.println("Error: invalid entry for city");
        }
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        if (zipCode > 0){
            this.zipCode = zipCode;
        }else {
            System.out.println("Error: Invalid entry for zip code");
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (!location.isEmpty()){
            this.location = location;
        }else {
            System.out.println("Error: invalid entry for location");
        }
    }
}
