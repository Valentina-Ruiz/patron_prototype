public class App {
    public static void main(String[] args) throws Exception {
        
        Bicicleta bicicleta1 = new BicicletaAzul();

        Bicicleta bicicleta2 = bicicleta1.clone();
        
        bicicleta2.setColor("Rojo");
        bicicleta2.setDiametro(29);

        System.out.println(bicicleta1);
        System.out.println(bicicleta2);

    }
}
