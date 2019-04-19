package com.pankaj;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.MethodMode;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.pankaj.entity.TestEntity;
import com.pankaj.repo.TestRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, properties = "server.port=8080")
@Transactional
@DirtiesContext(methodMode = MethodMode.BEFORE_METHOD)
@ActiveProfiles("test")
public class SpringBootTestWithH2 {

	@Autowired
	private TestRepository genericEntityRepository;

	private static int x = 10;

	@Test
	public void givenGenericEntityRepository_whenSaveAndRetreiveEntity_thenOK() throws InterruptedException {
		TestEntity setEntity = genericEntityRepository.save(new TestEntity("test"));
		TestEntity getEntity = genericEntityRepository.findOne(setEntity.getId());
		System.out.println(getEntity);
		x++;
		x++;

	}

	@Test
	public void givenGenericEntityRepository_whenSaveAndRetreiveEntity_thenOK2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("#################" + x);

	}
}