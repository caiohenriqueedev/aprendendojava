public class primeiroexercicioA {
    private String nome;
    private String cargo;
    private double salario;

    // Construtor vazio
    public primeiroexercicioA() {
        this.cargo = "assistente";
    }

    // Construtor com parâmetros
    public primeiroexercicioA(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método toString para imprimir informações do funcionário
    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + '}';
    }
}


