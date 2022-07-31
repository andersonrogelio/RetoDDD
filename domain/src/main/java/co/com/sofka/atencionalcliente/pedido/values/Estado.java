package co.com.sofka.atencionalcliente.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Estado implements ValueObject<String> {

    private final String value;

    public Estado(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El estado no puede estar en blanco");
        }

        if(this.value.length() > 200){
            throw new IllegalArgumentException("El estado no permite mas de 200 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
