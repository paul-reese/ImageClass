package io.hopper.ImageClass;

import ai.djl.inference.Predictor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.util.function.Supplier;

@SpringBootApplication
public class ImageClassApplication {

	@Resource
	private Supplier<Predictor> predictorProvider;

	public static void main(String[] args) {
		SpringApplication.run(ImageClassApplication.class, args);
	}

}
