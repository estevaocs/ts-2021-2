## Tarefa 004 - 19/01/2022 - Análise do Valor Limte - Definição de casos de testes.

**DEFINIÇÃO**:
1. Considerando o conjunto de classes de equivalência que você definiu em atendimento à **Tarefa 003 - 21/12/2021 - Definição de Classes de Equivalência**.
2. Considerando as explicações a respeito do critério de teste funcional **Análise do Valor Limite** disponíveis em:
   1. [Análise do Valor Limite 1](https://viniciuspessoni.com/2020/03/15/analise-do-valor-limite/).
   2. [Análise do Valor Limite 2](https://www.youtube.com/watch?v=EQU5ODvmwzs).
   3. [Análise do Valor Limite 3](https://www.youtube.com/watch?v=jX7uyaTAn-k).
3. Pede-se a definição do conjunto de casos de testes necessários para o teste do mesmo cenário descrito na tarefa 003. Estes casos de teste deverão ser criadas a partir das diretrizes definidas pelo critério funcional "Análise do Valor Limte".
4. O Conjunto de casos de testes derivado deve seguir o seguinte padrão:

a) Os três primeiros casos de teste, visam validar o valor imediatamente inferior ao limite inferior das variáveis **nota1**, **nota2** e **faltas**, desta forma teremos:

|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT01|-0,01,7.00,64,8|"Valores Inválidos|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT02|7.00,-0.01,32,8|"Valores Inválidos|CE02,CE04,CE06,CE10,CE13,CE14,CE16,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT03|7.00,5.00,64,-1|"Valores Inválidos|CE02,CE04,CE06,CE10,CE13,CE14,CE16,CE20,CE23,CE24,CE27,CE29,CE30,CE32,CE37,CE38|

b) Os próximos três casos de teste, visam validar o limite inferior das variáveis **nota1**, **nota2** e **faltas**, desta forma teremos:
|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT03|0,00,7.00,64,8|"Recuperação"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE41|
|CT04|7.00,0.00,32,8|"Recuperação"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE41|
|CT05|7.00,5.00,64,0|"Aprovado"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE42|

c) Os próximos três casos de teste, visam validar o valor imediatamente superior ao limite inferior das variáveis **nota1**, **nota2** e **faltas**, desta forma teremos:
|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT03|0,01,7.00,64,8|"Recuperação"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE41|
|CT04|7.00,0,01,32,8|"Recuperação"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE41|
|CT05|7.00,5.00,64,1|"Aprovado"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE42|

d) Os próximos três casos de teste, visam validar o comportamento da variável faltas em relação ao percentual de 25% da carga horária. Desta forma teremos:
|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT03|5,00,7.00,64,15|"Aprovado"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE42|
|CT04|5.00,7.00,64,16|"Aprovado"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE42|
|CT05|5.00,7.00,64,17|"Reprovado por Faltas"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE34,CE37,CE39|

d) Os três primeiros casos de teste, visam validar o valor imediatamente inferior ao limite superior das variáveis **nota1**, **nota2** e **faltas**, desta forma teremos:
|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT03|9,99,7.00,64,15|"Aprovado"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE42|
|CT04|5.00,9.99,64,16|"Aprovado"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE42|
|CT05|5.00,7.00,64,63|"Reprovado por Faltas"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE34,CE37,CE39|

e) Os três primeiros casos de teste, visam validar o limite superior das variáveis **nota1**, **nota2** e **faltas**, desta forma teremos:
|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT03|10,00,7.00,64,15|"Aprovado"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE42|
|CT04|5.00,10.00,64,16|"Aprovado"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE42|
|CT05|5.00,7.00,64,64|"Reprovado por Faltas"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE34,CE37,CE39|

f) Os três primeiros casos de teste, visam validar o valor imediatamente superior ao limite superior das variáveis **nota1**, **nota2** e **faltas**, desta forma teremos:
|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT03|10,01,7.00,64,15|"Valores Inválidos"|CE02,CE04,CE08,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT04|5.00,10.01,64,16|"Valores Inválidos"|CE02,CE04,CE06,CE10,CE13,CE14,CE18,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT05|5.00,7.00,64,65|"Valores Inválidos"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE35,CE34,CE37,CE38|

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