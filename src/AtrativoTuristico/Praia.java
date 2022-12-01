package AtrativoTuristico;

public class Praia extends AtrativoTuristico{
    boolean propriaParaBanho;
    boolean perigoTubarao;
    String tipoOrla;
    final String TIPO_PISCINAS_NATURAIS = "Piscinas Naturais";
    final String TIPO_ONDAS_FORTES = "Ondas fortes";
    final String TIPO_ONDAS_MEDIAS = "Ondas médias";
    public Praia(String nome, double latitude, double longitude,String comoChegar, String cidade, String estado,
                 boolean propriaParaBanho, boolean perigoTubarao, String tipoOrla){
        super(nome, latitude, longitude, comoChegar, cidade, estado);
        this.propriaParaBanho = propriaParaBanho;
        this.perigoTubarao = perigoTubarao;
        this.tipoOrla = tipoOrla;
    }
    public Praia() {
        this("", 0, 0,"", "","", false, true, "");
    }
    public void setPropriaParaBanho (boolean propriaParaBanho) {
        this.propriaParaBanho = propriaParaBanho;
    }
    public void setPerigoTubarao (boolean PerigoTubarao) {
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
}
