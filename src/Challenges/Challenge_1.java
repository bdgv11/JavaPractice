package Challenges;

import javax.swing.plaf.synth.SynthSplitPaneUI;
import javax.swing.plaf.synth.SynthStyleFactory;
import javax.swing.text.AbstractDocument;
import java.util.Arrays;
import java.util.Locale;

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
        System.out.println(challenge1("Roma", "Amor"));
        System.out.println(challenge1("Roma", "Roma"));
        System.out.println(challenge1("Roma", "Mora"));
        System.out.println(challenge1("Roma", "Rema"));
    }

    public static boolean challenge1(String word1, String word2){

        if(word1 == word2){
            return false;
        }

        String s1 = word1.toLowerCase();
        String s2 = word2.toLowerCase();

        char [] text1 = s1.toCharArray();
        char [] text2 = s2.toCharArray();

        Arrays.sort(text1);
        Arrays.sort(text2);

        return Arrays.equals(text1, text2);
    }
}
