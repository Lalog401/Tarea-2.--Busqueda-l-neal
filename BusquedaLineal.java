public class BusquedaLineal {
    public static Object[] busqueda(int[] lista, int piv) {  // S(n) = 1
        int i = 0;  // T(n) = 1   S(n) = 1
        for (int x : lista) {  // T(n) = n   S(n) = 1
            if (x == piv) {  // T(n) = 1
                return new Object[]{true, i};  // T(n) = 1
            } else {
                i++;  // T(n) = 1
            }
        }
        return new Object[]{false, null};  // T(n) = 1
    }

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 56, 78, 9, 0, 23, 65, 36, 5};  // T(n) = n   S(n) = n
        int num = 77;  // T(n) = 1   S(n) = 1
        Object[] resultado = busqueda(arreglo, num);  // T(n) = 1   S(n) = 2
        boolean encontrado = (boolean) resultado[0];
        Integer numI = (Integer) resultado[1];

        if (encontrado) {  // T(n) = 1
            System.out.println("El número " + num + " fue encontrado dentro del arreglo :)");
            System.out.println("El número de comparaciones fue: " + (numI + 1));
        } else {
            System.out.println("El número " + num + " no ha sido encontrado :(");  // T(n) = 1
        }

        // Mostrar las ecuaciones de complejidad
        System.out.println("\nEcuaciones de complejidad:");
        System.out.println("T(n) = 2n + 8");
        System.out.println("S(n) = n + 6");
    }
}
