package lista4.br.uff.ic.poo.ex7;

import java.util.ArrayList;
public enum DiaDaSemana {
    DOMINGO,
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO;

    public boolean ehDiaUtil() {
        return this.ordinal() > 0 && this.ordinal() < 6;
    }
}
