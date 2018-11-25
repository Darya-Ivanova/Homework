package pack;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;

import java.io.IOException;
import java.net.URISyntaxException;

public class VkMethods {
    private static final String URL = "https://api.vk.com/method/";
    private static final String USER_ID = "215050444";
    private static final String ACCESS_TOKEN = "758508a4a8f48e9770f7617c83e1c318d06ee14830723238295016c3d835efe192be6b19ef9f2f161a9cc";
    private static final String VERSION = "5.92";
    private static final String RANDOM_ID = "33";
    private static HttpClient client;

    public void sendMessages() throws IOException, URISyntaxException {
        client = HttpClientBuilder.create().build();
        URIBuilder builder = new URIBuilder(URL + "messages.send?");
        builder.setParameter("access_token", ACCESS_TOKEN)
                .setParameter("user_id", USER_ID).setParameter("message", "Hi")
                .setParameter("v", VERSION).setParameter("random_id",RANDOM_ID );
        HttpGet request = new HttpGet(builder.build());
        HttpResponse response = client.execute(request);
        System.out.println(EntityUtils.toString(response.getEntity()));
    }

    public void editMessages() throws IOException, URISyntaxException {
        client = HttpClientBuilder.create().build();
        URIBuilder builder = new URIBuilder(URL + "messages.edit?");
        builder.setParameter("access_token",ACCESS_TOKEN )
                .setParameter("peer_id", USER_ID).setParameter("message", "Mi mi mi")
                .setParameter("v", VERSION).setParameter("random_id", RANDOM_ID)
                .setParameter("message_id", "170485");
        HttpGet request = new HttpGet(builder.build());
        HttpResponse response = client.execute(request);
      System.out.println(EntityUtils.toString(response.getEntity()));
    }

    public void deleteMessages() throws IOException, URISyntaxException{
        client = HttpClientBuilder.create().build();
        URIBuilder builder = new URIBuilder( URL + "messages.delete?");
        builder.setParameter("access_token",ACCESS_TOKEN )
                .setParameter("v", VERSION).setParameter("random_id", RANDOM_ID)
                .setParameter("user_id", USER_ID).setParameter("message_id", "170485")
                .setParameter("delete_for_all", "1");
        HttpGet request = new HttpGet(builder.build());
        HttpResponse response = client.execute(request);
        System.out.println(EntityUtils.toString(response.getEntity()));
    }
}
