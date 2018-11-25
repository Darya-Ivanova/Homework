package pack;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;

public class TestsVkMessages {
    VkMethods vkMethods = new VkMethods();

    public TestsVkMessages() {
    }

    @Test(priority=1)
    public void testSendMessages() throws IOException, URISyntaxException {
        vkMethods.sendMessages();
    }

    @Test(priority=2)
    public void testEditMessage() throws IOException, URISyntaxException {
        vkMethods.editMessages();
    }

    @Test(priority=3)
    public void testDeleteMessage() throws IOException, URISyntaxException {
        vkMethods.deleteMessages();
    }
}
