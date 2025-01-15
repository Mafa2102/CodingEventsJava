package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

import java.util.Objects;

@Entity
public class Event extends AbstractEntity {


    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @NotBlank(message="Location cannot be left blank.")
    @NotNull
    private String location;

    private EventType type;

    public Event(String name, String description, String contactEmail, String location, EventType type) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.location = location;
        this.contactEmail = contactEmail;

    }

    public Event(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public @Email String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(@Email String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public  String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }



    @Override
    public String toString() {
        return name;
    }

}
