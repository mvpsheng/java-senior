package proxys.virtualProxy;

import java.net.URL;

/**
 * FileName: ImageViewer
 * author: gxs
 * Date: 2023/2/4  22:52
 */
public class ImageViewer {
    public static void main(String[] args) throws Exception {
        String image = "http://image.jpg";
        URL url = new URL(image);
        HighResolutionImage highResolutionImage = new HighResolutionImage(url);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();
    }
}
