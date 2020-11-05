
import java.text.DecimalFormat;

public class Ecuacion {

    private double a;
    private double b;
    private double c;
    private char caso;
    private double det;
    private Fraccion raices[];
    private Fraccion raicesReducidas[];
    private String raicesS[];
    private double pv1[], pv2[], sistema[][];
    private double c1, c2;

    public Ecuacion(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.raices = null;
        this.det = 0;
        this.caso = 0;
        this.calcularRaices();
        this.c1 = 0;
        this.c2 = 0;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setPv1(double x, double y) {
        this.pv1 = new double[2];
        this.pv1[0] = x;
        this.pv1[1] = y;
    }

    public void setPv2(double x, double y) {
        this.pv2 = new double[2];
        this.pv2[0] = x;
        this.pv2[1] = y;
    }

    public double getC1() {
        return c1;
    }

    public double getC2() {
        return c2;
    }

    public char getCaso() {
        return this.caso;
    }

    public void setCaso() {
        if (this.det > 0)
        {
            this.caso = '1';
        } else if (det == 0)
        {
            this.caso = '3';
        } else
        {
            this.caso = '2';
        }
    }

    public void setDet() {
        this.det = elevarAlCuadrado(b) - 4 * (a * c);
    }

    public Fraccion getRaices(int pos) {
        return this.raices[pos];
    }

    public void setRaices(int pos, Fraccion raiz) {
        this.raices[pos] = raiz;
    }

    public Fraccion getRaicesReducidas(int pos) {
        return raicesReducidas[pos];
    }

    public void setRaicesReducidas(int pos, Fraccion suma) {
        this.raicesReducidas[pos] = suma;
    }

    public double[][] getSistema() {
        return sistema;
    }

    public double elevarAlCuadrado(double numero) {
        return numero * numero;
    }

    public Fraccion[] getDeterminantes(double det) {
        Fraccion frac[] = new Fraccion[2];
        frac[0] = new Fraccion((-1 * b), (2 * a));
        frac[1] = new Fraccion(Math.sqrt(det), (2 * a));
        return frac;
    }

    public void calcularRaices() {
        setDet();
        setCaso();
        double det = this.det;
        switch (getCaso())
        {
            case '1':
                this.raices = new Fraccion[2];
                this.raicesReducidas = new Fraccion[2];
                setRaices(0, getDeterminantes(det)[0]);
                setRaices(1, getDeterminantes(det)[1]);
                Fraccion suma = new Fraccion((raices[0].getNumerador() + raices[1].getNumerador()), raices[0].getDenominador());
                Fraccion resta = new Fraccion((raices[0].getNumerador() - raices[1].getNumerador()), raices[0].getDenominador());
                suma.simplificar();
                resta.simplificar();
                setRaicesReducidas(0, suma);
                setRaicesReducidas(1, resta);
                break;
            case '2':
                this.raices = new Fraccion[2];
                this.raicesReducidas = new Fraccion[2];
                det = det * (-1);
                setRaices(0, getDeterminantes(det)[0]);
                setRaices(1, getDeterminantes(det)[1]);
                Fraccion lambda = new Fraccion(raices[0].getNumerador(), raices[0].getDenominador());
                Fraccion mu = new Fraccion(raices[1].getNumerador(), raices[1].getDenominador());
                lambda.simplificar();
                mu.simplificar();
                setRaicesReducidas(0, lambda);
                setRaicesReducidas(1, mu);
                break;
            default:
                this.raices = new Fraccion[1];
                this.raicesReducidas = new Fraccion[1];
                setRaices(0, getDeterminantes(det)[0]);
                Fraccion red = new Fraccion(raices[0].getDenominador(), raices[0].getDenominador());
                red.simplificar();
                setRaicesReducidas(0, red);
                break;
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

    public String toEntero(double numero) {
        DecimalFormat df = new DecimalFormat("#0.00");
        String num = String.valueOf(numero);
        int intNum = Integer.parseInt(num.substring(0, num.indexOf('.')));
        float decNum = Float.parseFloat(num.substring(num.indexOf('.')));
        if (decNum == 0.00000000)
        {
            return intNum + "";
        } else
        {
            return doubleToFraccion(numero);
        }
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    public String solToString() {
        raicesS = new String[2];
        if (this.caso == '1')
        {
            Fraccion A = getRaices(0);
            Fraccion B = getRaices(1);
            String r = "";
            if (isEntero(B.getNumerador()))
            {
                if (A.isFraccionEntera() && B.isFraccionEntera())
                {
                    raicesS[0] = toEntero(dividir(A.getNumerador(), A.getDenominador()) + dividir(B.getNumerador(), B.getDenominador()));
                    raicesS[1] = toEntero(dividir(A.getNumerador(), A.getDenominador()) - dividir(B.getNumerador(), B.getDenominador()));
                } else if (A.isFraccionEntera() && !B.isFraccionEntera())
                {
                    raicesS[0] = toEntero(dividir(A.getNumerador(), A.getDenominador())) + "+" + B.toString();
                    raicesS[1] = toEntero(dividir(A.getNumerador(), A.getDenominador())) + "-" + B.toString();
                } else if (!A.isFraccionEntera() && B.isFraccionEntera())
                {
                    raicesS[0] = A.toString() + "+" + toEntero(dividir(B.getNumerador(), B.getDenominador()));
                    raicesS[1] = A.toString() + "-" + toEntero(dividir(B.getNumerador(), B.getDenominador()));
                } else
                {
                    Fraccion a = new Fraccion((A.getNumerador() + B.getNumerador()), A.getDenominador());
                    Fraccion b = new Fraccion((A.getNumerador() - B.getNumerador()), A.getDenominador());
                    raicesS[0] = a.toString();
                    raicesS[1] = b.toString();
                }
            } else
            {
                raicesS[0] = "\\left(" + A.toString() + "+" + B.toString() + "\\right)";
                raicesS[1] = "\\left(" + A.toString() + "-" + B.toString() + "\\right)";
            }
            r = "y(x)=c_{1}e^{" + raicesS[0] + "x}+c_{2}e^{" + raicesS[1] + "x}";
            if (raicesS[0].equals(0))
            {
                r = "y(x)=c_{1}+c_{2}e^{" + raicesS[1] + "x}";
            }
            if (raicesS[1].equals(0))
            {
                r = "y(x)=c_{1}e^{" + raicesS[0] + "x}+c_{2}";
            }
            if (raicesS[0].equals(1))
            {
                r = "y(x)=c_{1}e^{x}+c_{2}e^{" + raicesS[1] + "x}";
            }
            if (raicesS[1].equals(1))
            {
                r = "y(x)=c_{1}e^{" + raicesS[0] + "x}+c_{2}e^{x}";
            }
            return r;
        } else if (this.caso == '2')
        {
            raicesS[0] = getRaices(0).toString();
            raicesS[1] = getRaices(1).toString();
            return "y(x)=c_{1}e^{(" + raicesS[0] + ")x}\\cos\\left(" + raicesS[1] + "x\\right)+c_{2}e^{(" + raicesS[0] + ")x}\\sin\\left(" + raicesS[1] + "x\\right)";
        } else
        {
            raicesS[0] = getRaices(0).toString();
            return "y(x)=c_{1}e^{" + raicesS[0] + "x}+c_{2}xe^{" + raicesS[0] + "x}";
        }
    }

    private String getSigno(double n) {
        String aux = "";
        if (n > 0)
        {
            aux = "+" + toEntero(n);
        } else if (n < 0)
        {
            aux = "-" + toEntero(n * -1);
        } else
        {
            aux = "";
        }
        return aux;
    }

    private String doubleToFraccion(double num) {
        double numerador = num, denominador = 1;
        do
        {
            denominador++;
        } while (!isEntero(numerador * denominador));
        return "\\frac{" + toEntero(numerador * denominador) + "}{" + toEntero(denominador) + "}";
    }

    public String ecuacionCaracteristicaToString() {
        String A = getSigno(a), B = getSigno(b), C = getSigno(c);
        if (A.startsWith("+"))
        {
            if (a == 1)
            {
                A = "r^{2}";
            } else
            {
                A = toEntero(a) + "r^{2}";
            }
            if (A.equals(""))
            {
                A = "";
            }
        }
        if (B.equals(""))
        {
            B = "";
        } else
        {
            if (b == 1 || b == -1)
            {
                B = B.charAt(0) + "r";
            } else
            {
                B = B + "r";
            }
        }
        if (C.equals(""))
        {
            C = "";
        } else
        {
            C = C + "";
        }
        return A + B + C + "=0";
    }

    public String raicesToString() {
        String r = "";
        switch (caso)
        {
            case '1':
                r = "r=\\dfrac{-\\left(" + toEntero(b) + "\\right)\\pm\\sqrt{\\left("
                        + toEntero(b) + "^{2}\\right)-4(" + toEntero(a) + ")(" + toEntero(c)
                        + ")}}{2(" + toEntero(a) + ")}\\quad r_{1}=" + raicesS[0] + ", r_{2}=" + raicesS[1];
                break;
            case '2':
                r = "r=\\dfrac{-\\left(" + toEntero(b) + "\\right)\\pm\\sqrt{\\left("
                        + toEntero(b) + "^{2}\\right)-4(" + toEntero(a) + ")(" + toEntero(c)
                        + ")}}{2(" + toEntero(a) + ")}\\quad r=" + getRaices(0).toString() + "\\pm" + getRaices(1).toString() + "i \\Rightarrow \\lambda=" + raicesS[0] + ",\\mu=" + raicesS[1];
                break;
            case '3':
                r = "r=\\dfrac{-\\left(" + toEntero(b) + "\\right)\\pm{\\sqrt{\\left("
                        + toEntero(b) + "^{2}\\right)-4(" + toEntero(a) + ")(" + toEntero(c)
                        + ")}}}{2(" + toEntero(a) + ")}\\quad r_{2}=r_{1}=" + raicesS[0];
                break;
        }
        return r;
    }

    public double hallarDet(double a, double b, double c, double d) {
        return (a * b) - (c * d);
    }

    public void calcularPVI() {
        double detg = 0, detx = 0, dety = 0, A = 0, B = 0, E = 0, D = 0;
        sistema = new double[2][3];
        if (this.caso == '1')
        {
            double r1 = dividir(this.raicesReducidas[0].getNumerador(), this.raicesReducidas[0].getDenominador());
            double r2 = dividir(this.raicesReducidas[1].getNumerador(), this.raicesReducidas[1].getDenominador());
            A = Math.pow(Math.E, r1 * this.pv1[0]);
            B = Math.pow(Math.E, r2 * this.pv1[0]);
            sistema[0][0] = A;
            sistema[0][1] = B;
            sistema[0][2] = this.pv1[1];
            D = Math.pow(Math.E, r1 * this.pv1[0]);
            E = Math.pow(Math.E, r2 * this.pv1[0]);
            sistema[1][0] = r1 * D;
            sistema[1][1] = r2 * E;
            sistema[1][2] = this.pv2[1];
            detg = hallarDet(sistema[0][0], sistema[1][1], sistema[1][0], sistema[0][1]);
            detx = hallarDet(sistema[0][1], sistema[1][2], sistema[1][1], sistema[0][2]);
            dety = hallarDet(sistema[0][0], sistema[1][2], sistema[1][0], sistema[0][2]);
            this.c1 = detx / detg * - 1;
            this.c2 = dety / detg;
        } else if (this.caso == '2')
        {
            double r1 = dividir(this.raicesReducidas[0].getNumerador(), this.raicesReducidas[0].getDenominador());
            double r2 = dividir(this.raicesReducidas[1].getNumerador(), this.raicesReducidas[1].getDenominador());
            A = Math.pow(Math.E, r1 * this.pv1[0]) * Math.cos(r2 * this.pv1[0]);
            B = Math.pow(Math.E, r1 * this.pv1[0]) * Math.sin(r2 * this.pv1[0]);
            sistema[0][0] = A;
            sistema[0][1] = B;
            sistema[0][2] = this.pv1[1];
            D = (r1 * Math.pow(Math.E, r1 * this.pv1[0]) * Math.cos(r2 * this.pv1[0])) - (r2 * Math.pow(Math.E, r1 * this.pv1[0]) * Math.sin(r2 * this.pv1[0]));
            E = (r1 * Math.pow(Math.E, r1 * this.pv1[0]) * Math.sin(r2 * this.pv1[0])) + (r2 * Math.pow(Math.E, r1 * this.pv1[0]) * Math.cos(r2 * this.pv1[0]));
            sistema[1][0] = D;
            sistema[1][1] = E;
            sistema[1][2] = this.pv2[1];
            detg = hallarDet(sistema[0][0], sistema[1][1], sistema[1][0], sistema[0][1]);
            detx = hallarDet(sistema[0][1], sistema[1][2], sistema[1][1], sistema[0][2]);
            dety = hallarDet(sistema[0][0], sistema[1][2], sistema[1][0], sistema[0][2]);
            this.c1 = detx / detg * -1;
            this.c2 = dety / detg;
        } else
        {
            double r1 = dividir(this.raicesReducidas[0].getNumerador(), this.raicesReducidas[0].getDenominador());
            A = Math.pow(Math.E, r1 * this.pv1[0]);
            B = this.pv1[0] * Math.pow(Math.E, r1 * this.pv1[0]);
            sistema[0][0] = A;
            sistema[0][1] = B;
            sistema[0][2] = this.pv1[1];
            D = r1 * Math.pow(Math.E, r1 * this.pv1[0]);
            E = (r1 * Math.pow(Math.E, this.pv1[0])) + (Math.pow(Math.E, r1 * this.pv1[0]));
            sistema[1][0] = D;
            sistema[1][1] = E;
            sistema[1][2] = this.pv2[1];
            detg = hallarDet(sistema[0][0], sistema[1][1], sistema[1][0], sistema[0][1]);
            detx = hallarDet(sistema[0][1], sistema[1][2], sistema[1][1], sistema[0][2]);
            dety = hallarDet(sistema[0][0], sistema[1][2], sistema[1][0], sistema[0][2]);
            this.c1 = detx / detg * -1;
            this.c2 = dety / detg;
        }
    }
    
    public String pviToString() {
        if(this.caso == '1') {
            return "y(x)=" + toEntero(getC1()) + "e^{" + raicesS[0] + "x}" + getSigno(getC2()) 
                    + "e^{" + raicesS[1] +"x}";
        } else if(this.caso == '2') {
            return "y(x)=" + toEntero(getC1()) + "e^{" + raicesS[0] + "x}\\cos\\left("+ raicesS[1] + "x\\right)" 
                    + getSigno(getC2()) + "e^{" + raicesS[0] + "x}\\sin\\left(" + raicesS[1] + "x\\right)";
        } else {
            return "y(x)=" + toEntero(getC1()) + "e^{" + raicesS[0] + "x}" + getSigno(getC2()) + "xe^{" + raicesS[0] + "x}";
        }
    }
}
