package task5;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class JsonHandler {

    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        // Step C: Deserialize JSON from input.json
        Person person = objectMapper.readValue(new File("/Users/roman/Projects/AT_Pryimak_R/AT/src/main/resources/input.json"), Person.class);
        System.out.println("Deserialized Person from JSON: " + person);

        person.setName("Alex");
        person.setWorking(true);
        person.setTimestamp(Long.parseLong("1645532452"));
        person.setFriends(new ArrayList<>(Arrays.asList("Emily", "Michael","David")));

        // Step E: Serialize and save to output.json
        objectMapper.writeValue(new File("output.json"), person);
        System.out.println("Serialized Person to JSON: " + person);
    }
}


