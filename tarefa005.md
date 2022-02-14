## Tarefa 005 - 08/02/2022 - Grafo de Causa e Efeito / Tabela de Decisão.

1.Considere o seguinte cenário: Uma corretora de seguros concede desconto sobre o prêmio anual de seguro de automóvel, aos seus segurados conforme as regras a seguir:
|Sexo|Idade (anos)|Estado Civil|Desconto (%)|
|---|---|---|---|
|Masculino|< 25|Solteiro|0|
|Masculino|< 25|Casado|5|
|Masculino|> 25|Solteiro|10|
|Masculino|> 25|Casado|15|
|Feminino|< 25|Solteira|5|
|Feminino|< 25|Casada|10|
|Feminino|> 25|Solteira|15|
|Feminino|> 25|Casada|20|

2. Solicita-se:
   1. Geração do grafo de causa e efeito para representar este cenário.
      1. Anexar a este arquivo a imagem do grafo.
   2. Geração da tabela de decisão para representar o cenário.

|Condição / Entradas| 1 | 2 | 3 | 4 |	5 | 6 |	7 |	8 |
|--|--|--|--|--|--|--|--|--|
|Sexo|Masculino|Masculino|Masculino|Masculino|Feminino|Feminino|Feminino|Feminino|
|Idade (anos)|< 25|< 25|>= 25|>= 25|< 25|< 25|>= 25|>= 25|
|Estado Civil|Solteiro|Casado|Solteiro|Casado|Solteiro|Casado|Solteiro|Casado|
|Ações / Saidas|--|--|--|--|--|--|--|--|							
|Destconto (%)|0|5|10|15|5|10|15|20|

   3. Geração do conjunto de casos de teste suficientes para cobrir todos os cenários, constantes do grafo e da tabela de decisão.
      1. Editar este arquivo e adicionar a tabela com os casos de teste, conforme exemplos disponibilizados em tarefas anteriores.

|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT01|Masculino, 24, solteiro|0|CE1|
|CT02|Masculino, 24, casado|5|CE2|
|CT03|Masculino, 25, solteiro|10|CE3|
|CT04|Masculino, 26, solteiro|10|CE3|
|CT03|Masculino, 25, casado|15|CE4|
|CT04|Masculino, 26, casado|15|CE4|
|CT05|Feminina, 24, solteira|5|CE5|
|CT06|Feminina, 24, casada|10|CE6|
|CT07|Feminina, 25, solteira|15|CE7|
|CT08|Feminina, 26, solteira|15|CE7|
|CT09|Feminina, 25, casada|20|CE8|
|CT10|Feminina, 26, casada|20|CE8|

   4. Em relação aos casos de teste, considere o valor do seguro de R$ 2.000,00 (Dois mil reais). Desta forma, o valor esperado, do resultado do caso de teste, deve ser o valor líquido a ser pago. Ou seja, o prêmio deduzido do valor correspondente ao percentual do desconto obtido pelo cliente.

|CT|Valor Esperado|
|--|--|
|CT01|2000|
|CT02|1900|
|CT03|1800|
|CT04|1800|
|CT03|1700|
|CT04|1700|
|CT05|1900|
|CT06|1800|
|CT07|1700|
|CT08|1700|
|CT09|1600|
|CT10|1600|


INSTRUÇÕES:
1. Tipo: Tarefa Individual;
2. Local de Entrega: Repositório pessoal, no github. O arquivo a ser entregue é este mesmo, editado com a inclusão dos dados solicitados.
3. Data da Entrega: 14/02/2022, as 23h59min.
4. Critério de Aceitação: Arquivo entregue com os dados solicitados.

