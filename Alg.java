import java.util.ArrayList;
import java.util.List;

public class Alg {

    public static int contarNumerosInteiros(Object[] arr) {
        int contador = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Integer) {
                contador++;
            }
        }
        return contador;
    }

//--------------------------------------------

    public static List<Integer> quicksort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }

        int pivot = arr.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < pivot) {
                left.add(arr.get(i));
            } else {
                right.add(arr.get(i));
            }
        }

        List<Integer> sortedLeft = quicksort(left);
        List<Integer> sortedRight = quicksort(right);

        List<Integer> sortedArray = new ArrayList<>();
        sortedArray.addAll(sortedLeft);
        sortedArray.add(pivot);
        sortedArray.addAll(sortedRight);

        return sortedArray;
    }

//--------------------------------------------

    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


//--------------------------------------------

    public static int fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }

//--------------------------------------------

    public static int somatorio(int[] arr) {
        int soma = 0;

        for (int i = 0; i < arr.length; i++) {
            soma += arr[i];
        }

        return soma;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

//--------------------------------------------MAIN---------------------------

    public static void main(String[] args) {

        System.out.println("Contar numeros inteiros em um array");

        Object[] array = {1, 2, 3, 4, 5, 1.5, "texto", true, -3};
        int numerosInteiros = contarNumerosInteiros(array);
        System.out.println("O array contém " + numerosInteiros + " números inteiros.");

        System.out.println("-------------");
        System.out.println("-------------");

//--------------------------------------------

        System.out.println("Quicksort");

        List<Integer> arrayDesordenado = new ArrayList<>();
        arrayDesordenado.add(6);
        arrayDesordenado.add(1);
        arrayDesordenado.add(8);
        arrayDesordenado.add(4);
        arrayDesordenado.add(9);
        arrayDesordenado.add(2);
        arrayDesordenado.add(5);

        List<Integer> arrayOrdenado = quicksort(arrayDesordenado);
        System.out.println("Array ordenado: " + arrayOrdenado);

        System.out.println("-------------");
        System.out.println("-------------");

//--------------------------------------------

        System.out.println("MDC");

        int numero1 = 36;
        int numero2 = 48;
        int resultadoMDC = calcularMDC(numero1, numero2);
        System.out.println("O MDC de " + numero1 + " e " + numero2 + " é " + resultadoMDC);

        System.out.println("-------------");
        System.out.println("-------------");


//--------------------------------------------

            System.out.println("Somatorio");

            int[] conjuntoDeNumeros = {1, 2, 3, 4, 5};
            int resultado = somatorio(conjuntoDeNumeros);
            System.out.println("O somatório do conjunto é: " + resultado);

            System.out.println("-------------");
            System.out.println("-------------");

//--------------------------------------------

            System.out.println("Verificar se numero é primo");

            int numero = 17;
            if (isPrime(numero)) {
                System.out.println(numero + " é primo.");
            } else {
                System.out.println(numero + " não é primo.");
            }

            System.out.println("-------------");
            System.out.println("-------------");

//--------------------------------------------

        System.out.println("Fibonacci");

        int numeroDeTermos = 10;
        for (int i = 0; i < numeroDeTermos; i++) {
            System.out.println(fibonacciRecursivo(i));
            System.out.println("-------------");

        }
    }
}

