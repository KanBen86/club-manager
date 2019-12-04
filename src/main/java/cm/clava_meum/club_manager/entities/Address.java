package cm.clava_meum.club_manager.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Address {

    @Id
    private String id;

    @ManyToOne
    private Person person;

    @Column
    private String zip;

    @Column
    private String street;

    @Column
    private String town;

    @Column
    private String houseNo;

    @Column
    private String country;

    @Column
    private String state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return id.equals(address.id) &&
                Objects.equals(person, address.person) &&
                Objects.equals(zip, address.zip) &&
                Objects.equals(street, address.street) &&
                Objects.equals(town, address.town) &&
                Objects.equals(houseNo, address.houseNo) &&
                Objects.equals(country, address.country) &&
                Objects.equals(state, address.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, person, zip, street, town, houseNo, country, state);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", person=" + person +
                ", zip='" + zip + '\'' +
                ", street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
