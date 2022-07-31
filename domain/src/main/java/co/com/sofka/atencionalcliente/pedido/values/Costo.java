package co.com.sofka.atencionalcliente.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Costo implements ValueObject<Integer> {
    private final Integer value;

    public Costo(Integer value) {
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
