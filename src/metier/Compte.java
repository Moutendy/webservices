package metier;

import java.util.Date;

public class Compte {
    private Long code;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    private double solde;
    private Date dateCreation;

    public Compte(Long code,double solde,Date dateCreation)
    {
        this.code=code;
        this.solde= solde;
        this.dateCreation=dateCreation;
    }
}
