package titureco;
import javax.swing.JOptionPane;
import java.util.List;

public class ProgramaTitureco {

    public static void main(String[] args) {
        boolean sair = true;
        while(sair) {
            int resposta = Integer.parseInt(JOptionPane.showInputDialog(null, "1:Cadastra Atrativo " +
                    "\n2:Apagar Atrativo \n3:Todos os atrativos \n4: Procurar um atrativo \n5: sair"));
            TiturecoInterface sistema = new TiturecoList();
            switch (resposta) {
                case 1:
                    String nome, comoChegar, cidade, estado;
                    double latitude, longitude;
                    int praia = JOptionPane.showConfirmDialog(null, "O local a se cadastrado é uma praia ?");
                    AtrativoTuristico novoAtrativo;
                    nome = JOptionPane.showInputDialog(null, "Nome do atrativo:");
                    latitude = Double.parseDouble(JOptionPane.showInputDialog(null, "Latitude:"));
                    longitude = Double.parseDouble(JOptionPane.showInputDialog(null, "Longitude:"));
                    comoChegar = JOptionPane.showInputDialog(null, "Como é possivel chegar ao local:");
                    cidade = JOptionPane.showInputDialog(null, "Cidade:");
                    estado = JOptionPane.showInputDialog(null, "Estado");
                    novoAtrativo = new AtrativoTuristico(nome, latitude, longitude, comoChegar, cidade, estado);
                    if (praia == JOptionPane.YES_OPTION) {
                        boolean propriaParaBanho = false, perigoTubaroes = true;
                        int auxiliarBanho = JOptionPane.showConfirmDialog(null, "É propria para banho?");
                        int auxiliarTubaroes = JOptionPane.showConfirmDialog(null, "Tem tubarões?");
                        if (auxiliarBanho == JOptionPane.YES_OPTION) {
                            propriaParaBanho = true;
                        }
                        if (auxiliarTubaroes == JOptionPane.NO_OPTION) {
                            perigoTubaroes = false;
                        }
                        String[] opcoes = new String[]{Praia.TIPO_ONDAS_MEDIAS, Praia.TIPO_ONDAS_FORTES, Praia.TIPO_PISCINAS_NATURAIS};
                        String tipoOrla = (String) JOptionPane.showInputDialog(null, "Selecione o tipo de orla\n",
                                "opções", JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
                        novoAtrativo = new Praia(nome, latitude, longitude, comoChegar, cidade, estado,
                                propriaParaBanho, perigoTubaroes, tipoOrla);
                    }
                    if (sistema.cadastrarAtrativo(novoAtrativo)) {
                        JOptionPane.showMessageDialog(null, "Sucesso ao adicionar");
                    } else {
                        JOptionPane.showMessageDialog(null, "Falha");
                    }
                    break;
                case 2:
                    //apagar atrativo
                    nome = JOptionPane.showInputDialog(null, "Nome do atrativo para apagar:");
                    cidade = JOptionPane.showInputDialog(null, "Cidade do atrativo à apagar:");
                    estado = JOptionPane.showInputDialog(null, "Estado");
                    if (sistema.apagarAtrativo(nome, cidade, estado)){
                        JOptionPane.showMessageDialog(null, "Sucesso ao apagar");
                    }else {
                        JOptionPane.showMessageDialog(null,"Falha ao apagar");
                    }
                    break;
                case 3:
                    List<AtrativoTuristico> todosOsAtrativos = sistema.getAtrativos();
                    String nomeTodosAtrativos = null;
                    JOptionPane.showMessageDialog(null,todosOsAtrativos.size());
                    for(AtrativoTuristico atrativo: todosOsAtrativos) {
                        nomeTodosAtrativos += atrativo.getNome() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, nomeTodosAtrativos);
                    break;
                case 4:
                    cidade = JOptionPane.showInputDialog(null, "Nome da cidade a ser pesquisada");
                    estado = JOptionPane.showInputDialog(null, "Estado da cidade:");
                    List<AtrativoTuristico> atrativosDaCidade = sistema.pesquisaAtrativosDaCidade(cidade, estado);
                    String nomeAtrativosDaCidade = null;
                    for(AtrativoTuristico atrativo: atrativosDaCidade) {
                        nomeAtrativosDaCidade += atrativo.getNome() + " " + atrativo.getComoChegar() +"\n";
                    }
                    JOptionPane.showMessageDialog(null, nomeAtrativosDaCidade);
                    break;
                case 5:
                    sair = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Comando não reconhecido pelo sistema!");
            }
        }
    }
}
