package model;

public class RegistrationForm {
    private String name;
    private String dateOfConstruction;
    private String country;
    private String city;
    private String shortDescription;
    private String description;
    private String notes;

    public RegistrationForm(){
    }

    public RegistrationForm(String name, String dateOfConstruction, String country, String city, String shortDescription,
                            String description, String notes) {
    this.name = name;
    this.dateOfConstruction = dateOfConstruction;
    this.country = country;
    this.city = city;
    this.shortDescription = shortDescription;
    this.description = description;
    this.notes = notes;
    }

    public String getName(){
        return name;
    }

    public String getDateOfConstruction(){
        return dateOfConstruction;
    }

    public String getCountry(){
        return  country;
    }

    public String getCity(){
        return city;
    }

    public String getShortDescription(){
        return shortDescription;
    }

    public String getDescription(){
        return description;
    }

    public String getNotes() {
        return notes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfConstruction(String dateOfConstruction) {
        this.dateOfConstruction = dateOfConstruction;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
