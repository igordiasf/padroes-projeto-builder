package padroescriacao.builder.exemplo;

import java.util.Date;

public class CarroBuilder {


    private Carro Carro;

    public CarroBuilder() {
        Carro = new Carro();
    }

    public Carro build() {
        if (Carro.getportas() == 0) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
        if (Carro.getmodelo().equals("")) {
            throw new IllegalArgumentException("modelo inválido");
        }
        return Carro;
    }

    public CarroBuilder setportas(int portas) {
        Carro.setportas(portas);
        return this;
    }

    public CarroBuilder setmodelo(String modelo) {
        Carro.setmodelo(modelo);
        return this;
    }

    public CarroBuilder setcor(String cor) {
        Carro.setcor(cor);
        return this;
    }

    public CarroBuilder setrodas(String rodas) {
        Carro.setrodas(rodas);
        return this;
    }

    public CarroBuilder setmotor(String motor) {
        Carro.setmotor(motor);
        return this;
    }

    public CarroBuilder setano(String ano) {
        Carro.setano(ano);
        return this;
    }

}
