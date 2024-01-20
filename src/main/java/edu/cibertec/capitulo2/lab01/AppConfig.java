package edu.cibertec.capitulo2.lab01;

import edu.cibertec.capitulo2.lab01.beans.A;
import edu.cibertec.capitulo2.lab01.beans.B;
import edu.cibertec.capitulo2.lab01.beans.C;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public A claseA(){
        return new A();
    }

    @Bean
    public B claseB(){
        return new B();
    }

    @Bean
    public C claseC(){
        return new C();
    }
}
