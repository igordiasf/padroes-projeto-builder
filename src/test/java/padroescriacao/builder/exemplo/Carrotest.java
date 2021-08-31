package padroescriacao.builder.exemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Carrotest {


    @Test
    void deveRetornarCarroValido() {
        CarroBuilder CarroBuilder = new CarroBuilder();
        Carro Carro = CarroBuilder
                .setportas(2)
                .setmodelo("Carro Fusca")
                .setmotor("1300")
                .setrodas("roda de ferro")
                .setano("1980")
                .build();

        assertNotNull(Carro);
    }
}


