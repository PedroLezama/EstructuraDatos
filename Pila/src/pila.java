import java.util.Scanner;
public class pila {
    int tamanio;
    int cuerpo[];
    int ultimo;
    int i=0;

    public pila() {
    }

    public pila(int[] cuerpo, int tamanio, int ultimo, int i) {
        this.cuerpo = cuerpo;
        this.tamanio = tamanio;
        this.ultimo = ultimo;
        this.i = i;
    }

    public int[] getCuerpo() {

        return cuerpo;
    }

    public void setCuerpo(int[] cuerpo) {
        this.cuerpo = cuerpo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {

        this.tamanio = tamanio;
    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    void push(int a) {
        if (llena()==false){
            ultimo = a;
            cuerpo[i] = ultimo;
            i=i+1;
        }
        else {
            System.out.println("Pila llena");
        }

    }
    int pop(){
        if (vacia()==true){
            System.out.println("Pila vacia");
            return 0;
        }
        else{
        cuerpo[i-1]=0;
        return 0;
        }
    }
    boolean llena(){
        if (cuerpo[i]!=0){
            return true;
        }
        else {
        return false;
        }
    }
    boolean vacia(){
        if (cuerpo[0]==0){
            return true;
        }
        else {
        return false;
        }
    }
}

