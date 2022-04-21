package com.gmail.connor.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class ReadSpecificJSONKey {
    public static void main(String[] args) throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get("employee.txt"));

        ObjectMapper objectMapper =new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(jsonData);
        JsonNode idNote = rootNode.path("id");
        System.out.println("id= " + idNote.asInt());

        JsonNode phoneNode = rootNode.path("phoneNumber");
        Iterator<JsonNode> elements = phoneNode.elements();
        while (elements.hasNext()) {
            JsonNode phone = elements.next();
            System.out.println("phone= " + phone.asLong());
        }
    }
}
