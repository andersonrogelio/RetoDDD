package co.com.sofka.atencionalcliente.pedido.events;

import co.com.sofka.atencionalcliente.pedido.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class EstadoPedidoActualizado extends DomainEvent {
    private final PedidoID pedidoID;

    private final Estado estado;
    public EstadoPedidoActualizado(PedidoID entityId, Estado estado){
        super("co.com.sofka.atencionalcliente.pedido.pedidocancelado");
        this.pedidoID = entityId;

        this.estado = estado;
    }
}
