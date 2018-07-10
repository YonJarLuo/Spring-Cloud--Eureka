package client;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by LuoYJ on 2018/3/28.
 */
public class TestHttpClient {
    public static void main(String[] args) throws IOException {

        //创建默认的HttpClient
        CloseableHttpClient httpClient = HttpClients.createDefault();

        for (int i = 0; i < 6; i++) {
            //使用GET方法请求服务
            HttpGet httpGet = new HttpGet("http://localhost:9000/router");

            //获取响应
            HttpResponse response = httpClient.execute(httpGet);

            //根据响应，解析出字符串
            System.out.println(EntityUtils.toString(response.getEntity()));
        }
    }
}
