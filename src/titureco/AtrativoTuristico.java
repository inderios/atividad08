package titureco;

import java.util.Objects;

public class AtrativoTuristico {
    String nome;
    double latitude;
    double longitude;
    String comoChegar;
    String cidade;
    String estado;
    public AtrativoTuristico() {
        this("", 0, 0, "", "", "");
    }
    public AtrativoTuristico (String nome, double latitude, double longitude,String comoChegar, String cidade, String estado) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.comoChegar = comoChegar;
        this.cidade = cidade;
        this.estado = estado;
    }
    //set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public void setComoChegar (String comoChegar) {
        this.comoChegar = comoChegar;
    }
    public void setCidade (String cidade) {
        this.cidade = cidade;
    }
    public void setEstado (String estado) {
        this.estado = estado;
    }
    //get
    public String getNome() {
        return this.nome;
    }
    public double getLatitude() {
        return this.latitude;
    }
    public double getLongitude() {
        return this.longitude;
    }
    public String getComoChegar() {
        return this.comoChegar;
    }
    public String getCidade() {
        return this.cidade;
    }
    public String getEstado() {
        return this.estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtrativoTuristico that = (AtrativoTuristico) o;
        return Objects.equals(nome, that.nome) && Objects.equals(cidade, that.cidade) && Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cidade, estado);
    }

    @Override
    public String toString() {
        return "AtrativoTuristico{" +
                "nome='" + nome + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", comoChegar='" + comoChegar + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
