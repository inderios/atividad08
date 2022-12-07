package test;
import titureco.AtrativoTuristico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AtrativoTuristicoTest {
    @Test
    public void testeGeralAtrativo() {
        AtrativoTuristico at1 = new AtrativoTuristico();
        assertTrue(at1.getNome().equals(""));

        AtrativoTuristico at2 = new AtrativoTuristico("Busto de Tamandaré", -7.11904, -34.82366,
                "Epitácio Pessoa até o fim",
                "João Pessoa", "PB");
        assertTrue(at2.getNome().equals("Busto de Tamandaré"));
    }
    @Test
    public void testeGeralAtrativo2()
    }
}