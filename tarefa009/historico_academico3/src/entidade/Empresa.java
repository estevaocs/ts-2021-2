package entidade;


public class Empresa {

    private Funcionario[] funcionarios;

    private Double totalRendaEnsinoBasico;
    private Double totalRendaEnsinoMedio;
    private Double totalRendaGraduacao;

    public Empresa(){
        funcionarios = new Funcionario[10];

        funcionarios[0] = new Funcionario("FuncionarioA", 1234, "basico", "vendedor", 250.00);//basico
        funcionarios[1] = new Funcionario("FuncionarioB", 5678, "basico", "vendedor", 250.00);//basico
        funcionarios[2] = new Funcionario("FuncionarioC", 9012, "basico", "vendedor", 250.00);//basico
        funcionarios[3] = new Funcionario("FuncionarioD", 9021, "basico", "vendedor", 250.00);//basico
        funcionarios[4] = new Funcionario("FuncionarioE", 2022, "medio", "vendedor", 250.00);//medio
        funcionarios[5] = new Funcionario("FuncionarioF", 4353, "medio", "vendedor", 250.00);//medio
        funcionarios[6] = new Funcionario("FuncionarioG", 5769, "medio", "vendedor", 250.00);//medio
        funcionarios[7] = new Funcionario("FuncionarioH", 9862, "medio", "supervisor", 600.00);//medio
        funcionarios[8] = new Funcionario("FuncionarioI", 5267, "graduacao", "supervisor", 600.00);//graduacao
        funcionarios[9] = new Funcionario("FuncionarioJ", 6359, "graduacao", "gerente", 1500.00);//graduacao

        this.totalRendaEnsinoBasico = 0.00;
        this.totalRendaEnsinoMedio = 0.00;
        this.totalRendaGraduacao = 0.00;
    }

    public void atualizaRemuneracao(){
        for(Funcionario f : funcionarios){
            f.atualizaRendaTotal();
        }
    }

    public void atualizaAtualizaComissoes(){
        for(Funcionario f : funcionarios){
            f.atualizaComissoes();
        }
    }

    public void totalizaRendaPorEscolaridade(){
        for(Funcionario f : funcionarios){
            if(f.getEscolaridade().equals("basico")){
                totalRendaEnsinoBasico += f.getRendaTotal();
            }else if(f.getEscolaridade().equals("medio")){
                totalRendaEnsinoMedio += f.getRendaTotal();
            }else if(f.getEscolaridade().equals("graduacao")){
                totalRendaGraduacao += f.getRendaTotal();
            }
        }
    }

}
