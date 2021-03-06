<div align=center>
  <img src="brasaooficialcolorido.png">
</div>

#### <p style="text-align: center;">Universidade Federal de Goiás</p>
#### <p style="text-align: center;">Instituto de Informática</p>
#### <p style="text-align: center;">Bacharelado em Engenharia de Software</p>
#### <p style="text-align: center;">Teste de Software - 2021/2</p>
#### <p style="text-align: center;">Gilmar Ferreira Arantes</p>
####  <p style="text-align: center;"> Prova P1 - 16/02/2022</p>

Matrícula: 201602489
Nome: Estevão Cristino da Silva

<p><font color=red>Nota: 5,7.</font></p>

1. Quanto ao objetivo do Teste de Software, responda as duas questões seguintes:
   1. (**0,5 ponto**) Qual o objetivo primário da atividade de teste de software?
      O objetivo é revelar a presença de defeitos. <font color=green>Certo.</font>

   2. (**0,5 ponto**) O que acontece, quando não se atinge este objetivo primário?
      O software pode apresentar falhas e erros não tratadas em sua execução. <font color=red>Errado.</font>

2. (**1,0 ponto**) Explique o que é o teste exaustivo e porque sua execução não é possível.
      É o teste de todas as possíbilidades de entradas e resultados, o que se torna inviável pois em aguns casos existem infinitas possíbilidades de entradas e combinações. <font color=green>Certo.</font>

3. (**1,0 ponto**) Cite pelo menos duas limitações da Técnica de Teste Funcional e duas da Técnica de Teste Estrutural.
   Teste Funcional:
      * Como não tem acesso à estrutura do código a ser testado, tendo apenas os requisitos como auxílio.
      * Casos de testes malfeitos podem fazer com que o teste não seja bem sucedido
   Teste Estrutural:
      * Não tem uma boa cobertura do código
      * Não testa todos os requisitos funcionais.
<font color=orange>Parcialmente correto. Nota 0,5.</font>
4. (**1,0 ponto**) Descreva pelo menos um dos quatro níveis de teste constantes da literatura especializada.
   Teste de Regressão:
      O teste de regressão é normalmente executada após as modificações ou adições de novas funcionalidades ao software, afim de verificar que nenhum novo defeito foi acrescentado ao código do sistema.
<font color=red>Errado.</font>
5. (**1.0 ponto**)Descreva qual o propósito do critério de teste funcional Particionamento por Classes de Equivlência.
   O próposito deste critétio de teste funcional, é reduzir a quantidade de casos de testes necessários, através do particionamento dos domínios de entrada e saída como equivalentes dentro de um determinado requisito lógico e funcional. <font color=green>Certo.</font>


6. (**1.00 ponto**) Existe algum tipo de hierarquia em relação aos critérios de teste estrutural, todos os nós, todos os arcos e todos os caminhos? Se sim, explique-a, considerando a perspectiva dos níveis de cobertura desejados.
   Sim, existem os níveis de teste que vão do nível 0 ao 7.
      * Nivel 0: Quando não se tem a cobertura total de todos os comandos (Nós)
      * Nível 1: Quando se tem 100% de cobertura de comandos (nós)
      * Nível 2: Quando se tem 100% de cobertura de decisão (arcos)
      * Nível 3: Quando se tem 100% de cobertura de condições
      * Nível 4: Quando se tem 100% de cobertura decisões/condiçõoes
      * Nível 5: Quando se tem 100% de cobertura de condiçõoes múltiplas
      * Nível 6: Cobertura de loop
      * Nível 7: Quando se tem  100% de cobertura de caminhos
<font color=green>Certo.</font>
7. Considere a especificação, a seguir, de um hipotético programa que objtiva a classificação de um triângulo, a partir dos valores informados para os seus três lados.

   a) Dado um triângulo cujos segmentos medem A, B e C, que são números inteiros positivos na faixa de 0 a 100. Esse triângulo somente existirá se: (A + B < C) ou (A + C < B) ou (B + C < A).
   b) Quanto às medidas dos seus lados o triângulo, poderá ser classicado em:
         • Isósceles = quando possui dois lados com a mesma medida;
         • Escaleno = quando todos os seus lados têm medidas diferentes;
         • Equilátero = quando todos os lados tem a mesma medida;

7.1 (**2.0 pontos**) Definir uma tabela de decisão para o teste tanto da existência do triângulo, quanto para a definição do seu tipo. Consulte exemplo de tabela de decisão na tarefa 005.

   <div align=center>
     <img src="Tabela Decisão.png">
   </div>

<font color=red>Errado.</font>

7.2 (**2.0 pontos**) Criar os conjunto de casos de teste necessários para a cobertura das combinações constantes da tabela de decisão, seguindo o seguinte padrão:
|CT|Lado A|Lado B|Lado C|Resultado|
|---|---|---|---|---|
| CT1  |  5 | 2 | 2  | Não Existente  |
| CT2  |  2 | 5 | 2  | Não Existente  |
| CT3  |  2 | 2 | 5  | Não Existente  |
| CT4  |  2 | 2 | 2  | Equilátero |
| CT5  |  5 | 4 | 2  | Escaleno |
| CT6  |  3 | 3 | 3  | Isósceles |

 <font color=orange>Parcialmente correto. CT6 não passou. Nota 1,7.</font>

INSTRUÇÕES:
1. Tipo: Prova individual;
2. Local de Entrega: Plataforma Turing
3. Forma de Entrega: Entregar este arquivo, editado com suas respostas, no formato .md, nominado da seguinte forma: ts2021-2_prova-p1_mat.md, onde mat deverá ser substituído pelo número da sua matrícula.
4. **Entrega diferente da especificada não será avaliada.**
5. Data da Entrega: 22/02/2022, as 23h59min.
6. Critério de Aceitação: arquivo entregue, conforme solicitado.
