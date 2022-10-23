import metier.Compte;


import javax.servlet.annotation.WebInitParam;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//annotation de déclaration du web service
@WebService(serviceName="BanqueWs")
public class BanqueService {
    //annotation de déclaration des methode du web service
    @WebMethod(operationName="ConversionEuroToDh")

    public double conversion(@WebParam(name = "montant") double mt)
    {
        return mt*10.6;
    }
    @WebMethod
    public Compte getCompt(@WebParam(name = "code")Long code)
    {
return new Compte(code,Math.random()*9000,new Date());
    }

    @WebMethod
    public List<Compte> listComptes(){
List<Compte> comptes=new ArrayList<>();
comptes.add(new Compte(1L,Math.random()*9000,new Date()));
        comptes.add(new Compte(2L,Math.random()*9000,new Date()));
        comptes.add(new Compte(3L,Math.random()*9000,new Date()));
        return comptes;

    }
}
