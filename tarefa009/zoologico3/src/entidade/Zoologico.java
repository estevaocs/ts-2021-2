package entidade;

public class Zoologico {

    private Animal[] jaulas;

    public Zoologico(){
        jaulas = new Animal[12];
        jaulas[0] = new Boi("Benjor",20);
        jaulas[1] = new Cachorro("Rin Tin Tin",10);
        jaulas[2] = new Coelho("Pernalonga",9);
        jaulas[3] = new Gato("Frajola",7);
        jaulas[4] = new Lobo("Lupi Lebô",14);
        jaulas[5] = new Sapo("Sapo da Princesa",1);
        jaulas[6] = new Sapo("Caco Star",3);
        jaulas[7] = new Lobo("Jacob Black",19);
        jaulas[8] = new Gato("Batatinha",15);
        jaulas[9] = new Coelho("Ricochete",11);
        jaulas[10] = new Cachorro("Bandit",5);
        jaulas[11] = new Boi("Otizoff",10);
    }

    public void visitar(){
        for(Animal a : jaulas){
            a.toString();
        }
    }
}
