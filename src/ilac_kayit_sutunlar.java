

public class ilac_kayit_sutunlar {
    private int ilac_id;
    private String ilac_barkod;
    private String ilac_ad;
    private String ilac_mg;
    private String ilac_adet;

    public ilac_kayit_sutunlar(int ilac_id, String ilac_barkod, String ilac_ad, String ilac_mg, String ilac_adet) {
        this.ilac_id = ilac_id;
        this.ilac_barkod = ilac_barkod;
        this.ilac_ad = ilac_ad;
        this.ilac_mg = ilac_mg;
        this.ilac_adet = ilac_adet;
    }

    ilac_kayit_sutunlar(int aInt, String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIlac_id() {
        return ilac_id;
    }

    public void setIlac_id(int ilac_id) {
        this.ilac_id = ilac_id;
    }

    public String getIlac_barkod() {
        return ilac_barkod;
    }

    public void setIlac_barkod(String ilac_barkod) {
        this.ilac_barkod = ilac_barkod;
    }

    public String getIlac_ad() {
        return ilac_ad;
    }

    public void setIlac_ad(String ilac_ad) {
        this.ilac_ad = ilac_ad;
    }

    public String getIlac_mg() {
        return ilac_mg;
    }

    public void setIlac_mg(String ilac_mg) {
        this.ilac_mg = ilac_mg;
    }

    public String getIlac_adet() {
        return ilac_adet;
    }

    public void setIlac_adet(String ilac_adet) {
        this.ilac_adet = ilac_adet;
    }

    
}
