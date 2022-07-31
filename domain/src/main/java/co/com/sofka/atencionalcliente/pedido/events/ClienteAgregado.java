package co.com.sofka.atencionalcliente.pedido.events;

import co.com.sofka.atencionalcliente.pedido.values.ClienteID;
import co.com.sofka.atencionalcliente.pedido.values.InformacionCliente;
import co.com.sofka.atencionalcliente.pedido.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteAgregado extends DomainEvent {
    private final ClienteID clienteid;
    private final Nombre nombre ;
    private final InformacionCliente informacion;
    public ClienteAgregado(ClienteID entityId , Nombre nombre, InformacionCliente informacion){
        super("co.com.sofka.atencionalcliente.pedido.clienteagregado");
        this.clienteid = entityId;
        this.nombre = nombre;
        this.informacion = informacion;
    }

    public ClienteID getClienteid(){
        return  clienteid;
    }
    public  Nombre getNombre(){
        return nombre;
    }
    public  InformacionCliente getInformacion(){
        return informacion;
    }
}
