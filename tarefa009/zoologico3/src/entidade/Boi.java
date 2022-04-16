package entidade;

public class Boi extends Animal{

    public Boi(String nome, int idade){
        super(nome,idade);
    }
    @Override
    public String emiteSom() {
        return "Mugido!";
    }
}
