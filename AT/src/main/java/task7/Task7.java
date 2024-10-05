package task7;

import task5.Person;
import task6.PersonDAO;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        CompanyDAO companyDAO = new CompanyDAO();
        ProjectDAO projectDAO = new ProjectDAO();

        Address address = new Address();
        address.setStreet("123 Main St");
        address.setCity("New York");

        Company company = new Company();
        company.setName("TechCorp");

        Project project1 = new Project();
        project1.setName("AI Research");

        Project project2 = new Project();
        project2.setName("Web Development");

        Person person = new Person();
        person.setName("John Doe");
        person.setWorking(true);
        person.setTimestamp(System.currentTimeMillis());
        person.setFriends(Arrays.asList("Jane", "Robert"));

        person.setAddress(address);
        person.setCompany(company);
        person.setProjects(Arrays.asList(project1, project2));

        companyDAO.createCompany(company);
        projectDAO.createProject(project1);
        projectDAO.createProject(project2);
        personDAO.createPerson(person);

        Person fetchedPerson = personDAO.getPersonById(person.getId());
        System.out.println(fetchedPerson);
    }
}
