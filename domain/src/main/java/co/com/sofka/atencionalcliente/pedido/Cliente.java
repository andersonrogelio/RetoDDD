package co.com.sofka.atencionalcliente.pedido;

import co.com.sofka.atencionalcliente.pedido.values.ClienteID;
import co.com.sofka.atencionalcliente.pedido.values.InformacionCliente;
import co.com.sofka.atencionalcliente.pedido.values.Nombre;
import co.com.sofka.domain.generic.Entity;

public class Cliente extends Entity<ClienteID> {
    private final Nombre nombre;
    private final InformacionCliente informacion;
    public Cliente(ClienteID entityId , Nombre nombre, InformacionCliente informacion){
        super(entityId);
        this.nombre = nombre;
        this.informacion = informacion;
    }

    public Nombre nombre(){
        return  nombre;
    }
    public  InformacionCliente informacion(){
        return  informacion;
    }

}
