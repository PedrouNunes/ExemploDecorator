Exemplo de Decorator em Java:
 Este é um exemplo simples de um padrão de design Decorator em Java. O exemplo é baseado em uma pizzaria, onde podemos adicionar coberturas 
extras à pizza básica.

Estrutura do código:
O exemplo é composto pelas seguintes classes:
Pizza: Interface que define a funcionalidade básica de uma pizza. 
PlainPizza: Implementação concreta da interface Pizza. 
ToppingDecorator: Classe abstrata que também implementa a interface Pizza e mantém uma referência à instância que ela decora. 
Cheese: Implementação concreta de ToppingDecorator que adiciona cobertura de queijo à pizza. 
PizzaStore: Classe de cliente que instancia uma pizza concreta e a decora com os objetos de decorador apropriados.

Como :
 Para executar o exemplo, basta compilar e executar a classe PizzaStore. 
É possível fazê-lo através do seguinte comando: javac PizzaStore.java && java PizzaStore O resultado da execução será a descrição e o 
custo da pizza resultante, que será uma pizza simples com cobertura de queijo.

Considerações finais Este exemplo é apenas uma ilustração simples do padrão Decorator em Java e pode ser facilmente estendido 
para incluir outros tipos de coberturas de pizza ou funcionalidades adicionais. O objetivo é fornecer uma ideia básica de como funciona 
o padrão de design e como ele pode ser implementado em Java.


