
/**
 * <p><strong>Classe de Testes da Calculadora</strong></p>
 *
 * <p>Esta classe é responsável por realizar testes manuais da classe
 * {@link Calculadora}, verificando o comportamento dos métodos de operações
 * matemáticas. Cada teste imprime no console o valor retornado e contém um
 * comentário indicando o resultado esperado.</p>
 *
 * <p>Os testes incluem:</p>
 * <ul>
 *     <li>Operações válidas: soma, subtração, multiplicação e divisão</li>
 *     <li>Divisão por zero (deve lançar exceção ou tratar erro)</li>
 *     <li>Operador inválido (deve lançar exceção)</li>
 * </ul>
 *
 * <p>Esta classe não faz parte da lógica da calculadora, mas sim demonstra
 * como validar visualmente o funcionamento do sistema e serve como apoio ao
 * processo de revisão estática e refatoração.</p>
 *
 * @author Seu Nome
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Método principal responsável por executar os testes da classe {@link Calculadora}.
     *
     * <p>Cada chamada ao método {@code calc} é acompanhada de um comentário
     * indicando o resultado esperado para facilitar a verificação no console.</p>
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println("Teste 1: " + calc.calcular(2, 3, "+"));   // esperado: 5
        System.out.println("Teste 2: " + calc.calcular(10, 4, "-"));  // esperado: 6
        System.out.println("Teste 3: " + calc.calcular(3, 5, "*"));   // esperado: 15
        System.out.println("Teste 4: " + calc.calcular(8, 2, "/"));   // esperado: 4

        // Deve lançar exceção devido à divisão por zero
        System.out.println("Teste 5: " + calc.calcular(8, 0, "/"));

        // Deve lançar exceção devido ao operador inválido
        System.out.println("Teste 6: " + calc.calcular(5, 5, "x"));
    }
}
