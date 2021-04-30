public abstract class Bicicleta {

    protected String color;
    protected int diametro;

    public Bicicleta() {
        
    }

    protected Bicicleta(String color, int diametro) {
        this.color = color;
        this.diametro = diametro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public abstract Bicicleta clone();


    @Override
    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", diametro='" + getDiametro() + "'" +
            "}";
    }

}