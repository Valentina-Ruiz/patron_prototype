public class BicicletaAzul extends Bicicleta {

    public BicicletaAzul() {
        this("Azul", 26);
    }

    private BicicletaAzul(String color, int diametro) {
        super(color, diametro);
    }

    @Override
    public Bicicleta clone() {
        return new BicicletaAzul(this.color, this.diametro);
    }

    
}