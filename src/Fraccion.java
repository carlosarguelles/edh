
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
        int ent;
        boolean isEntero = true;
        try {
            ent = (int) numero;
        } catch(Exception e) {
            isEntero = false;
        }
        return isEntero;
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
        if (isEntero(numero))
        {
            int intNum = (int) numero;
            return intNum + "";
        } else
        {
            return doubleToFraccion(numero);
        }
    }
    
    public String doubleToFraccion(double num) {
        double numerador = num, denominador = 1;
        do
        {
            denominador++;
        } while (!isEntero(numerador * denominador));
        return "\\frac{" + toEntero(numerador * denominador) + "}{" + toEntero(denominador) + "}";
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
