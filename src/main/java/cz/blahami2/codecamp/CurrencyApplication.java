package cz.blahami2.codecamp;

import cz.blahami2.codecamp.controller.CurrencyController;
import cz.blahami2.codecamp.data.CurrencyProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan( basePackageClasses = { CurrencyController.class, CurrencyProvider.class } )
public class CurrencyApplication {

    public static void main( String[] args ) {
        SpringApplication.run( CurrencyApplication.class, args );
    }
}
