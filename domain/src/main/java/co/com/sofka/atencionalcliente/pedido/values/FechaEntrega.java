package co.com.sofka.atencionalcliente.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public class FechaEntrega implements ValueObject<String> {
    private final LocalDate date;
    private final String format;

    public FechaEntrega(int day, int month, int year) {//(2)
        try {
            date = LocalDate.of(year, month, day);
            if(date.isBefore(LocalDate.now())){
                throw new IllegalArgumentException("No valid the date of birth");
            }
        } catch (DateTimeException e){
            throw new IllegalArgumentException(e.getMessage());
        }
        format = generateFormat();
    }

    private String generateFormat(){
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    @Override
    public String value() {//(3)
        return format;
    }

    @Override
    public boolean equals(Object o) {//(4)
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaEntrega that = (FechaEntrega) o;
        return Objects.equals(format, that.format);
    }

    @Override
    public int hashCode() {//(5)
        return Objects.hash(format);
    }
}
