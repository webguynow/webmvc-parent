package org.dev.car.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	
	  @Override
	  protected Class<?>[] getRootConfigClasses() {
	    return new Class[] {SpringRootConfig.class};
	  }

	  @Override
	  protected Class<?>[] getServletConfigClasses() {
	    return new Class[] {SpringMvcConfig.class};
	  }

	  @Override
	  protected String[] getServletMappings() {
	    return new String[]{"/"};
	  }

}
