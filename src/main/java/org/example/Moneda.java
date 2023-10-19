package org.example;
import java.lang.Comparable;

abstract class Moneda implements Comparable<Moneda>{
    public Moneda(){
        ;
    }
    public Moneda getSerie() {
        return this;
    }
    public abstract int getValor();
    public boolean esNula(Moneda m) {
        if(m == null) {
            return true;
        }
        else {
            return false;
        }
    }
    public int compareTo(Moneda m){
        if (this.getValor() > m.getValor()) {
            return 1;
        } else if (this.getValor() < m.getValor()) {
            return -1;
        } else {
            return 0;
        }
    }
}
