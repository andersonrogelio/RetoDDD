package co.com.sofka.atencionalcliente.pedido.events;

import co.com.sofka.atencionalcliente.pedido.values.Costo;
import co.com.sofka.atencionalcliente.pedido.values.DescripcionPedido;
import co.com.sofka.atencionalcliente.pedido.values.FechaEntrega;
import co.com.sofka.domain.generic.DomainEvent;

public class PedidoCreado extends DomainEvent {
    private final DescripcionPedido descripcionPedido;
    private final FechaEntrega fechaEntrega;
    private final Costo costo;
    public PedidoCreado (DescripcionPedido descripcionPedido, FechaEntrega fechaEntrega, Costo costo){
//        super("co.com.sofka.atencionalcliente.pedido");
        super("co.com.sofka.atencionalcliente.pedido.pedidocreado");
        this.descripcionPedido = descripcionPedido;
        this.fechaEntrega = fechaEntrega;
        this.costo = costo;
    }

    public DescripcionPedido getDescripcionPedido() {
        return descripcionPedido;
    }

    public FechaEntrega getFechaEntrega() {
        return fechaEntrega;
    }

    public Costo getCosto() {
        return costo;
    }
}
