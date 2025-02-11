package org.example;

import org.example.config.WebAppConfig;
import org.example.config.WebRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class}; // meka web mvc eka enable karanna
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class}; // me project eke web mvc eka enable karanna
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
