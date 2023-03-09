package com.banco.gastoscartao;

import com.banco.gastoscartao.domain.Lancamento;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

@SpringBootApplication
public class GastosCartaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GastosCartaoApplication.class, args);
	}

	/*Lancamentos de teste*/
//	public static void main(String[] args) {
//
//		Lancamento lancamento1 = new Lancamento(null,"Pedro Henrique","Almoço", LocalDateTime.now(), new BigDecimal(23.49),"Restaurante Manati");
//		Lancamento lancamento2 = new Lancamento(null,"Pedro Henrique","Jantar", LocalDateTime.now(),new BigDecimal(49.90),"MC Donalds");
//
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("card-speding");
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		em.persist(lancamento1);
//		em.persist(lancamento2);
//		em.getTransaction().commit();
//		em.close();
//		emf.close();
//	}

}
