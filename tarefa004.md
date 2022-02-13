## Tarefa 004 - 19/01/2022 - Análise do Valor Limte - Definição de casos de testes.

**DEFINIÇÃO**:
1. Considerando o conjunto de classes de equivalência que você definiu em atendimento à **Tarefa 003 - 21/12/2021 - Definição de Classes de Equivalência**.
2. Considerando as explicações a respeito do critério de teste funcional **Análise do Valor Limite** disponíveis em:
   1. [Análise do Valor Limite 1](https://viniciuspessoni.com/2020/03/15/analise-do-valor-limite/).
   2. [Análise do Valor Limite 2](https://www.youtube.com/watch?v=EQU5ODvmwzs).
   3. [Análise do Valor Limite 3](https://www.youtube.com/watch?v=jX7uyaTAn-k).
3. Pede-se a definição do conjunto de casos de testes necessários para o teste do mesmo cenário descrito na tarefa 003. Estes casos de teste deverão ser criadas a partir das diretrizes definidas pelo critério funcional "Análise do Valor Limte".
4. O Conjunto de casos de testes derivado deve seguir o seguinte padrão:

|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT01|-2|Valor Inválido|CE1|
|CT02|1|Valor Válido|CE02|
|CT03|10|Valor Válido|CE02|
|CT04|11|Valor Inválido|CE03|
|CT05|1, -1|Valor Inválido|CE04|
|CT06|1, 1|Valor Válido|CE05|
|CT07|1, 10|Valor Válido|CE05|
|CT08|1, 11|Valor Inválido|CE06|
|CT09|1, 10,-1|Valor Inválido|CE07|
|CT10|1, 10, 0|Valor Inválido|CE07|
|CT11|1, 10, 1|Valor Válido|CE08|
|CT12|1, 10, 1, -1|Valor Inválido|CE09|
|CT13|1, 10, 10, 11|Valor Inválido|CE11|
|CT14|10, 10, 100, 26|Reprovado por Falta|CE10|
|CT15|10, 10, 100, 25|Aprovado|CE10|
|CT16|10, 10, 100, 24|Aprovado|CE10|
|CT17|2, 2, 100, 24|Reprovado por Média|CE10|
|CT18|3, 3, 100, 24|Recuperação|CE10|
|CT19|4, 4, 100, 24|Recuperação|CE10|
|CT20|5, 5, 100, 24|Recuperação|CE10|
|CT21|6, 6, 100, 24|Aprovado|CE10|
Onde:
**CT** = Caso de Teste, seguido de um valor sequencial;
**Valor de entrada** é o valor informado para a variável;
**Resultado esperado** é o resultado que se espera da execução da função;
**Classe de Equivalência** é a identificação de qual classe de equivalência está sendo exercitada pelo caso de teste.

INSTRUÇÕES:
1. Tipo: Esta tarefa é individual;
2. Como responder: Pode-se editar este arquivo, complementando as tabelas de definições de classes de equivalência e dos casos de teste.
3. Local de Entrega: A entrega deverá seu repositório pessoal, utilizado para a manutenção dos artefatos de trabalho da disciplina (ts-2021-2);
4. Data da Entrega: Esta tarefa deve estar disponível para avaliação até o dia 24/01/2022 às 23h59min.
5. Esta tarefa valerá nota e presença para aula assíncrona do dia 18/01/2022.
6. Critério de Aceitação: tarefa entregue conforme especificado e na data definida.
7. Caso necessite de suporte, pode encaminhar mensagem para o professor.