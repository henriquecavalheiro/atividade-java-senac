
public class TesteMain extends Veiculo {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        Moto m1 = new Moto();

        m1.setModelo("Honda");
        m1.setCor("Branco");
        m1.setAno(2014);
        m1.setVelocidade(90.00);
        m1.setMarca("Honda");
        m1.setPlaca("AME4A14");

        c1.setModelo("EcoSport");
        c1.setCor("vermelho");
        c1.setAno(2010);
        c1.setVelocidade(50.00);
        c1.setMarca("Ford");
        c1.setPlaca("BRA2E19");

        if (c1.getVelocidade() >= 80.00) {
            System.out.println("O carro do modelo " + c1.getModelo() + ", placa: " + c1.getPlaca()
                    + "ultrapassou 80km/h; Multa = R$1000");
        } else {
            System.out.println("A velocidade do carro é  " + c1.getVelocidade());
        }

        if (m1.getVelocidade() >= 80.00) {
            System.out.println("A moto do modelo " + m1.getModelo() + ", placa: " + m1.getPlaca()
                    + "ultrapassou 80km/h; Mlta = R$1000");
        } else {
            System.out.println("A velocidade da moto é " + m1.getVelocidade());
        }

    }

    public String mostrarVelocidade() {
        return null;
    }

    public boolean gerarMulta() {
        return false;
    }

}