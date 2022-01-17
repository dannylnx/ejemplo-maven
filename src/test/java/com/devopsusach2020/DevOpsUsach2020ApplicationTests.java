package com.devopsusach2020;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.devopsusach2020.model.Pais;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DevOpsUsach2020ApplicationTests {

	@Test
	void test1() {
		Pais p = new Pais();
    	assertNotNull(p);

	}

}
