package org.coopgoods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TownHallApplication {

  public static void main(final String[] args) {
    SpringApplication.run(TownHallApplication.class, args);
  }
}
