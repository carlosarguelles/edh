import java.text.DecimalFormat;

public class Fraccion {

    private double numerador;
    private double denominador;

    public Fraccion(double n, double d) {
        this.numerador = n;
        this.denominador = d;
    }

    public double getNumerador() {
        return numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public double mcd() {
        double num = numerador, den = denominador;
        if (num == 0)
        {
            return 0;
        } else
        {
            double mcd = 1;
            if (num < 0)
            {
                num *= -1;
            }
            if (den < 0)
            {
                den *= -1;
            }
            if (den > num)
            {
                double aux = num;
                num = den;
                den = aux;
            }
            while (den != 0)
            {
                mcd = den;
                den = num % den;
                num = mcd;
            }
            return mcd;
        }
    }

    public void simplificar() {
        double mcd = mcd();
        if (mcd != 0)
        {
            numerador /= mcd;
            denominador /= mcd;
            if (numerador < 0 && denominador < 0)
            {
                numerador = numerador * -1;
                denominador = denominador * -1;
            } else if (numerador >= 0 && denominador < 0)
            {
                numerador = numerador * -1;
                denominador = denominador * -1;
            }
        }
    }

    public boolean isEntero(double numero) {
        String num = String.valueOf(numero);
        float decNum = Float.parseFloat(num.substring(num.indexOf('.')));
        if (decNum == .00000000)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public boolean isFraccionEntera() {
        if (isEntero(numerador / denominador))
        {
            return true;
        } else
        {
            return false;
        }
    }

    public String toEntero(double numero) {
        DecimalFormat df = new DecimalFormat("#0");
        if (numero != 0.00)
        {
            String num = String.valueOf(numero);
            int intNum = Integer.parseInt(num.substring(0, num.indexOf('.')));
            float decNum = Float.parseFloat(num.substring(num.indexOf('.')));
            if (decNum == 0.0000000000000000000000)
            {
                return intNum + "";
            } else
            {
                return df.format(numero);
            }
        } else
        {
            return 0 + "";
        }
    }
    
    public String numeradorToFrac() {
        return toEntero(numerador * numerador);
    }

    @Override
    public String toString() {
        if (!isEntero(numerador))
        {
            return "\\frac{\\sqrt{" + numeradorToFrac() + "}}{" + toEntero(denominador) + "}";
        } else 
        {
            simplificar();
            if(denominador == 1 && numerador != 0) {
                return toEntero(numerador);
            } else if(numerador == 0) {
                return 0 + "";
            } else {
                return format();
            }
        }
    }

    public String format() {
        if (numerador != 0.00)
        {
            if(numerador < 0) {
                return "-\\frac{" + toEntero(numerador * -1) + "}{" + toEntero(denominador) + "}";
            } else {
                return "\\frac{" + toEntero(numerador) + "}{" + toEntero(denominador) + "}";
            }
        } else
        {
            return 0 + "";
        }
    }
}
