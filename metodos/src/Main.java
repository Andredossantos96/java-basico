public class Main {
    public static void main(String[] args) {
        

        // Caulculadora
        System.out.println("Exercicio caulculadora");
        Calculadora.soma(10, 20);
        Calculadora.subtracao(10, 5);
        Calculadora.multiplicacao(7, 5);
        Calculadora.divisao(5, 2.5);
        System.out.println("----------------- ");


        // Mensagem
        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(23);
        System.out.println("----------------- ");


        // Empréstimo
        System.out.println("Exercicio emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
        System.out.println("----------------- ");


        // Quadrilatero
        System.out.println("Exercicio quadrilatero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f);
        System.out.println("----------------- ");


        // Retornos
         System.out.println("Exercicio retornos");

         double areaQuadrado = QuadrilateroRetorno.area(3);
         System.out.println("Área do quadrado: " + areaQuadrado);

         double areaRetangulo = QuadrilateroRetorno.area(5, 5);
         System.out.println("Área do retangulo: " + areaRetangulo);

         double areaTrapezio = QuadrilateroRetorno.area(7, 8, 9);
         System.out.println("Área do trapézio: " + areaTrapezio);

    }
}
