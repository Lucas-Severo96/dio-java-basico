package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar açoes ou efeitos colaterais nos elementos do Stream sem modificar
 * ou retornar um valor.
 * */
public class ConsumerExample {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Usar consumer com expressao lambda para imprimir numeros pares
        /*
        Consumer<Integer> imprimirNumeroPar = numero -> {

          if(numero % 2 == 0) {
              System.out.println(numero);
          }
        };
        */
        //Usar o Consumer para imprimir numeros pares no Stream
        /*
        numeros.forEach(n -> {
            if(n % 2 == 0) {
                System.out.println(n);
            }
        });
        */

        Optional<String> optionalValue = Optional.ofNullable("01");
        String result = optionalValue.orElseGet(() -> "Value from Supplier");
        System.out.println(result);
    }
}
