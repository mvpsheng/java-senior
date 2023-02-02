package myTomcat;

import java.io.IOException;

/**
 * FileName: HelloWorldServlet
 * author: gxs
 * Date: 2021/10/25  18:12
 */
public class HelloWorldServlet extends MyServlet{
    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("get world...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("post world");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
