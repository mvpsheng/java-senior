package myTomcat;

/**
 * FileName: MyServlet
 * author: gxs
 * Date: 2021/10/25  17:47
 */
public abstract class MyServlet {
    public abstract void doGet(MyRequest myRequest, MyResponse myResponse);

    public abstract void doPost(MyRequest myRequest, MyResponse myResponse);

    public void service(MyRequest myRequest, MyResponse myResponse) {
        if (myRequest.getMethod().equalsIgnoreCase("POST")) {
            doPost(myRequest, myResponse);
        } else if (myRequest.getMethod().equalsIgnoreCase("GET")) {
            doGet(myRequest, myResponse);
        }
    }

}
