package myTomcat;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: ServletMappingConfig
 * author: gxs
 * Date: 2021/10/25  18:16
 */
public class ServletMappingConfig {
    public static List<ServletMapping> servletMappingList = new ArrayList<>();

    static {
        servletMappingList.add(new ServletMapping("helloWorld","/world","myTomcat.HelloWorldServlet"));
    }
}
