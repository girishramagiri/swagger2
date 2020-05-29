package com.infosys.swagger2;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Swagger2Application {

	public static void main(String[] args) {
		SpringApplication.run(Swagger2Application.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.infosys"))
				.build()
				.apiInfo(apiMetadata());
	}

	public ApiInfo apiMetadata() {
		return new ApiInfo(
				"Member Resource API", 
				"Swagger Demo", 
				"1.0", 
				"Free to use",
				new springfox.documentation.service.Contact("Girish", "http://girishramagiri.io",
						"girishramagiri@gmail.com"),
				"API License", 
				"http://girishramagiri.io", 
				Collections.emptyList());
	}
}
