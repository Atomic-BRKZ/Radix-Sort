import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        /*
        lista.insertar(10);
        lista.insertar(11);
        lista.insertar(54214);
        lista.radixSort();
        
        */
        for(int i = 0; i < 1000001; ++i){
            Random Rand = new Random();
            int x = Rand.nextInt(100001);

            lista.insertar(x);
        }

        lista.radixSort();
        lista.recorrer();
        

    }
}
