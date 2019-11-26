package demo.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageHelper;
/*
 * 配置pagehelper拦截器
 */
@Configuration
public class MybatisConfiguration {
	@Bean
	public PageHelper pageHelper() {
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("pagehelper.support-methods-argument", "ture");
		properties.setProperty("offsetAsPageNum", "ture");
		properties.setProperty("rowBoundsWithCount","true");
		properties.setProperty("reasonable","true");
		pageHelper.setProperties(properties);
		return pageHelper;
		
 	}
}
