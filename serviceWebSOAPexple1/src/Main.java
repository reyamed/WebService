import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        System.out.println("Service Web");
            String url = "http://localhost:8888/";
        Endpoint.publish(url, new MonserviceWEb());
        System.out.println("Service Web est déployé");

    }
}