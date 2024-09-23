package task5;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;


public class Person implements Serializable {
    private Long id;
    private String name;
    private boolean working;
    private long timestamp;
    private List<String> friends;

    // Getters and Setters

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