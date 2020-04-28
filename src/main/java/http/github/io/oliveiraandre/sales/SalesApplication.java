package http.github.io.oliveiraandre.sales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class SalesApplication {

  @GetMapping("/hello")
  public String helloWorld() {
    return "hello world";
  }

	public static void main(String[] args) {
		SpringApplication.run(SalesApplication.class, args);
	}

}
