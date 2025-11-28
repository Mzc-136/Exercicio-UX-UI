

public class TesteCalculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println("Teste 1: " + calc.calc(2, 3, "+"));  // esperado: 5
        System.out.println("Teste 2: " + calc.calc(10, 4, "-")); // esperado: 6
        System.out.println("Teste 3: " + calc.calc(3, 5, "*"));  // esperado: 15
        System.out.println("Teste 4: " + calc.calc(8, 2, "/"));  // esperado: 4
        System.out.println("Teste 5: " + calc.calc(8, 0, "/"));  // divisão por zero
        System.out.println("Teste 6: " + calc.calc(5, 5, "x"));  // operação inválida
    }
}
