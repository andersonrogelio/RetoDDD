package co.com.sofka.atencionalcliente.compra.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CostoCompra implements ValueObject<Integer> {
    private final Integer value;

    public CostoCompra(Integer value) {
        this.value = Objects.requireNonNull(value);
        if (value < 0 ) {
            throw new IllegalArgumentException("El costo debe de ser mayor a cero");
        }
    }

    @Override
    public Integer value() {
        return value;
    }
}
