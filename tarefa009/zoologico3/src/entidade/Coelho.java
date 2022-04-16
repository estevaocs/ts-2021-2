package entidade;

public class Coelho extends Animal {

    public Coelho(String nome,int idade){
        super(nome,idade);
    }
    @Override
    public String emiteSom() {
        return "Som de coelho!";
    }

    public String movimento(){
        return "Eu sou um " + this.getClass().getSimpleName() + ", e me movimento andando e saltando.";
    }
}
