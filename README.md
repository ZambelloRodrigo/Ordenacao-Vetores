# No projeto de ordenação de vetores, foi criado em primeiro lugar na classe "Main",
uma condição para que o usuario possa escolher qual o metodo de ordenação possa executar.
Em seguida foi entra no loop While e chama as classes conforme a seleção.
1: Inserção
    É criado uma variavel int e atribuido o valor de zero, em seguida  criei uma variavel inteiro j, foi inclido dois fors 
    dentro do primeiro adicionado a variavel chave igaul a vetor[i], para atribuir no final o vetor[j+1] = chave;, dentro do sungundo for
    a variável j recebe -1, e condição de entrada é o j for menor igual a zero e vetor[j] seja maior que a chave.
    A também dentro do metodo "ordenacaoInsercao" a as variaveis que verificam a quantidade de tempo, usando o metodo System.currentTimeMillis().
    
2: Seleção
   No metodo de seleção é também usado dois laços de repetiçoes "For", criando dentro do primeiro for uma variável inicial do tipo inteiro, e iniciada
   com "0", dentro do segundo "for" é usada um "if", verificando se o vetor na indice "j" é mairo que vetor no indice "i", se caso for verdadeiro, 
   entra dentro da condição e realiza a troca dos valores, adicionando dentro da variavel auxiliar o valor da vetor j, e logo en seguida adiciona 
   dentro do vetor j o valor do vetor i, e depor dentro do vetor i é adicionado o valor da variavel auxiliar. Aqui nesse caso também foi usado o mesmo
   metodo de verificação de quntidade de tempo.
   
3: Bolha
   Nesse metodo de ordenação foi criado uma variável booleana e setada como true, logo após foi adicionado um laço de repetição "While" usando a variável,
   como condição de entrada, em seguida usou-se um laço de repetição for e dentro do mesmo foi adicionado um if com a condição  de se o vetor[i] for maior 
   que vetor[i+1] ele acessa a condição, criamor nesse momento mais uma variável auxiliar que recebe o valor do vetor[i+1], e logo apos o vetor[i] recebe 
   o valor do vetor[i+1], e o vetor[i+1] recebe o valor da variável auxiliar, e cetamos novamente a variável troca como verdadeira. Aqui nesse caso também 
   foi usado o mesmo metodo de verificação de quntidade de tempo.
   
