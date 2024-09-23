package task5;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class XmlHandler {

    public static void main(String[] args) throws Exception {
        XmlMapper xmlMapper = new XmlMapper();

        Person person = xmlMapper.readValue(new File("/Users/roman/Projects/AT_Pryimak_R/AT/src/main/resources/input.xml"), Person.class);
        System.out.println("Deserialized Person from XML: " + person);

        person.setName("Alex");
        person.setWorking(true);
        person.setTimestamp(Long.parseLong("1645532452"));
        person.setFriends(new ArrayList<>(Arrays.asList("Emily", "Michael","David")));

        xmlMapper.writeValue(new File("output.xml"), person);
        System.out.println("Serialized Person to XML: " + person);
    }
}
