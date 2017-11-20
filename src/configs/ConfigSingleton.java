package configs;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;

public class ConfigSingleton {
    public static final String ROOT_OF_PROJECT = "/Users/Vladislav/IdeaProjects/TourCompany";
    private static Configuration cfg = null;
    public static Configuration getConfig(ServletContext sc) {
        if (cfg == null){

            cfg = new Configuration();
            cfg.setServletContextForTemplateLoading(
                    sc,
                    "/WEB-INF/templates"
            );
            cfg.setTemplateExceptionHandler(
                    TemplateExceptionHandler.HTML_DEBUG_HANDLER
            );
            cfg.setDefaultEncoding("UTF-8");
        }
        return cfg;
    }


}