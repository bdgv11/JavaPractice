package Challenges;

import javax.swing.tree.RowMapper;

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Bool) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 */

public class Challenge_1 {

    public static void main(String[] args) {
        challenge1("roma", "amor");
    }

    static boolean challenge1(String word1, String word2){
        if (word1.toLowerCase() == word2.toLowerCase()) {
            return false;            
        }else{
            return false;
        }
    }    
}
