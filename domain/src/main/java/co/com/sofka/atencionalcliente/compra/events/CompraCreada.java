package co.com.sofka.atencionalcliente.compra.events;

import co.com.sofka.atencionalcliente.compra.values.CostoCompra;
import co.com.sofka.atencionalcliente.compra.values.DescripcionCompra;
import co.com.sofka.domain.generic.DomainEvent;

public class CompraCreada extends DomainEvent {
    private final DescripcionCompra  descripcionCompra;
    private  final CostoCompra costoCompra;

    public CompraCreada (DescripcionCompra descripcionCompra, CostoCompra costoCompra){
//        super("co.com.sofka.atencionalcliente.pedido");
        super("co.com.sofka.atencionalcliente.pedido.pedidocreado");
        this.descripcionCompra = descripcionCompra;
        this.costoCompra = costoCompra;

    }

    public DescripcionCompra getDescripcionCompra(){
        return descripcionCompra;
    }
    public  CostoCompra getCostoCompra(){
        return costoCompra;
    }
}
