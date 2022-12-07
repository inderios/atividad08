package titureco;

public class Praia extends AtrativoTuristico{
    private boolean propriaParaBanho;
    private boolean perigoTubarao;
    private String tipoOrla;
    public final static String TIPO_PISCINAS_NATURAIS = "Piscinas Naturais";
    public final static String TIPO_ONDAS_FORTES = "Ondas fortes";
    public final static String TIPO_ONDAS_MEDIAS = "Ondas médias";
    public Praia(String nome, double latitude, double longitude,String comoChegar, String cidade, String estado,
                 boolean propriaParaBanho, boolean perigoTubarao, String tipoOrla){
        super(nome, latitude, longitude, comoChegar, cidade, estado);
        this.propriaParaBanho = propriaParaBanho;
        this.perigoTubarao = perigoTubarao;
        this.tipoOrla = tipoOrla;
    }
    public Praia() {
        this("", 0, 0,"", "","", false,
                true, TIPO_ONDAS_FORTES);
    }
    public void setPropriaParaBanho (boolean propriaParaBanho) {
        this.propriaParaBanho = propriaParaBanho;
    }
    public void setPerigoTubarao (boolean perigoTubarao) {
        this.perigoTubarao = perigoTubarao;
    }
    public void setTipoOrla (String tipoOrla) {
        this.tipoOrla = tipoOrla;
    }
    public boolean getPropriaParaBanho() {
        return this.propriaParaBanho;
    }
    public boolean getPerigoTubarao() {
        return this.perigoTubarao;
    }
    public String getTipoOrla() {
        return this.tipoOrla;
    }

    @Override
    public String toString() {
        return "Praia{" +
                "propriaParaBanho=" + propriaParaBanho +
                ", perigoTubarao=" + perigoTubarao +
                ", tipoOrla='" + tipoOrla + '\'' +
                '}';
    }

    public boolean temPerigoTubarao() {
        return this.perigoTubarao;
    }

    public boolean ehPropriaParaBanho() {
        return this.propriaParaBanho;
    }


}
