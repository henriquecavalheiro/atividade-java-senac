public class Moto extends Veiculo {

    private String modelo;
    private String marca;
    private String cor;
    private int ano;
    private double velocidade;
    private String placa;

    public Moto() {
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerarMoto(boolean acelerar) {
        if (acelerar == true) {
            System.out.println("Moto acelerando.");
        } else {
            System.out.println("Moto parada.");
        }
    }

    public void mostrarVelocidade(double velocidade) {
        System.out.println("A velocidade da moto é " + velocidade);
    }

    public String mostrarVelocidade() {
        return null;
    }

    public boolean gerarMulta() {
        return false;
    }

}
