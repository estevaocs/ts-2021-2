package entidade;

public class Sapo extends Animal{

    public Sapo(String nome,int idade){
        super(nome,idade);
    }

    @Override
    public String emiteSom() {
        return "Coachado!";
    }

    public String movimento(){
        return "Eu sou um " + this.getClass().getSimpleName() + ", e me movimento pulando.";
    }
}
