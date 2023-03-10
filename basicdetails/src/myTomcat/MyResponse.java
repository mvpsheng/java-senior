package myTomcat;

import java.io.IOException;
import java.io.OutputStream;

/**
 * FileName: MyResponse
 * author: gxs
 * Date: 2021/10/25  17:42
 */
public class MyResponse {
    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void write(String content) throws IOException {
//        HTTP响应协议
//        HTTP/1.1 200 ok
//        Content-Type: text/html
//
//        <html><body></body></html>
        StringBuffer httpResponse = new StringBuffer();
        httpResponse.append("HTTP/1.1 200 ok\n")
                .append("Content-Type: text/html\n")
                .append("/r/n")
                .append("<html><body>")
                .append(content)
                .append("</body></html>");
        outputStream.write(httpResponse.toString().getBytes());
        outputStream.close();
    }
}
