package com.banco.gastoscartao;

import com.banco.gastoscartao.domain.Lancamento;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

@SpringBootApplication
public class GastosCartaoApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(GastosCartaoApplication.class, args);
//	}

	/*Lancamentos de teste*/
	public static void main(String[] args) {

		Lancamento lancamento1 = new Lancamento(UUID.randomUUID(),"Pedro Henrique","Almoço", LocalDateTime.now(), new BigDecimal(23.49),"Restaurante Manati");
		Lancamento lancamento2 = new Lancamento(UUID.randomUUID(),"Pedro Henrique","Jantar", LocalDateTime.now(),new BigDecimal(49.90),"MC Donalds");

		System.out.println(lancamento1);
		System.out.println(lancamento2);

	}

}
