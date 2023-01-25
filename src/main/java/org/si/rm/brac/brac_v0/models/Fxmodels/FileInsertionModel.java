package org.si.rm.brac.brac_v0.models.Fxmodels;

public class FileInsertionModel extends FxModel{
    private String NDRM = "";
    private String NAJT = "";
    private String Lieu = "";
    private String date = "";
    private String Brigade = "";
    private String NPv = "";
    private String DatePv = "";
    private String Matériel = "";
    private String Corporel = "";

    public String getNDRM() {
        return NDRM;
    }

    public void setNDRM(String NDRM) {
        this.NDRM = NDRM;
    }

    public String getNAJT() {
        return NAJT;
    }

    public void setLieu(String Lieu) {
        this.Lieu = Lieu;
    }

    public String getLieu() {
        return Lieu;
    }

    public void setdate(String date) {this.date = date;  }

    public String getdate() {
        return date;
    }

    public void setBrigade(String Brigade) {
        this.Brigade = Brigade;
    }

    public String getBrigade() {
        return Brigade;
    }

    public void setNPv(String NPv) {
        this.NPv = NPv;
    }

    public String getNPv() {
        return NPv;
    }

    public void setDatePv(String DatePv) {
        this.DatePv = DatePv;
    }

    public String getDatePv() {
        return DatePv;
    }

    public void setMatériel(String Matériel) {
        this.Matériel = Matériel;
    }

    public String getMatériel() {
        return Matériel;
    }

    public void setCorporel(String Corporel) {
        this.Corporel = Corporel;
    }

    public String getCorporel() {
        return Corporel;
    }

}
