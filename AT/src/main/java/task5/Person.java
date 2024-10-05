package task5;
import task7.Address;
import task7.Company;
import task7.Project;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Person")
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean working;
    private long timestamp;

    @ElementCollection
    @CollectionTable(name = "Person_Friends", joinColumns = @JoinColumn(name = "person_id"))
    @Column(name = "friend")
    private List<String> friends;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToMany
    @JoinTable(
            name = "Person_Project",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private List<Project> projects;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean working() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", working=" + working +
                ", timestamp=" + timestamp +
                ", friends=" + friends +
                '}';
    }
}





//V10
//{
//  "name": "Alex",
//  "isWorking": true,
//  "timestamp": 1645532452,
//  "friends": ["Emily", "Michael", "David"]
//}
//<person>
//  <name>Alex</name>
//  <isWorking>true</isWorking>
//  <timestamp>1645532452</timestamp>
//  <friends>
//    <friend>Emily</friend>
//    <friend>Michael</friend>
//    <friend>David</friend>
//  </friends>
//</person>