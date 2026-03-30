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







}
