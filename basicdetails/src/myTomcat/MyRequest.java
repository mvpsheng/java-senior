package myTomcat;

import java.io.IOException;
import java.io.InputStream;

/**
 * FileName: MyRequest
 * author: gxs
 * Date: 2021/10/22  21:51
 */
public class MyRequest {
    private String url;
    private String method;

    public MyRequest(InputStream inputStream) throws IOException {
        String httpRequest = "";
        byte[] httpRequestBytes = new byte[1024];
        int length = 0;
        if ((length = inputStream.read(httpRequestBytes)) > 0) {
            httpRequest = new String(httpRequestBytes, 0, length);
        }
/**
 * HTTP请求协议
 * GET /favicon.ico HTTP1.1
 *
 *
 * Host: localhost:8080
 * Connection: keep-Alive
 * */
    String httpHead = httpRequest.split("\n")[0];
    url = httpHead.split("\\s")[1];
    method = httpHead.split("\\s")[0];
        System.out.println(this);
    }

    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }
}
