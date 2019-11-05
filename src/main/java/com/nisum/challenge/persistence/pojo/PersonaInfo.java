package com.nisum.challenge.persistence.pojo;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "tbl_persona_info")
public class PersonaInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Name is mandatory")
    @Pattern(regexp = "[A-Za-z]+")
    private String name;

    @NotBlank(message = "Last Name is mandatory")
    @Pattern(regexp = "[A-Za-z]+")
    private String lastName;

    @NotBlank(message = "Address is mandatory")
    @Pattern(regexp = "[A-Za-z0-9\\s]+")
    private String address;

    private Integer phone;

    @Enumerated(EnumType.STRING)
    private HairColourEnum hairColour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public HairColourEnum getHairColour() {
        return hairColour;
    }

    public void setHairColour(HairColourEnum hairColour) {
        this.hairColour = hairColour;
    }
}
