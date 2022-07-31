package co.com.sofka.atencionalcliente.pedido.events;

import co.com.sofka.atencionalcliente.pedido.values.Costo;
import co.com.sofka.atencionalcliente.pedido.values.DescripcionPedido;
import co.com.sofka.atencionalcliente.pedido.values.Estado;
import co.com.sofka.atencionalcliente.pedido.values.FechaEntrega;
import co.com.sofka.domain.generic.DomainEvent;

public class PedidoCreado extends DomainEvent {
    private final DescripcionPedido descripcionPedido;
    private final FechaEntrega fechaEntrega;
    private final Costo costo;
    private  final Estado estado;
    public PedidoCreado (DescripcionPedido descripcionPedido, FechaEntrega fechaEntrega, Costo costo,Estado estado){
//        super("co.com.sofka.atencionalcliente.pedido");
        super("co.com.sofka.atencionalcliente.pedido.pedidocreado");
        this.descripcionPedido = descripcionPedido;
        this.fechaEntrega = fechaEntrega;
        this.costo = costo;
        this.estado = estado;
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

    public  Estado getEstado(){
        return  estado;
    }
}

