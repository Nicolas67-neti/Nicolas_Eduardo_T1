package tienda;

import java.time.LocalDate;

public class PedidosService {

    public static final String MSG_CAMPOS_REQUERIDOS = "Debe ingresar todos los datos requeridos";
    public static final String MSG_CODIGO_INVALIDO = "Ingrese un código de pedido válido";
    public static final String MSG_CORREO_INVALIDO = "Ingrese un correo electrónico válido";
    public static final String MSG_CANTIDAD_INVALIDA = "La cantidad debe ser mayor a cero";
    public static final String MSG_FECHA_INVALIDA = "Ingrese una fecha de entrega válida";
    public static final String MSG_EXITO = "El pedido ha sido registrado correctamente";
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
        if (!pedido.getCodigoPedido().matches("[A-Z]{2}\\d{3}")) {
            return MSG_CODIGO_INVALIDO;
        }
        if (pedido.getCorreoCliente().length() < 6 || !pedido.getCorreoCliente().contains("@")) {
            return MSG_CORREO_INVALIDO;
        }
        if (pedido.getCantidadProductos() <= 0) {
            return MSG_CANTIDAD_INVALIDA;
        }
        if (pedido.getFechaEntrega().isBefore(LocalDate.now())) {
            return MSG_FECHA_INVALIDA;
        }
        return "";
    }
}