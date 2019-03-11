package cn.wxm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.wxm.mapper")
public class SpringbootSpringmvcMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSpringmvcMybatisApplication.class, args);
	}

}
