package co.com.sofka.atencionalcliente.pedido.events;

import co.com.sofka.atencionalcliente.pedido.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class PedidoActualizado extends DomainEvent {
    private final PedidoID pedidoID;
    private final DescripcionPedido descripcionPedido;
    private final FechaEntrega fechaEntrega;
    private final Costo costoproducto;
    private final Estado estado;
    public PedidoActualizado(PedidoID entityId, DescripcionPedido descripcionPedido, FechaEntrega fechaEntrega, Costo costo, Estado estado){
        super("co.com.sofka.atencionalcliente.pedido.pedidoactualizado");
        this.pedidoID = entityId;
        this.descripcionPedido = descripcionPedido;
        this.fechaEntrega = fechaEntrega;
        this.costoproducto = costo;
        this.estado = estado;
    }

    public DescripcionPedido getDescripcionPedido(){
        return descripcionPedido;
    }
    public FechaEntrega getFechaEntrega(){
        return fechaEntrega;
    }
    public Costo getCostoproducto(){
        return costoproducto;
    }
    public Estado getEstado(){
        return estado;
    }
}
