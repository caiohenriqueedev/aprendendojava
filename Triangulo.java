import java.util.Scanner;

class Triangulo {
    private double base;
    private double altura;

    public Triangulo() {
        this.base = 0.0;
        this.altura = 0.0;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaArea() {
        return base * altura / 2;
    }

    public void imprimeDados() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calculaArea());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciando um Triangulo usando o construtor padrão
        Triangulo triangulo1 = new Triangulo();

        // Pedindo ao usuário os valores da base e da altura
        System.out.println("Digite o valor da base do triângulo:");
        double base = scanner.nextDouble();
        System.out.println("Digite o valor da altura do triângulo:");
        double altura = scanner.nextDouble();

        // Definindo os valores da base e da altura utilizando os métodos de acesso
        triangulo1.setBase(base);
        triangulo1.setAltura(altura);

        // Imprimindo os dados e a área
        System.out.println("Triângulo 1:");
        triangulo1.imprimeDados();

        // Instanciando um Triangulo usando o construtor com parâmetros
        Triangulo triangulo2 = new Triangulo(3.0, 4.0);

        // Imprimindo os dados e a área
        System.out.println("\nTriângulo 2:");
        triangulo2.imprimeDados();

        scanner.close();
    }
}
