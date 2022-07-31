package co.com.sofka.atencionalcliente.pedido.events;

import co.com.sofka.atencionalcliente.pedido.values.*;
import co.com.sofka.domain.generic.DomainEvent;


public class ProductoAgregado extends DomainEvent {
    private final ProductoID productoid;
    private final NombreProducto nombreproducto;
    private final DescripcionProducto descripcionproducto;
    private final Precio precio;
    public ProductoAgregado (ProductoID entityId, NombreProducto nombre, DescripcionProducto descripcion, Precio precio){
        super("co.com.sofka.atencionalcliente.pedido.productoagregado");
        this.productoid = entityId;
        this.nombreproducto = nombre;
        this.descripcionproducto = descripcion;
        this.precio = precio;
    }

    public NombreProducto getNombreproducto(){
        return nombreproducto;
    }
    public DescripcionProducto getDescripcionproducto(){
        return descripcionproducto;
    }
    public Precio getPrecio(){
        return precio;
    }
}
