/**
 * <p><strong>Projeto Calculadora</strong></p>
 *
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão, além de um método principal que seleciona a operação
 * desejada com base em um operador informado pelo usuário.</p>
 *
 * <p>Este projeto é utilizado para demonstrar:</p>
 * <ul>
 *     <li>Técnicas de revisão estática (caixa branca)</li>
 *     <li>Aplicação de refatoração em código Java</li>
 *     <li>Documentação utilizando Javadoc</li>
 *     <li>Boas práticas de código limpo e métodos puros</li>
 * </ul>
 *
 * <p>Após a refatoração, todos os métodos desta classe são <strong>métodos puros</strong>,
 * ou seja, não possuem efeitos colaterais, retornando sempre os mesmos resultados
 * para os mesmos valores de entrada. Isso facilita testes unitários, manutenção e
 * legibilidade.</p>
 *
 * @author Seu Nome
 * @version 1.0
 */
public class Calculadora {

    /**
     * Realiza a soma entre dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return a soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração entre dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da subtração de {@code a} por {@code b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação entre dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o produto entre {@code a} e {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão entre dois números inteiros.
     *
     * <p>Se o divisor for igual a zero, uma exceção é lançada para impedir
     * que o programa continue com um cálculo inválido.</p>
     *
     * @param a primeiro operando (dividendo)
     * @param b segundo operando (divisor)
     * @return o resultado da divisão entre {@code a} e {@code b}
     *
     * @throws IllegalArgumentException se {@code b} for igual a zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * <p>Executa a operação matemática solicitada com base no operador informado.</p>
     *
     * <p>Operadores aceitos:</p>
     * <ul>
     *     <li>"+": Soma</li>
     *     <li>"-": Subtração</li>
     *     <li>"*": Multiplicação</li>
     *     <li>"/": Divisão</li>
     * </ul>
     *
     * <p>Caso o operador seja inválido, uma exceção é lançada para evitar comportamentos imprevisíveis.</p>
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador símbolo da operação desejada
     * @return o resultado da operação escolhida
     *
     * @throws IllegalArgumentException se o operador informado não for válido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}
