package com.renault.test.modone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

  public static void main(String[] args) throws Exception {

    SpringApplication.run(SpringBootConsoleApplication.class, args);

  }

  //access command line arguments
  @Override
  public void run(String... args) throws Exception {
    //nothing to do
  }
}