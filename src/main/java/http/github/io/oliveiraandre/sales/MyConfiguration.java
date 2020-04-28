package http.github.io.oliveiraandre.sales;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
  @Bean(name = "applicationName")
  public String applicationName() {
    return "Sales Application";
  }
}
