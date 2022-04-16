package entidade;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;


public class Funcionario {
    private String nome;//o nome deverá conter somente letras e ter tamanho >= 5 e <= 100.
    private Integer codigoFuncional;//deve possuir quatro dígitos positivos.
    private Double rendaBasica;
    private String escolaridade;//conter apenas os valores: {nenhum, basico, medio, graduacao}.
    private String cargo;//conter apenas os valores: {vendedor, supervisor, gerente}.
    private Double comissao;
    private Double rendaTotal;

    public Funcionario(String nome, Integer codigoFuncional,String escolaridade,String cargo, Double comissao) {
        if(validaNome(nome)){
            this.nome = nome;
        }

        if(validaCodigoFuncional(codigoFuncional)){
            this.codigoFuncional = codigoFuncional;
        }

        this.rendaBasica = 1000.00;

        if(validaEscolaridade(escolaridade)){
            this.escolaridade = escolaridade;
        }

        if(validaCargo(cargo)){
            this.cargo = cargo;
        }

        this.comissao = comissao;
        this.rendaTotal = 0.00;
    }

    public void atualizaRendaTotal(){
        if(this.getEscolaridade().equals("basico")){
            this.rendaTotal = (this.rendaBasica * 1.1);
        }else if(escolaridade.equals("medio")){
            this.rendaTotal = (this.rendaBasica * 1.5);
        }else if(escolaridade.equals("graduacao")){
            this.rendaTotal = (this.rendaBasica * 2);
        }
    }

    public void atualizaComissoes(){
        if(this.getCargo().equals("vendedor")){
            this.rendaTotal += 250.00;
        }else if(this.getCargo().equals("supervisor")){
            this.rendaTotal += 600.00;
        }else if(this.getCargo().equals("gerente")){
            this.rendaTotal +=  1500.00;
        }
    }

    private boolean validaNome(String nome) {
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

    private boolean validaCodigoFuncional(Integer codigoFuncional)  {
        if (codigoFuncional < 0 || codigoFuncional.toString().length() != 4) {
            return false;
        }else{
            return true;
        }
    }

    private boolean validaEscolaridade(String escolaridade) {
        List<String> escolaridadesValidas = new ArrayList<>();
        escolaridadesValidas.add("nenhum");
        escolaridadesValidas.add("basico");
        escolaridadesValidas.add("medio");
        escolaridadesValidas.add("graduacao");
        if(!escolaridadesValidas.contains(escolaridade)){
            return false;
        }else{
            return true;
        }
    }

    private boolean validaCargo(String cargo) {
        List<String> cargosValidos = new ArrayList<String>();
        cargosValidos.add("gerente");
        cargosValidos.add("supervisor");
        cargosValidos.add("vendedor");
        if(!cargosValidos.contains(cargo)){
            return false;
        }else{
            return true;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nNome: " + this.getNome());
        sb.append("\nCodigoFuncional: " + this.getCodigoFuncional());
        sb.append("\nRenda Básica: " + this.getRendaBasica());
        sb.append("\nEscolaridade: " + this.getEscolaridade());
        sb.append("\nCargo: " + this.getCargo());
        sb.append("\nComissão: " + this.getComissao());
        sb.append("\nSalário Total: " + this.getRendaTotal() + "\n");
        return sb.toString();
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(Integer codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}

	public Double getRendaBasica() {
		return rendaBasica;
	}

	public void setRendaBasica(Double rendaBasica) {
		this.rendaBasica = rendaBasica;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double getRendaTotal() {
		return rendaTotal;
	}

	public void setRendaTotal(Double rendaTotal) {
		this.rendaTotal = rendaTotal;
	}
    
    
    
}
