package mvnlearn;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "mvnlearn")
@PropertySource("classpath:application.properties")
public class MyConfig {

}
