package org.algorism.boko;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class BokoApplicationTests {

	@LocalServerPort
	private int port;

	@Test
	void contextLoads() {
	}

}
