package org.example;

public class Utils {




    public static <T extends Number> void quickSort(T [] vector, int izquierda, int derecha, boolean ordenAscendente) {
        if (vector == null || vector.length == 0) {
            return;
        }

        int indiceCentral = izquierda + (derecha - izquierda) / 2;
        //T pivote = vector[indiceCentral];
        int pivote = ((Number) vector[indiceCentral]).intValue ();

        int i = izquierda;
        int j = derecha;
        while (i <= j) {
            if (ordenAscendente) {
                while (((Number) vector[i]).intValue () < pivote) {
                    i++;
                }
                while (((Number) vector[j]).intValue () > pivote) {
                    j--;
                }
            } else {
                while (((Number) vector[i]).intValue () > pivote) {
                    i++;
                }
                while (((Number) vector[j]).intValue () < pivote) {
                    j--;
                }
            }
            if (i <= j) {
                T auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
                i++;
                j--;
            }
        }
        if (izquierda < j) {
            quickSort(vector, izquierda, j, ordenAscendente);
        }
        if (i < derecha) {
            quickSort(vector, i, derecha, ordenAscendente);
        }
    }
}
