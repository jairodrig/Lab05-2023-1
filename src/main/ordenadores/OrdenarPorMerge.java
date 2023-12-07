package ordenadores;
public class OrdenarPorMerge implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        return array;
    }

    public int[] merge(int[] array1, int[] array2) {
        int taman1= array1.length;
        int taman2= array2.length;
        int[] nArray = new int[taman1 + taman2];

        int i= 0, j= 0, k= 0;

        while (i<taman1 && j<taman2) {
            if (array1[i]< array2[j]) {
                nArray[k++] = array1[i++];
            } else {
                nArray[k++] = array2[j++];
            }
        }
        while (i < taman1) {
            nArray[k++] = array1[i++];
        }
        while (j < taman2) {
            nArray[k++] = array2[j++];
        }
        return nArray;
    }
}