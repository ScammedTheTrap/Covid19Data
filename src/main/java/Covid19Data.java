public class Covid19Data {
    private String Region;
    private String aldersgruppe;
    private int bekræftedeTilfælde;
    private int antalDøde;
    private int indlagteIntensitiv;
    private int indlagte;

    @Override
    public String toString() {
        return
                "\n" + "Region: " + Region + "\n" +
                        "aldersgruppe: " + aldersgruppe + "\n" +
                        "bekræftedeTilfælde: " + bekræftedeTilfælde + "\n" +
                        "antalDøde: " + antalDøde + "\n" +
                        "indlagteIntensitiv: " + indlagteIntensitiv + "\n" +
                        "indlagte: " + indlagte + "\n" + "\u2500".repeat(50);
    }

    public Covid19Data(String region, String aldersgruppe, int bekræftedeTilfælde, int antalDøde, int indlagteIntensitiv, int indlagte) {
        Region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.antalDøde = antalDøde;
        this.indlagteIntensitiv = indlagteIntensitiv;
        this.indlagte = indlagte;


    }
}
