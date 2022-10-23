import  javax.xml.*;

public class Main {

    public static void main(String[] args) {
        //adresse url du web service
        String url="http://localhost:8686";
        Endpoint.publish(url,new BanqueService());

        System.out.println("Hello world!");
    }
}