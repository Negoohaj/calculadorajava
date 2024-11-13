import java.util.Scanner;

class Calculadora {
    private int num1;
    private int num2;

    // Construtor - Inicializa os valores
    public Calculadora(int numero1, int numero2) {
        this.num1 = numero1;
        this.num2 = numero2;
    }

    // Getters e Setters para os atributos num1 e num2
    public int getNum1() {
        return num1;
    }

    public void setNum1(int numero1) {
        this.num1 = numero1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int numero2) {
        this.num2 = numero2;
    }

    // Método para somar
    public int somar() {
        return this.num1 + this.num2;
    }

    // Método para subtrair
    public int subtrair() {
        return this.num1 - this.num2;
    }

    // Método para dividir - verifica divisão por zero
    public int dividir() {
        if (this.num2 == 0) {
            System.out.println("Erro: divisão por zero não é permitida.");
            return 0;
        } else {
            return this.num1 / this.num2;
        }
    }

    // Método para multiplicar
    public int multiplicar() {
        return this.num1 * this.num2;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String operador;

        System.out.println("Calculadora Simples - Digite '.' para finalizar");

        // Loop principal para manter a calculadora ativa
        while (true) {
            System.out.print("Digite o operador desejado (+, -, /, *): ");
            operador = entrada.next();

            // Verifica se o usuário quer encerrar
            if (operador.equals(".")) {
                System.out.println("Finalizando a calculadora...");
                break;
            }

            // Solicita os números para a operação
            System.out.print("Primeiro número: ");
            int numero1 = entrada.nextInt();

            System.out.print("Segundo número: ");
            int numero2 = entrada.nextInt();

            // Cria uma nova calculadora com os números fornecidos
            Calculadora calc = new Calculadora(numero1, numero2);

            // Seleciona a operação com base no operador fornecido
            if (operador.equals("+")) {
                System.out.println("Resultado da soma: " + calc.somar());
            } else if (operador.equals("-")) {
                System.out.println("Resultado da subtração: " + calc.subtrair());
            } else if (operador.equals("/")) {
                System.out.println("Resultado da divisão: " + calc.dividir());
            } else if (operador.equals("*")) {
                System.out.println("Resultado da multiplicação: " + calc.multiplicar());
            } else {
                System.out.println("Operador inválido. Por favor, tente novamente.");
            }
        }

        entrada.close();
    }
}