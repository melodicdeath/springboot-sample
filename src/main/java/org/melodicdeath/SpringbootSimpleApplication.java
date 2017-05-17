package org.melodicdeath;

import org.melodicdeath.servlet.MyServlet1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@ServletComponentScan
public class SpringbootSimpleApplication {

	/**
	 * 使用代码注册Servlet（不需要@ServletComponentScan注解）
	 *
	 * @return
	 * @author SHANHY
	 * @create  2016年1月6日
	 */
	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		return new ServletRegistrationBean(new MyServlet1(), "/xs/*");// ServletName默认值为首字母小写，即myServlet
	}

	/**
	 * 修改DispatcherServlet默认配置
	 *
	 * @param dispatcherServlet
	 * @return
	 * @author SHANHY
	 * @create  2016年1月6日
	 */
	@Bean
	public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
		ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
		registration.getUrlMappings().clear();
		registration.addUrlMappings("*.do");
		registration.addUrlMappings("*.json");
		return registration;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSimpleApplication.class, args);
	}
}
