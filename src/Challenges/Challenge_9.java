package Challenges;

/*
 * Reto #9
 * CÓDIGO MORSE
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "-", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 */

 // TODO Fix this!
public class Challenge_9 {

    public static void main(String[] args) {
        convertToMorse("Hello my name is Bryan");
    }

    public static void convertToMorse(String text) {

    String a = ".- ";
    String b = "-... ";
    String c = "-.-. ";
    String ch = "---- ";
    String d = "-.. ";
    String e = ". ";
    String f = "..-. ";
    String g = "--. ";
    String h = ".... ";
    String i = ".. ";
    String j = ".--- ";
    String k = "-.- ";
    String l = ".-.. ";
    String m = "-- ";
    String n = "-. ";
    String ñ = "--.-- ";
    String o = "--- ";
    String p = ".--. ";
    String q = "--.- ";
    String r = ".-. ";
    String s = "... ";
    String t = "- ";
    String u = "..- ";
    String v = "...- ";
    String w = ".-- ";
    String x = "-..- ";
    String y = "-.-- ";
    String z = "--.. ";

        char[] charText = text.toLowerCase().toCharArray();
        String newText = "";

        for (int index = 0; index < charText.length; index++) {

            switch (charText[index]) {
                case 'a':
                    newText = newText + a;                    
                    break;

                case 'b':
                    newText = newText + b;                    
                    break;

                case 'c':
                    newText = newText + c;                    
                    break;

                case 'd':
                    newText = newText + d;                    
                    break;

                case 'e':
                    newText = newText + e;                    
                    break;

                case 'f':
                    newText = newText + f;                    
                    break;

                case 'g':
                    newText = newText + g;                    
                    break;

                /*case 'ch':
                    newText = newText + ch;                    
                    break;*/

                case 'h':
                    newText = newText + h;                    
                    break;

                case 'i':
                    newText = newText + i;                    
                    break;

                case 'j':
                    newText = newText + j;                    
                    break;

                case 'k':
                    newText = newText + k;                    
                    break;

                case 'l':
                    newText = newText + l;                    
                    break;

                case 'm':
                    newText = newText + m;                    
                    break;

                case 'n':
                    newText = newText + n;                    
                    break;

                case 'ñ':
                    newText = newText + ñ;                    
                    break;

                case 'o':
                    newText = newText + o;                    
                    break;

                case 'p':
                    newText = newText + p;                    
                    break;

                case 'q':
                    newText = newText + q;                    
                    break;  
                
                case 'r':
                    newText = newText + r;                    
                    break; 

                case 's':
                    newText = newText + s;                    
                    break; 
                
                case 't':
                    newText = newText + t;                    
                    break; 

                case 'u':
                    newText = newText + u;                    
                    break; 

                case 'v':
                    newText = newText + v;                    
                    break; 

                case 'w':
                    newText = newText + w;                    
                    break; 

                case 'x':
                    newText = newText + x;                    
                    break; 

                case 'y':
                    newText = newText + y;                    
                    break; 

                case 'z':
                    newText = newText + z;                    
                    break; 

                case ' ':
                    newText = newText + " / ";                    
                    break; 
            
                default:
                    break;
            }
        }
        System.out.println(newText);
    }
}