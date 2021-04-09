package mx.edu.uacm.hibernatejpamanytoone.entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;


@SpringBootTest
public class PhoneTest {
	
	private static final Logger log = LogManager.getLogger(PhoneTest.class);
	
	@PersistenceContext
	private EntityManager em;
	
	@Test
	@Transactional
	@Rollback(false)
	public void debeGuardarPhone() {
		log.debug(">Entrando a debeGuardarPhone<");
		
		Person person = new Person("Pepe");
		em.persist( person );

		Phone phone = new Phone("954000000");
		phone.setPerson(person);
		em.persist(phone);

		em.flush();
		
		
	}
}
