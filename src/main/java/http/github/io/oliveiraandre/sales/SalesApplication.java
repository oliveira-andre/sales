package http.github.io.oliveiraandre.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class SalesApplication {

  @Autowired
  @Qualifier("applicationName")
  public String applicationName;

  @GetMapping("/hello")
  public String helloWorld() {
    return applicationName;
  }

	public static void main(String[] args) {
		SpringApplication.run(SalesApplication.class, args);
	}

}
