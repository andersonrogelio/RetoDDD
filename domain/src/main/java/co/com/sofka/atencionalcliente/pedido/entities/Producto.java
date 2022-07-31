package co.com.sofka.atencionalcliente.pedido.entities;

import co.com.sofka.atencionalcliente.pedido.values.DescripcionProducto;
import co.com.sofka.atencionalcliente.pedido.values.NombreProducto;
import co.com.sofka.atencionalcliente.pedido.values.Precio;
import co.com.sofka.atencionalcliente.pedido.values.ProductoID;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Producto extends Entity<ProductoID> {
    private NombreProducto nombre;
    private DescripcionProducto descripcion;
    private Precio precio;
    public Producto(ProductoID entityId, NombreProducto nombre, DescripcionProducto descripcion, Precio precio) {
        super(entityId);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void updateNombreProducto(NombreProducto nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }
    public  void updateDescripcionProducto (DescripcionProducto descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }
    public void updatePrecio (Precio precio){
        this.precio = Objects.requireNonNull(precio);
    }

    public NombreProducto nombreProducto(){
        return nombre;
    }
    public  DescripcionProducto descripcionProducto(){
        return descripcion;
    }

    public Precio precioProducto(){
        return precio;
    }
}
