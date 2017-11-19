package helpers;

import configs.ConfigSingleton;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;


public class
ConfigHelper {
    public static void render(HttpServletRequest request, HttpServletResponse response, String templateName, HashMap root) throws ServletException, IOException {
        Configuration cfg = ConfigSingleton.getConfig(request.getServletContext());
        Template tmpl = cfg.getTemplate(templateName);
        try {
            tmpl.process(root, response.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
        response.setCharacterEncoding("UTF-8");
    }
}
