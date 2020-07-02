package model;

public class RegistrationFormBuilder {
    private String name;
    private String dateOfConstruction;
    private String country;
    private String city;
    private String shortDescription;
    private String description;
    private String notes;

    public RegistrationFormBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public RegistrationFormBuilder withDateOfConstruction(String dateOfConstruction) {
        this.dateOfConstruction = dateOfConstruction;
        return this;
    }

    public RegistrationFormBuilder withCountry(String country) {
        this.country = country;
        return this;
    }

    public RegistrationFormBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public RegistrationFormBuilder withShortDescription(String shortDescription){
        this.shortDescription = shortDescription;
        return this;
    }

    public RegistrationFormBuilder withDescription(String description){
        this.description = description;
        return this;
    }

    public RegistrationFormBuilder withNotes(String notes){
        this.notes = notes;
        return this;
    }

    public RegistrationForm build(){
        return new RegistrationForm(name, dateOfConstruction, country, city, shortDescription, description, notes);
    }


}
