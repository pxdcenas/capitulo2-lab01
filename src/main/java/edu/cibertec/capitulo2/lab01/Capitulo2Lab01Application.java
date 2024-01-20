package edu.cibertec.capitulo2.lab01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
public class Capitulo2Lab01Application implements CommandLineRunner {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(Capitulo2Lab01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("La aplicación ha iniciado correctamente!");

		String[] myBeans = Arrays.stream(applicationContext.getBeanDefinitionNames())
				.filter(beanName -> applicationContext.getBean(beanName).getClass().getPackage().getName().startsWith("edu.cibertec.capitulo2.lab01"))
				.sorted()
				.toArray(String[]::new);
		for (String bean : myBeans) {
			System.out.println(bean);
		}


	}
}
