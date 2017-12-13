package com.juphoon.rcsrunner;

import com.juphoon.rcsrunner.server.RcsServer;
import local.sbc.SessionBorderController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages ={"com.juphoon.rcsrunner.mapper"})
public class RcsRunnerApplication {

	public static void main(String[] args) {

		SpringApplication.run(RcsRunnerApplication.class, args);
		SessionBorderController.init();
	}
}
