public class Main {
    public static void main(String[] args) {
        // Criando um funcionário usando o construtor vazio
        primeiroexercicioA funcionario1 = new primeiroexercicioA();
        
        // Criando outro funcionário usando o construtor com parâmetros
        primeiroexercicioA funcionario2 = new primeiroexercicioA("Maria", "Analista de Marketing", 4500.0);
        
        // Imprimindo informações dos funcionários
        System.out.println("Funcionário 1:");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Salário: " + funcionario1.getSalario());
        
        System.out.println("\nFuncionário 2:");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Cargo: " + funcionario2.getCargo());
        System.out.println("Salário: " + funcionario2.getSalario());
        
        // Alterando o salário do funcionário 1
        funcionario1.setSalario(3200.0);
        
        // Imprimindo novamente as informações do funcionário 1 após a alteração
        System.out.println("\nFuncionário 1 após aumento de salário:");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Salário: " + funcionario1.getSalario());
    }
}
