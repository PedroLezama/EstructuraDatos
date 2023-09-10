import java.util.ArrayList;
import java.util.Set;

public class FILA {
    int[] cuerpo;
    int ultimo;
    int tamanio;
    int i;
    public FILA() {
    }

    public FILA(int[] cuerpo, int ultimo, int tamanio) {
        this.cuerpo = cuerpo;
        this.ultimo = ultimo;
        this.tamanio = tamanio;
    }

    public int[] getCuerpo() {

        return cuerpo;
    }

    public void setCuerpo(int[] cuerpo) {
        this.cuerpo = cuerpo;
    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    int push(int a){
        if (vacia()==false){
        ultimo=a;
        cuerpo[i]=ultimo;
        i=i+1;
        return 0;}
        else{
            System.out.println("Fila llena");
         return 0;
        }
    }
    void pop(){
        if (vacia()==true){
        cuerpo[tamanio]=0;
        i=i-1;}
        else{
            System.out.println("Fila vacia");
        }
    }
    boolean llena(){
        if (cuerpo[0]!=0)
            return true;
        else
        return false;
    }
    boolean vacia(){
        if (cuerpo[tamanio]==0)
        return true;
        else
        return false;
    }
    int tamanio(int a){
        tamanio = a;
        return tamanio;
    }
}
