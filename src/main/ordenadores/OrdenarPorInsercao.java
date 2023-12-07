package ordenadores;
public class OrdenarPorInsercao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; ++i) {
            int kvar = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > kvar) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = kvar;
        }

        return array;
    }
}