package co.com.sofka.atencionalcliente.compra;

import co.com.sofka.atencionalcliente.compra.events.CompraCreada;
import co.com.sofka.atencionalcliente.compra.values.CompraID;
import co.com.sofka.atencionalcliente.compra.values.CostoCompra;
import co.com.sofka.atencionalcliente.compra.values.DescripcionCompra;
import co.com.sofka.atencionalcliente.pedido.events.PedidoCreado;
import co.com.sofka.atencionalcliente.pedido.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

public class Compra extends AggregateEvent<CompraID> {
    protected CompraID compraID;
    protected DescripcionCompra descripcionCompra;
    protected CostoCompra costo;

    public Compra(CompraID entityId,DescripcionCompra descripcionCompra, CostoCompra costo) {
        super(entityId);
        appendChange(new CompraCreada( descripcionCompra, costo)).apply();
    }
}
