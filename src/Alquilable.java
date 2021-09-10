public abstract class Alquilable  extends Producto{
    protected double precioHora;

    public Alquilable(String codigo, String modelo, double precioHora) {
        super(codigo, modelo);
        this.precioHora = precioHora;
    }

    @Override
    public String toString() {
        return "Alquilable{" +
                "precioHora=" + precioHora +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
