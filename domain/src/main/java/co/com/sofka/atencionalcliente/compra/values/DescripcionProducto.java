package co.com.sofka.atencionalcliente.compra.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DescripcionProducto implements ValueObject<String> {
    private final String value;

    public DescripcionProducto(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La descripcion no puede estar en blanco");
        }

        if(this.value.length() > 200){
            throw new IllegalArgumentException("La descripcion no permite mas de 200 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
