package co.com.sofka.atencionalcliente.pedido;

import co.com.sofka.atencionalcliente.pedido.events.PedidoCreado;
import co.com.sofka.domain.generic.EventChange;

public class PedidoChange extends EventChange {
    public PedidoChange(Pedido pedido) {
        apply((PedidoCreado event) -> {

        });
    }
}
