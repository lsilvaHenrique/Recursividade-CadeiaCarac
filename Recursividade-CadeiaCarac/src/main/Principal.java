package main;

public class Principal {

    // Função recursiva para inverter uma string usando a função substring
    private static String inverterString(String str) {
        // Condição de parada: quando a string tem apenas um caractere
        if (str.length() <= 1) {
            return str;
        }

        // Relação de chamada dos passos: inverter a substring que exclui o primeiro e último caracteres
        char firstChar = str.charAt(0);
        String remaining = str.substring(1, str.length() - 1);
        char lastChar = str.charAt(str.length() - 1);

        return lastChar + inverterString(remaining) + firstChar;
    }
}
