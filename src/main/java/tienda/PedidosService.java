package tienda;

public class PedidosService {

    public static final String MSG_CAMPOS_REQUERIDOS = "Debe ingresar todos los datos requeridos";
    public static final String MSG_CODIGO_INVALIDO = "Ingrese un código de pedido válido";

    public String registrarPedido(Pedidos pedido) {
        if (pedido == null
                || pedido.getCodigoPedido() == null
                || pedido.getCodigoPedido().trim().isEmpty()
                || pedido.getCorreoCliente() == null
                || pedido.getCorreoCliente().trim().isEmpty()
                || pedido.getCantidadProductos() == null
                || pedido.getFechaEntrega() == null) {
            return MSG_CAMPOS_REQUERIDOS;
        }

        return "";
    }
}