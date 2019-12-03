# <h1><b>RPGPattern</b></h1>

RPGPattern é o nome do projeto JAVA que contém 3 tipo diferentes de design patterns.

### <h2><b>Objetivo</b></h2>

O cénario do projeto foi baseado em um famoso genero de jogo chamado RolePlay Gaming que nele
contém duas classes; guerreiro e mago, e, também possui alguns conceitos de RPG como nivel e
também 3 tipos de armas elas cajado de fogo, espada e escudo e canivete.

## <h2><b>Patterns</b></h2>

<ul>
  <li><b>State</b></li>
  <li><b>Factory</b></li>
  <li><b>Decorate</b></li>
</ul>


### <h2><b>State</b></h2>

Foi criada uma interface chamada Arma e três classes que implementam ela, cajadoDeFogo, espadaeEscudo e canivete.
O state foi usado para quando se trocar a arma todos os metodos da classe atual que implementa Arma também serão trocados
de acordo com a caracteristica da classe.

### <h2><b>Factory</b></h2>

Controla as classes, no caso, só podem ser criadas guerreiro e mago, caso contrário aparecerá uma mensagem para
o usuario alertando o erro. Foi utilizada para controle e também fazer a instanciação em tempo de execução.

### <h2><b>Decorate</b></h2>

Você consegue subir de nivel com a benção de um Deus ou não, depende de como está instanciado seu objeto.
Decorate irá decidir se você subirá de nivel recebendo uma benção de um Deus ou não.


<h3>Autores</h3>
<li>Vinícius Langholz - (https://github.com/viniciuslangholz)</li>
<li>Vinícius Rodrigues - (https://github.com/Rodriguesss)</li>
