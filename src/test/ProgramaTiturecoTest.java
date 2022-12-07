package test;
import org.junit.jupiter.api.Test;
import titureco.*;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramaTiturecoTest {

    @Test
    public void testaSeTemMain() {
        ProgramaTitureco programa = new ProgramaTitureco();
        ProgramaTitureco.main(new String[] {});
    }
}