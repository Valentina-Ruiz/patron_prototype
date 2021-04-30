public class BicicletaRoja extends Bicicleta {

    public BicicletaRoja() {
        this("Roja", 29);
    }

    private BicicletaRoja(String color, int diametro) {
        super(color, diametro);
    }

    @Override
    public Bicicleta clone() {
        return new BicicletaRoja(this.color, this.diametro);
    }

    
}