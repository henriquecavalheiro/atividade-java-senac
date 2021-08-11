public class Carro extends Veiculo {

    private String modelo;
    private String cor;
    private int ano;
    private double velocidade;
    private String marca;
    private String placa;

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerarCarro(boolean acelerar) {
        if (acelerar == true) {
            System.out.println("Carro acelerando.");
        } else {
            System.out.println("Carro parado.");
        }
    }

    public void mostrarVelocidade(double velocidade) {
        System.out.println("A velocidade é " + velocidade);
    }

    public String mostrarVelocidade() {
        return null;
    }

    public boolean gerarMulta() {
        return false;
    }

}
