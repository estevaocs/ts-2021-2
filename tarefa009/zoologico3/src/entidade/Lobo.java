package entidade;

public class Lobo extends Animal{

    public Lobo(String nome,int idade){
        super(nome,idade);
    }

    @Override
    public String emiteSom() {
        return "Uivo!";
    }
}
