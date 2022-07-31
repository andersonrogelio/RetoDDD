package co.com.sofka.atencionalcliente.pedido;

import co.com.sofka.atencionalcliente.pedido.events.PedidoCreado;
import co.com.sofka.atencionalcliente.pedido.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Set;

public class Pedido extends AggregateEvent<PedidoID> {
protected  PedidoID pedidoID;
protected  DescripcionPedido descripcionPedido;
protected  FechaEntrega fechaEntrega;
protected Costo costo;
protected Estado estado;
//protected Set<Producto>;
    public Pedido(PedidoID entityId, DescripcionPedido descripcionPedido, FechaEntrega fechaEntrega, Costo costo,Estado estado) {
        super(entityId);
        appendChange(new PedidoCreado(descripcionPedido,fechaEntrega,costo,estado)).apply();
    }

    public  void AddCliente(ClienteID entityId , Nombre nombre, InformacionCliente informacion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(informacion);
        appendChange(new ClienteAgregado(entityId,nombre,informacion)).apply();
    }
    public  void AddProducto(ProductoID entityId, NombreProducto nombre, DescripcionProducto descripcion, Precio precio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(precio);
        appendChange(new ProductoAgregado(entityId,nombre,descripcion,precio)).apply();
    }
    public  void updateOrder(PedidoID entityId, DescripcionPedido descripcionPedido, FechaEntrega fechaEntrega, Costo costo,Estado estado){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(descripcionPedido);
        Objects.requireNonNull(fechaEntrega);
        Objects.requireNonNull(costo);
        Objects.requireNonNull(estado);
        appendChange(new PedidoActualizado(entityId,descripcionPedido,fechaEntrega,costo)).apply();
    }
    public  void CancelOrder(PedidoID entityId, DescripcionPedido descripcionPedido, FechaEntrega fechaEntrega, Costo costo,Estado estado){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(descripcionPedido);
        Objects.requireNonNull(fechaEntrega);
        Objects.requireNonNull(costo);
        Objects.requireNonNull(estado);
        appendChange(new PedidoCancelado(entityId,descripcionPedido,fechaEntrega,costo,estado)).apply();
    }
    public DescripcionPedido descripcionPedido(){
        return descripcionPedido;
    }
    public FechaEntrega fechaEntrega(){
        return fechaEntrega;
    }
    public Costo costo(){
        return  costo;
    }
    public Estado estado(){
        return estado;
    }
}
