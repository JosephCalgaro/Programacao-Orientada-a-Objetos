Revisão para a prova de Programação orientada a objetos:


1) Explique os seguintes conceitos de POO em Java:

a) Classe: Modelo/Plano que define a estrutura/comportamento de um objeto

b) Objeto: Uma entidade espcifica com estado e ccomportamento definidos

c) Atributo: É uma variavel declarada dentro de uma classe que armazena dados e descreve estados ou caracteristicas de cada objeto instanciado

d) Método: É um bloco de codigo utilizado para definir um coportamento especifico de um onjeto

e) Encapsulamento: É um principio da POO que consistem em proteger e organizar o acesso aos dados atraves da caracteristica private e os metodos getters e setters dento de uma classe

2) Qual a diferença entre método e construtor em uma classe? Dê um exemplo.

    Um método define um comportamento especifico de um objeto dentro de uma classe, ja um construtor popula o objeto com informações dadas pelo sistema/usuário

    ex:
        //construtor
        public Usuario(String nome, String senha){
            ths.nome = nome;
            this.senha = senha;
        }
        
        
        //metodo 
        public boolean login(String usuario, String senha) {
        return this.nome.equals(usuario) && this.senha.equals(senha);
         }
  

3) O que são modificadores de acesso em Java? Cite e explique brevemente os principais.

Os modificadores de acesso em Java controlam a visibilidade de classes, atributos e métodos, sendo os principais public, private, protected e default.

public: Permite acesso total, ou seja, qualquer classe em qualquer pacote pode acessar o membro. 
private: Restringe o acesso apenas à própria classe onde o membro foi declarado, garantindo encapsulamento. 
protected: Permite acesso por classes do mesmo pacote e por subclasses, mesmo que estas estejam em pacotes diferentes. 
default (ou package-private): Aplicado quando nenhum modificador é declarado, permitindo acesso apenas para classes do mesmo pacote. 

4) Qual a diferença entre os tipos de dados String, int e boolean? Dê um exemplo de uso de cada um.

String: O tipo de dado String espera uma serie de caracteres, mais utilizados para guardar nomes, senhas, etc...
int: O tipo de dado int espera uma serie de numeros inteiros, mais utilizados para guardar resultados aritmeticos, valores inteiros, quantidade de produtos, etc...
boolean: O tipo de dado boolean (ou bool) espera retornar apenas true ou false, mais utilizado para metodos de autenticação, metodos para verificar igualdade, etc...

5) Explique o que é e para que serve o método toString() em uma classe.

O metodo toString() e normalmente utilizado para retornar uma representação textual de um objeto, sendo geralmente utilizado para funções de depuração, registro (login) e exibição legivel dos dados

6) Descreva o que acontece quando se tenta acessar um atributo privado diretamente fora da classe. Como é possível acessá-lo de forma correta?

Ao tentar acessar diretamente um atributo declarado como private fora da classe em que foi definido, o compilador do Java gera um erro de compilação indicando que o campo não é visível. A forma correta de acessar o atributo seria atravez de getters e setters que permitiriam o construtor a popular a classe com os valores desejados
