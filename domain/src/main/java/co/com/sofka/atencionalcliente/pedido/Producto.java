package co.com.sofka.atencionalcliente.pedido;

import co.com.sofka.atencionalcliente.pedido.values.DescripcionProducto;
import co.com.sofka.atencionalcliente.pedido.values.NombreProducto;
import co.com.sofka.atencionalcliente.pedido.values.ProductoID;
import co.com.sofka.domain.generic.Entity;

public class Producto extends Entity<ProductoID> {
    private NombreProducto nombre;
    private DescripcionProducto descripcion;
    public Producto(ProductoID entityId, NombreProducto nombre, DescripcionProducto descripcion) {
        super(entityId);
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
