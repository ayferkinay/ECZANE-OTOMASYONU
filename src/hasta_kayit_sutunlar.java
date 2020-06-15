
public class hasta_kayit_sutunlar {
    private  int hasta_id;
    private String hasta_tc;
    private String hasta_ad;
    private String hasta_yas;
    private String hasta_iletisim;
    private String hasta_eposta;

    public int getHasta_id() {
        return hasta_id;
    }

    public void setHasta_id(int hasta_id) {
        this.hasta_id = hasta_id;
    }

    public String getHasta_tc() {
        return hasta_tc;
    }

    public void setHasta_tc(String hasta_tc) {
        this.hasta_tc = hasta_tc;
    }

    public String getHasta_ad() {
        return hasta_ad;
    }

    public void setHasta_ad(String hasta_ad) {
        this.hasta_ad = hasta_ad;
    }

    public String getHasta_yas() {
        return hasta_yas;
    }

    public void setHasta_yas(String hasta_yas) {
        this.hasta_yas = hasta_yas;
    }

    public String getHasta_iletisim() {
        return hasta_iletisim;
    }

    public void setHasta_iletisim(String hasta_iletisim) {
        this.hasta_iletisim = hasta_iletisim;
    }

    public String getHasta_eposta() {
        return hasta_eposta;
    }

    public void setHasta_eposta(String hasta_eposta) {
        this.hasta_eposta = hasta_eposta;
    }

    public hasta_kayit_sutunlar(int hasta_id, String hasta_tc, String hasta_ad, String hasta_yas, String hasta_iletisim, String hasta_eposta) {
        this.hasta_id = hasta_id;
        this.hasta_tc = hasta_tc;
        this.hasta_ad = hasta_ad;
        this.hasta_yas = hasta_yas;
        this.hasta_iletisim = hasta_iletisim;
        this.hasta_eposta = hasta_eposta;
    }

}