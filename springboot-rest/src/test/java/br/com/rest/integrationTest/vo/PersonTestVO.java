package br.com.rest.integrationTest.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class PersonTestVO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;
    private String address;
    private String gender;
    private Boolean enabled;

    public PersonTestVO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastnName) {
        this.lastName = lastnName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonTestVO that = (PersonTestVO) o;
        return Objects.equals(id, that.id) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(address, that.address) && Objects.equals(gender, that.gender) && Objects.equals(enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, address, gender, enabled);
    }
}
