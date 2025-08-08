package heranca;

public class Gerente extends Funcionario2 implements IGerente {

    private double abono;

    public Gerente(double salarioBase, double abono) {
        super(salarioBase); // Chamando o construtor da superclasse Funcionario
        this.abono = abono;
    }

    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }

    public double getSalarioTotal() {
        return getAbono() + getSalarioBase();
    }
}
