public class Atleta {
    private String nome;
    private int idade;

    // Construtor
    public Atleta(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getters e Setters para idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para imprimir os dados do atleta
    public void imprimirDados() {
        System.out.println("Nome do Atleta: " + nome);
        System.out.println("Idade do Atleta: " + idade);
        System.out.println("Categoria do Atleta: " + verificarCategoria());
    }

    // Método para verificar a categoria do atleta
    public String verificarCategoria() {
        if (idade >= 5 && idade <= 7) {
            return "Infantil";
        } else if (idade >= 8 && idade <= 10) {
            return "Juvenil";
        } else if (idade >= 11 && idade <= 15) {
            return "Adolescente";
        } else if (idade >= 16 && idade <= 30) {
            return "Adulto";
        } else {
            return "Sênior";
        }
    }

    // Método main para testar a classe Atleta
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("João", 8);
        atleta1.imprimirDados();
    }
}
