import com.aluracursos.ChallengeConversorDeMoneda.Monedas.ConversionesDeMonedas;

public class Conversion {
    double valorDeMoneda;

    public Conversion (ConversionesDeMonedas conversionDeMoneda) {
        this.valorDeMoneda = conversionDeMoneda.conversion_rate();

    }
}
