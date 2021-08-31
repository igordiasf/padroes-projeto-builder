package padroescriacao.builder.exemplo;

import java.util.Date;

public class Carro {

    private int portas;
    private String modelo;
    private String cor;
    private String rodas;
    private String motor;
    private String ano;

    public Carro() {
        this.portas = 0;
        this.modelo = "";
    }

    public int getportas() {
        return portas;
    }

    public void setportas(int portas) {
        this.portas = portas;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public String getcor() {
        return cor;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public String getrodas() {
        return rodas;
    }

    public void setrodas(String rodas) {
        this.rodas = rodas;
    }

    public String getmotor() {
        return motor;
    }

    public void setmotor(String motor) {
        this.motor = motor;
    }

    public String getano() {
        return ano;
    }

    public void setano(String ano) {
        this.ano = ano;
    }
}
