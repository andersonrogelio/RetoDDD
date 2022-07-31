package co.com.sofka.atencionalcliente.pedido;

import co.com.sofka.atencionalcliente.pedido.values.ClienteID;
import co.com.sofka.atencionalcliente.pedido.values.InformacionCliente;
import co.com.sofka.atencionalcliente.pedido.values.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cliente extends Entity<ClienteID> {
    private Nombre nombre;
    private  InformacionCliente informacion;
    public Cliente(ClienteID entityId , Nombre nombre, InformacionCliente informacion){
        super(entityId);
        this.nombre = nombre;
        this.informacion = informacion;
    }
    public  void  updateNombre(Nombre nombre){
        this.nombre = this.nombre = Objects.requireNonNull(nombre);
    }
    public  void  updateInformacion(InformacionCliente informacion){
        this.informacion = Objects.requireNonNull(informacion);
    }
    public Nombre nombre(){
        return  nombre;
    }
    public  InformacionCliente informacion(){
        return  informacion;
    }

}
