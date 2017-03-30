package com.example.common.config;

import org.seasar.doma.boot.autoconfigure.DomaConfigBuilder;
import org.seasar.doma.jdbc.ClassHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomaClassHelperConfig {
	private ClassHelper classHelper = new MyClassHelper();
	
	private static class MyClassHelper implements ClassHelper {
		@SuppressWarnings("unchecked")
		@Override
		public <T> Class<T> forName(String className) throws Exception {
			return (Class<T>)this.getClass().getClassLoader().loadClass(className);
		}
	}
	
	@Bean
	public DomaConfigBuilder domaConfigBuilder() {
		return new DomaConfigBuilder() {
			public ClassHelper classHelper() {
				return classHelper;
			}
		};
	}
}
