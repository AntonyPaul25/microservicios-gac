package cr.microservicios.gac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({ "cr.microservicios.commons.entity" })
public class MicroserviciosGacApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosGacApplication.class, args);
	}

}
