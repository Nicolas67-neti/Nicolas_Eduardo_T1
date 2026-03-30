package tienda;

import java.time.LocalDate;

public class Pedidos {

    private  String codigoPedido;
    private  String correoCliente;
    private  Integer cantidadProductos;
    private LocalDate fechaEntrega;

    public Pedidos(String codigoPedido,
                         String correoCliente,
                         Integer cantidadProductos,
                         LocalDate fechaEntrega) {
        this.codigoPedido = codigoPedido;
        this.correoCliente = correoCliente;
        this.cantidadProductos = cantidadProductos;
        this.fechaEntrega = fechaEntrega;
    }
    public String getCodigoPedido() {
        return codigoPedido;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public Integer getCantidadProductos() {
        return cantidadProductos;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }
}
