// YASMIN LOUISE FONTES GUIMARAES
// 1261935138
public class App {
    public static int encontrarMaior(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }

        return maior;
    }

    public static void main(String[]args) {
        int[] valores = {10,20,30,};
        int resultado =  encontrarMaior(valores);
        System.out.println("valor maior:" + resultado);

    }
}
