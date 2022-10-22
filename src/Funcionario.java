public class Funcionario {

    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    private boolean estaDeFerias = false;

    public Funcionario() {
    }

    public Funcionario(String nome, int idade, String cargo, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
    }

    // METODOS

    public void aumentaSalario(Double aumento) {
        salario = salario * (1 + aumento / 100);
    }

    public void trocarCargo(String novoCargo) {
        this.cargo = novoCargo;
    }

    public boolean darFerias() {
        return estaDeFerias = true;
    }

    public boolean tirarFerias() {
        return estaDeFerias = false;
    }

    // GET E SET

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean getEstaDeFerias() {
        return estaDeFerias;
    }

    public void setEstaDeFerias(boolean estaDeFerias) {
        this.estaDeFerias = estaDeFerias;
    }

    @Override
    public String toString() {
        return "Funcionario [ Nome=" + nome + " | Idade=" + idade + " | Cargo=" + cargo + " | Salario=" + salario + "]";
    }

}