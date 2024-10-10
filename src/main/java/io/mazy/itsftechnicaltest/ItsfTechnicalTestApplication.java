package io.mazy.itsftechnicaltest;

import io.mazy.itsftechnicaltest.service.ChaussettesStrategy;
import io.mazy.itsftechnicaltest.service.MultipleStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItsfTechnicalTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItsfTechnicalTestApplication.class, args);
        MultipleStrategy strategy = new ChaussettesStrategy();
        for (int i = 0; i < 10; i++) {
            System.out.println(strategy.getResult(i));
        }
    }

}
