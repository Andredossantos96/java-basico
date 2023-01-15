public class RodarAplicacao {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Vermelho");
        carro1.setModelo("Ferrari");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));
        System.out.println("---------------");

        Carro carro2 = new Carro("Preto", "Fiat Uno", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));
        
    }
}
