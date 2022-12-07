package titureco;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TiturecoList implements TiturecoInterface{
    public List<AtrativoTuristico> atrativos = new LinkedList<>();
    @Override
    public boolean cadastrarAtrativo(AtrativoTuristico atrativo) {
        for (AtrativoTuristico c: atrativos) {
            if(c.equals(atrativo)){
                return false;
            }
        }
        atrativos.add(atrativo);
        return true;
    }

    @Override
    public boolean apagarAtrativo(String nomeAtrativo, String cidade, String estado) {
        for(AtrativoTuristico atrativo: atrativos)  {
            if(atrativo.getNome().equals(nomeAtrativo) && atrativo.getCidade().equals(cidade) && atrativo.getEstado().equals(estado)) {
                atrativos.remove(atrativo);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<AtrativoTuristico> getAtrativos() {
        return this.atrativos;
    }

    @Override
    public List<AtrativoTuristico> pesquisaAtrativosDaCidade(String cidade, String estado) {
        List<AtrativoTuristico> atrativosPesquisados = new ArrayList<>();
        for(AtrativoTuristico atrativo: atrativos) {
            if(atrativo.getCidade().equals(cidade) && atrativo.getEstado().equals(estado)) {
                atrativosPesquisados.add(atrativo);
            }
        }
        return atrativosPesquisados;
    }
}
