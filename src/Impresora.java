import interfaces.IReseteable;

public class Impresora extends Producto implements IReseteable {
    private int velocidad;

    @Override
    public String toString() {
        return "Impresora{" +
                "codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                "velocidad=" + velocidad + '\''+
        '}';

    }

    public Impresora(String codigo, String modelo, int velocidad) {
        super(codigo, modelo);
        this.velocidad = velocidad;
    }

    @Override
    public void reset() {
        System.out.println("Reseteando impresora...");
    }
}
