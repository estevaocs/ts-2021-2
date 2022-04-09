package entidade;


import org.apache.commons.lang.StringUtils;


public abstract class Animal {

    //nome do animal, deve possuir somente caracteres válidos, sem números e caracteres especiais;
    //O tamanho deve ser >= 5 e <= 100;
    private String nome;

    //o animal deve ter idade mínima de 1 ano e máxima de 20 anos;
    private int idade;

    public Animal(String nome, int idade){
        if(validaNome(nome)){
            this.nome = nome;
        }
        if(validaIdade(idade)) {
            this.idade = idade;
        }
    }

    public String movimento(){
        return "Eu sou um " + this.getClass().getSimpleName() + ", e me movimento andando e correndo.";
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("\nEu sou um: " + this.getClass().getSimpleName());
        sb.append("\nMeu nome é: " + this.getNome());
        sb.append("\nMeu som é: " + this.movimento());
        sb.append("\nO Som que emito é: " + this.emiteSom());
        return sb.toString();
    }
    public abstract String emiteSom();

    private boolean validaNome(String nome){
        boolean valido = true;
        String result = StringUtils.deleteWhitespace(nome);
        for(int i = 0; i < result.length(); i++){
            if(!Character.isAlphabetic(result.charAt(i))){
                valido = false;
                return valido;
            }else if(result.length() < 5 || result.length() > 100){
                valido = false;
            }
        }
        return valido;
    }

    private boolean validaIdade(int idade){
        boolean result = true;
        if(idade < 1 || idade > 20){
            result = false;
        }
        return result;
    }
    
    public String getNome() {
    	return this.nome;
    }
}
