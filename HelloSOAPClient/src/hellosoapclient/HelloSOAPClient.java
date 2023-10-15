package hellosoapclient;

public class HelloSOAPClient {
    public static void main(String[] args) {
        System.out.println(hello("John"));
    }

    private static String hello(java.lang.String name) {
        serviceClient.HelloWebService_Service service = new serviceClient.HelloWebService_Service();
        serviceClient.HelloWebService port = service.getHelloWebServicePort();
        return port.hello(name);
    }
}
