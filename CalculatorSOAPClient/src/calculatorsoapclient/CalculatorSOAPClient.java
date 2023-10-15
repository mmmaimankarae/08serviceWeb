package calculatorsoapclient;

public class CalculatorSOAPClient {

    public static void main(String[] args) {
        System.out.println(add(3, 6));
    }

    private static int add(int num1, int num2) {
        services.CalculatorService_Service service = new services.CalculatorService_Service();
        services.CalculatorService port = service.getCalculatorServicePort();
        return port.add(num1, num2);
    }
}
