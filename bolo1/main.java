package ExercicioFabricaDeBolos.bolo1;

import java.util.*;

public class main {
    public static void main(String[] args) {

        String nome;
        String tipo;
        float preco;
        int indiceReceita;

        Scanner input = new Scanner(System.in);
        bolo bolo = new bolo();

        System.out.println("Entre com o nome do bolo (Entre Floresta Negra, Abacaxi, Choconinho ou Prestígio):");
        nome = input.next();
        System.out.println("Entre com o tipo do bolo:");
        tipo = input.next();
        System.out.println("Entre com o preço: ");
        preco = input.nextFloat();
        System.out.println("Escolha um bolo para saber sobre e a receita:\n1 - Floresta Negra;\n2 - Abacaxi;\n3 - Choconinho;\n4 - Prestígio.");
        indiceReceita = input.nextInt();

        bolo.setNome(nome);
        bolo.setPreco(preco);
        bolo.setIndiceReceita(indiceReceita);

        System.out.println(bolo.toString());

    }
}
