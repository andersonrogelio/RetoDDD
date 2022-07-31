package co.com.sofka.atencionalcliente.pedido;

import co.com.sofka.atencionalcliente.pedido.values.Costo;
import co.com.sofka.atencionalcliente.pedido.values.DescripcionPedido;
import co.com.sofka.atencionalcliente.pedido.values.FechaEntrega;
import co.com.sofka.atencionalcliente.pedido.values.PedidoID;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Pedido extends AggregateEvent<PedidoID> {
protected  PedidoID pedidoID;
protected  DescripcionPedido descripcionPedido;
protected  FechaEntrega fechaEntrega;
protected Costo costo;
protected Set<Producto>;
    public Pedido(PedidoID entityId, DescripcionPedido descripcionPedido, FechaEntrega fechaEntrega, Costo costo) {
        super(entityId);
    }
}
