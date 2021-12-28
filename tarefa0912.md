## Tarefa 003 - 21/12/2021 - Definição de Classes de Equivalência.

**DEFINIÇÃO**:
1. Definir um conjunto de classes de Equivalência e um conjunto de casos de testes derivados, para testar a seguinte função de avaliação universitária.
2. A função avalicao, recebe como parâmtros os seguintes dados:
   2.1. **nota1** (numérico de ponto flutuante com duas casas decimais);
   2.2. **nota2**  (numérico de ponto flutuante com duas casas decimais);
   2.3. **cargaHoraria** (numérico inteiro, positivo);
   2.4. **faltas** (numérico inteiro, positivo).
3. A forma de calcular a avaliação é a seguinte:
  3.1. Se a quantidade de faltas for superior a 25% da carga horária, o aluno estará reprovado por falta. Neste caso a função retorna a seguinte mensagem "Reprovado por Falta";
  3.2. Estando o aluno reprovado por falta, não haverá a necessidade de se avaliar as notas;
  3.2. Se a média entre nota1 e nota2 for menor que 3.0, o aluno estará reprovado por média.  Neste caso a função retorna a seguinte mensagem "Reprovado por Média";
  3.3. Se a média entre nota1 e nota2 for >= 3.0 e < 6.0, o aluno estará em recuperação.  Neste caso a função retorna a seguinte mensagem "Recuperação";
  3.4 Em qualquer outra situação o aluno estará  aprovado. Então a função retornará a mensagem: "Aprovado".
4. O Conjunto de classes de Equivalência deverá ser definido seguindo o seguinte padrão:

|id|descrição|V/I|
|--|--|--|
|CE01|nota1 < 0|I|
|CE02|nota1 >= 0 && nota1 <=10|V|
|CE03|nota1 > 10|I|
|CE04|nota2 < 0|I|
|CE05|nota2 >= 0 && nota2 <=10|V|
|CE06|nota2 > 10|I|
|CE07|cargaHoraria <= 0|I|
|CE08|cargaHoraria > 0|V|
|CE09|faltas < 0|I|
|CE10|faltas >= 0|V|

Onde:
**CE** = Classe de Equivalência, seguido de um número sequencial;
**Descrição** = define um cenário de teste;
**V/I** = Válida ou Inválida.

5. O Conjunto de casos de testes derivado das classes de Equivalência deve seguir o seguinte padrão:

|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT01|-2|Valor Inválido|CE1|
|CT02|2|Valor Válida|CE2|
|CT03|11|Valor Inválida|CE3|
|CT04|-4|Valor Inválido|CE4|
|CT05|8|Valor Válida|CE5|
|CT06|40|Valor Inválida|CE6|
|CT07|0|Valor Inválida|CE7|
|CT08|40|Valor Válida|CE8|
|CT09|-7|Valor Inválida|CE9|
|CT10|4|Valor Válida|CE10|

Onde:
**CT** = Caso de Teste, seguido de um valor sequencial;
**Valor de entrada** é o valor informado para a variável;
**Resultado esperado** é o resultado que se espera da execução da função;
**Classe de Equivalência** é a identificação de qual classe de equivalência está sendo exercitada pelo caso de teste.

INSTRUÇÕES:
1. Tipo: Esta tarefa é individual;
2. Como responder: Pode-se editar este arquivo, complementando as tabelas de definições de classes de equivalência e dos casos de teste.
2. Local de Entrega: A entrega deverá seu repositório pessoal, utilizado para a manutenção dos artefatos de trabalho d disciplina (ts-2021-2);
3. Data da Entrega: Esta tarefa deve estar disponível para avaliação até o dia 28/12/2021 às 23h59min.
4. Critério de Aceitação: tarefa entregue conforme especificado e na data definida.
5. Caso necessite de suporte, pode encaminhar mensagem para o professor.

