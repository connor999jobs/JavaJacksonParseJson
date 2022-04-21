package com.gmail.connor.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.gmail.connor.model.Address;
import com.gmail.connor.model.Employee;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JacksonMappedObject {
    public static void main(String[] args)  throws IOException {

        byte[] jsonData = Files.readAllBytes(Paths.get("employee.txt"));
        ObjectMapper objectMapper = new ObjectMapper();

        Employee employee = objectMapper.readValue(jsonData, Employee.class);
        System.out.println("Employee Object\n" +employee);

        Employee employee1 = createEmployee();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        StringWriter stringEmp = new StringWriter();
        objectMapper.writeValue(stringEmp, employee1);
        System.out.println("Employee JSON is\n"+stringEmp);
    }

    public static Employee createEmployee(){
        Employee employee = new Employee();
        employee.setId(2);
        employee.setName("Dima");
        employee.setSurname("Izotov");
        employee.setPhoneNumber(new long[]{12345});
        employee.setRole("IT");

        Address address = new Address();
        address.setCity("Kyiv");
        address.setStreet("Vanda Vasilevskaya");
        address.setNumberHous("36");

        List<String> cities = new ArrayList<String>();
        cities.add("All Ukraine");
        employee.setCities(cities);

        Map<String, String> props = new HashMap<String ,String>();
        props.put("salary", "40000 UAH");
        props.put("age", "23");
        employee.setProperties(props);

        return employee;
    }
}
