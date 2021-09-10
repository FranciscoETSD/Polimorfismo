import interfaces.IReseteable;

public class DiscoDuro extends Alquilable implements IReseteable {
    private int capacidad;

    public DiscoDuro(String codigo, String modelo, double precioHora, int capacidad) {
        super(codigo, modelo, precioHora);
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "DiscoDuro{" +
                "precioHora=" + precioHora +
                ", capacidad=" + capacidad +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void estado() {
        System.out.println("Sectores defectuosos: " + 1420);
    }

    @Override
    public void reset() {
        System.out.println("Formateando Disco duro...");
    }
}
