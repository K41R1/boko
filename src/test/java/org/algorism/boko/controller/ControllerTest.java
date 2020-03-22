package org.algorism.boko.controller;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(Lifecycle.PER_CLASS)
public class ControllerTest {
    
    @LocalServerPort
    protected int port;

    protected String hostname;

    @Autowired
    protected TestRestTemplate restTemplate;

    @BeforeAll
    public void setUp() {
        this.hostname = String.format("http://localhost:%d", this.port);
    }    
}