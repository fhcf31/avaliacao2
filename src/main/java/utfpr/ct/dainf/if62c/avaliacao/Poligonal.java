/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1260766
 */
public class Poligonal {
    private final Ponto2D[] vertices;
    private final int n;
    
    public Poligonal(int n){
        this.n = n;
        if(n < 2){
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        }
        vertices = new Ponto2D[n];
    }
    
    public int getN(){
        return n;
    }
    
    public Ponto2D get(int p){
        if(p < 0 || p >= n){
            return null;
        }
        return vertices[p];
    }
    
    public void set(int p,Ponto2D pt){
        if(p > 0 && p < n){
            vertices[p] = pt;
        }
    }
    
    public double getComprimento(){
        double comprimento = 0;
        
        for(int i=0; i < n;i++){
            if(i == (n-1)){
                comprimento += vertices[i].dist(vertices[0]);
            }
            else{
                comprimento += vertices[i].dist(vertices[i+1]);
            }
        }
        return comprimento;
    }
}
