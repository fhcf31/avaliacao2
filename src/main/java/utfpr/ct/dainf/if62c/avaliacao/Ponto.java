package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author 
 */
public class Ponto {
    private double x, y, z;

    public Ponto(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public Ponto(double x,double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    @Override
    public String toString(){
        String retorno = String.format("%s(%f.%f,%f)",this.getNome(),x,y,z);
        return retorno;
    }
    
    public boolean equals(Ponto a){
        boolean igual = false;
        if(this.x == a.getX() && this.y == a.getY() && this.z == a.getZ()){
            igual = true;
        }
        return igual;
    }
    
    public double dist(Ponto a){
        double difX = Math.abs(this.x - a.getX());
        double difY = Math.abs(this.y - a.getY());
        double difZ = Math.abs(this.z - a.getZ());
        
        return Math.sqrt(difX + difY + difZ);
    }
    
    /**
     * Retorna no nome não-qualificado da classe.
     * @return O nome não qualificado da classe.
     */
    public String getNome() {
        return getClass().getSimpleName();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32));
        return hash;
    }

}
