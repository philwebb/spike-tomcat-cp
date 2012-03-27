package org.springsource.pwebb.spike.tomcatcp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ImportResource("classpath*:META-INF/*-springmvc.xml")
public class WebMvcConfig {

}
