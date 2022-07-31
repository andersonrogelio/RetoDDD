package co.com.sofka.atencionalcliente.pedido;

import co.com.sofka.atencionalcliente.pedido.values.ClienteID;
import co.com.sofka.domain.generic.Entity;

public class Cliente extends Entity<ClienteID> {
    public Cliente(ClienteID entityId){
        super(entityId);
    }

}
