package ExercicioFabricaDeBolos.bolo2;

public class BoloMain {
    public static void main(String[] args) {

        /*Quais os benefícios encontrados??*/

        /*Permite o encapsulamento do código que vai criar os objetos, também viabiliza a criação dos objetos em um
        único método e tendo apenas uma classe para a manutenção fácil e ágil do código.*/

        BoloFactory bb = new BoloFactory();

        Forma f1 = bb.getBolos(BoloFactory.bolos.Choconinho);
        f1.sobreoBolo();
        f1.receita();

        Forma f2= bb.getBolos(BoloFactory.bolos.FlorestaNegra);
        f1.sobreoBolo();
        f1.receita();
        
        Forma f3 = bb.getBolos(BoloFactory.bolos.Prestigio);
        f1.sobreoBolo();
        f1.receita();

        Forma f4 = bb.getBolos(BoloFactory.bolos.Abacaxi);
        f1.sobreoBolo();
        f1.receita();
    }
}
