public class Welcome {
    public static void main(String[] args) {

        //Crea un array que contenga 5 nombres de coders y con un bucle 'for-each' imprime:
        // ¡Hola <name>, bienvenida a Java!
        System.out.println("Ejercicio 1");
        System.out.println();
        String[] names = {"May", "Bruna", "Lara", "Nia", "Débora"};
        for (String name : names) {
            System.out.println("¡Hola " + name + ", bienvenida a Java!");
        }

        System.out.println();
        System.out.println("Ejercicio 2");
        System.out.println();
        //Escribe un bucle 'for' que imprima solo los siguientes números: 10 - 30 - 50 - 70 - 90 del array numbers,
        // sin modificarlo ni creando uno nuevo
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (int i = 0; i < numbers.length; i+=2) {
            System.out.println(numbers[i]);
        }

        System.out.println();
        System.out.println("Ejercicio 3");
        System.out.println();
        //Crea un array que contenga algunos números y usa un bucle 'for-each'
        // e imprime cada número duplicado (multiplicado por 2)
        int[] nums = {1, 2, 3, 4, 5};
        for (int num : nums) {
            System.out.println(num*2);
        }

        System.out.println();
        System.out.println("Ejercicio 4");
        System.out.println();
        //Crea un array de tipo char que contenga las vocales en minúsculas y usa un bucle 'for-each' e imprime cada vocal en mayúsculas
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels) {
            System.out.println(Character.toUpperCase(vowel));
        }

    }
}
