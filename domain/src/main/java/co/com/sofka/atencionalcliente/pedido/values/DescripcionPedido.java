package co.com.sofka.atencionalcliente.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DescripcionPedido implements ValueObject<String> {
    private final String value;

    public DescripcionPedido(String value) {
        //TODO: validacions
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
