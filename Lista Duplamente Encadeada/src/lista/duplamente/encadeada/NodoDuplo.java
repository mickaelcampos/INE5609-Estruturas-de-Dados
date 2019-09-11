/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.duplamente.encadeada;

/**
 *
 * @author 02714395058
 */
public class NodoDuplo {
    
    private NodoDuplo proximo, anterior;
    private Object elemento;

    public NodoDuplo(NodoDuplo proximo, NodoDuplo anterior, Object elemento) {
        this.proximo = proximo;
        this.anterior = anterior;
        this.elemento = elemento;
    }

    public NodoDuplo getProximo(){
        return proximo;
    }

    public void setProximo(NodoDuplo proximo) {
        this.proximo = proximo;
    }

    public NodoDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDuplo anterior) {
        this.anterior = anterior;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    
        
}
