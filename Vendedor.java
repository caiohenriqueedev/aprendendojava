public class Vendedor {
    private float vendas;
    private float salario;
    private String nome;
    private int falta;
    
    // Construtor
    public Vendedor(float v, float s, String n, int f) {
        vendas = v;
        salario = s;
        nome = n;
        falta = f;
    }
    
    // Sets e Gets
    public void setVendas(float v) {
        vendas = v;
    }
    
    public float getVendas() {
        return vendas;
    }
    
    public void setSalario(float s) {
        salario = s;
    }
    
    public float getSalario() {
        return salario;
    }
    
    public void setNome(String n) {
        nome = n;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setFalta(int f) {
        falta = f;
    }
    
    public int getFalta() {
        return falta;
    }
    
    // Método para imprimir dados do vendedor
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Vendas: R$" + vendas);
        System.out.println("Salário: R$" + salario);
        System.out.println("Faltas: " + falta);
    }
    
    // Método para calcular a comissão
    public float calcularComissao() {
        if (vendas >= 1000 && vendas < 2000) {
            return vendas * 0.10f;
        } else if (vendas >= 2000) {
            return vendas * 0.15f;
        } else {
            return 0.0f;
        }
    }
    
    // Método para calcular o desconto das faltas
    public float descontoFalta() {
        return (salario / 30) * falta;
    }
    
    // Método para calcular o salário final
    public void calcularSalario() {
        float comissao = calcularComissao();
        float desconto = descontoFalta();
        salario = salario + comissao - desconto;
    }
    
    // Método main para testar a classe
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor(1500.0f, 2000.0f, "João", 2);
        vendedor.imprimirDados();
        vendedor.calcularSalario();
        System.out.println("Salário final: R$" + vendedor.getSalario());
    }
}
