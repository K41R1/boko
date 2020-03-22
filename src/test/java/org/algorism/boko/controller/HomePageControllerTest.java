package org.algorism.boko.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HomePageControllerTest extends ControllerTest {

    @Test
    public void shouldReturnOk() {
        ResponseEntity<Properties> response = this.restTemplate.getForEntity(this.hostname, Properties.class);
        Properties body = response.getBody();
        HttpStatus statusCode = response.getStatusCode();
        
        assertEquals(HttpStatus.OK, statusCode);
        assertTrue(body.containsKey("timestamp"));
        assertTrue(body.containsKey("state"));
        assertEquals("working", body.get("state"));
    }

}