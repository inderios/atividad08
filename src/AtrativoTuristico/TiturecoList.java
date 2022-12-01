package AtrativoTuristico;

import java.util.ArrayList;
import java.util.List;

public class TiturecoList {
    private List<AtrativoTuristico> atrativos;
    public TiturecoList() {
        atrativos = new ArrayList<>();
    }
    public boolean cadastrarAtrativo(AtrativoTuristico atrativo) {
    }
    public boolean apagarAtrativo(String nomeAtrativo, String cidade){

    }
    public List<AtrativoTuristico> getAtrativos(){
        return atrativos;
    }
    public List<AtrativoTuristico> pesquisarAtrativosDaCidade(String cidade, String estado) {
        List atrativosDaCidade = new ArrayList<>();
        for (AtrativoTuristico c: atrativos) {
            if (c.getCidade().equals(cidade) && c.getEstado().equals(estado)) {
                atrativosDaCidade.add(c);
            }
        }
        return atrativosDaCidade;
    }
}
