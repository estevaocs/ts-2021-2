## Tarefa 008 - 15/03/2023 - Teste Exploratório (I)

1. O Programa zoológico (arquivo zoologico.zip), possui a seguinte documentação:
2. Classes:
~~~java
   1. Animal //classe abstrata que possui os seguintes métodos e atributos:
      1. String nome;//O nome do animal deve possuir somente letras e ter o tamanho >= 5 e <= 100;
      2. int idade;//A idade do animal deve ser >= 1 e <= 20;
      3. public Animal(String nome, int idade)//Construtor parametrizado da classe.
      4. public String movimento();//método definido para implementar o tipo de movimento do animal;
      5. public String toString();//Método definido para imprimir na tela, os dados de um animal;
      4. public abstract String emiteSom();//Método abstrato, cuja implementação fica sob responsabilidade das subclasses;
      5. private boolean validaNome(String nome)//Método definido para validar as regras aplicáveis ao nome do Animal.
      6. private boolean validaIdade(int idade)//Método definido para validar a idade do Animal.
   2. Boi //Classe definida para implementar o comportamento de um Boi;
   3. Cachorro //Classe definida para implementar o comportamento de um Cachorro;
   4. Coelho //Classe definida para implementar o comportamento de um Coelho. Vale ressaltar que o coelho tem um tipo de movimento próprio, então ele sobrescreve o método da super classe;
   5. Gato //Classe definida para implementar o comportamento de um Gato;
   6. Lobo //Classe definida para implementar o comportamento de um Lobo;
   7. Sapo ////Classe definida para implementar o comportamento de um Sapo. Igualmente ao Coelho, o Sapo também sobrescreve o método movimento() da super classe;
   8. Veterinario //responsavel por examinar os animais do zoológico. Ao examinar um animal, este deve emitir seu som;
   9. Zoologico //Esta classe mantem 12 instancias de Animais em 12 jaulas separadas, de forma que existem duas instancias de cada um dos tipos de animal. Ao ser visitada uma jaula, o método toString() do animal deve ser invocado.
~~~

3. Este trabalho consiste em duas etapas:
   1. Na primeira aula (sala) definir os cenários de teste e os casos de teste para a implementação destes cenários;
   2. A segunda aula (laboratório) implementar os casos de teste definidos na primeira etapa.


INSTRUÇÕES:
1. Tipo: Individual ou em Dupla;
2. Local de Entrega: Plataforma Turing. Entregar somente os arquivos (.java) das classes de Teste.
3. Data da Entrega: 15/03/2022 às 22hs.
4. Critério de Aceitação: Arquivo entregue conforme especificado.
5. Passos para a importação do projeto para a IDE eclipse:
   1. Baixar o arquivo compactado disponibilizado na plataforma Turing;
   2. Abrir a IDE eclipse;
   3. Na aba package explore, clicar no botão direito do mouse;
   4. escolher a opção import;
   5. General -> Existing Projects into Workspaces;
   6. Navegar até a pasta onde descompactou o arquivo, selecionar a pasta do projeto e clicar em finish;
   7. Configurar as dependências:
      1. JUnit
         1. Clicar com o botão direito do mouse sobre o nome do projeto;
         1. Selecionar a opção Build Path -> Add Libraries
         1. JUnit -> Next -> JUnit 4 -> Finish;
      2. Configurar as outras duas dependências:
         1. Clicar com o botão direito do mouse sobre o nome do projeto;
         1. Selecionar a opção Build Path -> Add External Archives
         2. Navegar até a pasta onde foram descompactados os arquivos e selecionar um de cada vez. (commons-lang-2.6.jar e hamcrest-core-1.3.jar)
