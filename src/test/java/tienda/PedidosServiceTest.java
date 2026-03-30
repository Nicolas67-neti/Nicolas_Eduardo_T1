package tienda;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class PedidosServiceTest {

    private final PedidosService service = new PedidosService();

    @Test
    void debeMostrarMensajeCuandoFaltanDatos() {
        Pedidos pedidos = new Pedidos(
                "",
                "cliente@mail.com",
                2,
                LocalDate.now()
        );

        String resultado = service.registrarPedido(pedidos);

        assertEquals(PedidosService.MSG_CAMPOS_REQUERIDOS, resultado);
    }

    @Test
    void debeMostrarErrorCuandoCodigoNoEsValido() {
        Pedidos pedido = new Pedidos(
                "Ab123",
                "cliente@mail.com",
                2,
                LocalDate.now()
        );

        String resultado = service.registrarPedido(pedido);

        assertEquals(PedidosService.MSG_CODIGO_INVALIDO, resultado);
    }
    @Test
    void debeMostrarErrorCuandoCorreoNoEsValido() {
        Pedidos pedido = new Pedidos(
                "AB123",
                "abc",
                2,
                LocalDate.now()
        );

        String resultado = service.registrarPedido(pedido);

        assertEquals(PedidosService.MSG_CORREO_INVALIDO, resultado);
    }
    @Test
    void debeMostrarErrorCuandoCantidadEsMenorOIgualACero() {
        Pedidos pedido = new Pedidos(
                "AB123",
                "cliente@mail.com",
                0,
                LocalDate.now()
        );

        String resultado = service.registrarPedido(pedido);

        assertEquals(PedidosService.MSG_CANTIDAD_INVALIDA, resultado);
    }
    @Test
    void debeMostrarErrorCuandoFechaEsAnteriorAHoy() {
        Pedidos pedido = new Pedidos(
                "AB123",
                "cliente@mail.com",
                2,
                LocalDate.now().minusDays(1)
        );

        String resultado = service.registrarPedido(pedido);

        assertEquals(PedidosService.MSG_FECHA_INVALIDA, resultado);
    }
    @Test
    void debeRegistrarPedidoCuandoTodosLosDatosSonValidos() {
        Pedidos pedido = new Pedidos(
                "AB123",
                "cliente@mail.com",
                2,
                LocalDate.now()
        );

        String resultado = service.registrarPedido(pedido);

        assertEquals(PedidosService.MSG_EXITO, resultado);
    }

}
