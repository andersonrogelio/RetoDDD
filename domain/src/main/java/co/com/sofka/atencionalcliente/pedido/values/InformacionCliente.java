package co.com.sofka.atencionalcliente.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class InformacionCliente implements ValueObject<String> {
    private final String value;

    public InformacionCliente(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La informacion no puede estar en blanco");
        }

        if(this.value.length() > 200){
            throw new IllegalArgumentException("La informacion no permite mas de 200 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
