import interfaces.IReseteable;

import java.util.Date;

public class Cpu  extends Tecnologico implements IReseteable {
    private int memoriaPrincipal;

    public Cpu(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante, int memoriaPrincipal) {
        super(codigo, modelo, paisOrigen, fechaFabricacion, fabricante);
        this.memoriaPrincipal = memoriaPrincipal;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "memoriaPrincipal=" + memoriaPrincipal +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", PaisOrigen='" + PaisOrigen + '\'' +
                ", FechaFabricacion=" + FechaFabricacion +
                ", Fabricante=" + Fabricante +
                '}';
    }

    @Override
    public void reset() {
        System.out.println("Reseteando al estado de fabrica...");
    }
}
