package algorithms;

/**
 * Предполагается, что первый элемент списка отсортирован. Переходим к следующему элементу, обозначим его i. Если х больше первого, оставляем его на своём месте. Если он меньше, копируем его на вторую позицию, а i устанавливаем в качестве первого элемента. Переходя к другим элементам несортированного сегмента, перемещаем более крупные элементы в отсортированном сегменте вверх по списку, пока не встретим элемент меньше i или не дойдём до конца списка. В первом случае i помещается на правильную позицию. Сложность алгоритма: О(n2) для сравнений и перестановок.
 */
public class InsertionsSort {

    public static void insertionSort(int[] sortArr) {
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < sortArr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }

    public static void main(String args[]) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        insertionSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\n");
        }
    }
}
