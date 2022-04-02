package ExercicioFabricaDeBolos.bolo1;

public class bolo {
    
    private String nome;
    private String tipo;
    private float preco;
    private int indiceReceita;

    //Setters e Getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getIndiceReceita() {
        return indiceReceita;
    }

    public void setIndiceReceita(int indiceReceita) {
        this.indiceReceita = indiceReceita;
    }

    //Método sobreoBolo
    public String sobreoBolo() {
        if (indiceReceita == 1) {
            System.out.println("O bolo Floresta Negra é uma sobremesa alemã\ncomposto de algumas camadas de bolo de chocolate\ncom chantilly e cerejas entre cada camada");
        } else if (indiceReceita == 2) {
            System.out.println("O bolo de abacaxi é uma sobremesa tradicional brasileira\ncomposta geralmente de geléia de abacaxi e\nrodelas para decorar");
        } else if(indiceReceita == 3) {
            System.out.println("O bolo Choconinho é uma sobremesa composta de um bolo de chocolate\ncom um recheio duplo de ganache de chocolate e\num creme feito de leite ninho");
        } else if (indiceReceita == 4) {
            System.out.println("O bolo Prestígio é uma sobremesa feita de um bolo de chocolate com cobertura de brigadeiro\ne um recheio de creme de coco");
        }
        return nome;
    }

    //Método receita
    public String receita() {
        switch (indiceReceita) {
            case 1:
                sobreoBolo();
                System.out.println("Receita para bolo Floresta Negra");
                break;
            case 2:
                sobreoBolo();
                System.out.println("Receita para bolo de Abacaxi");
                break;
            case 3:
                sobreoBolo();
                System.out.println("Receita para bolo Choconinho");
                break;
            case 4:
                sobreoBolo();
                System.out.println("Receita para bolo Prestígio");
                break;
            default:
                break;
        }
        return nome;
    }


    //Construtor
    public bolo() {
        this.nome = "";
        this.tipo = "";
        this.preco = 0;
    }
    public bolo(String nome, String tipo, float preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String toString() {
        return sobreoBolo() + receita();
    }

}
