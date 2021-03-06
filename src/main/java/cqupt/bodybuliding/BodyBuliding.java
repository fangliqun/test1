package cqupt.bodybuliding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class BodyBuliding   extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(BodyBuliding.class, args);
    }
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(BodyBuliding.class);
    }
}
