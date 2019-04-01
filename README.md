## Original Game link

https://github.com/msaad1999/LOST--Java-2D-Game

### Um erro que ocorria no projeto original ao clicar para sair foi corrigido
### O Fato de o robô ser instanciado novamente após a morte foi alterado , ao invés disso , ele retorna às configurações originais

#Padrões de projeto utilizados na refatoração

1.Singleton

2.Command

3.State

Classes Onde Foram Utilizados :

   Singleton : Death,Guide,Intro,credits,Robot,Menu alem das classes criadas para usar Command e State
   
   State : StartingClass,Death,Guide,Intro,credits,Menu
   
   Command : StartingClass,Robot

Porque Foram utilizados :
   
   Singleton foi utilizado pois todas as classes onde foi implementado originalmente sempre foram instanciadas uma vez,
   logo , por uma questão de melhorar a praticidade , já que todas não sofrem alteração alguma.
   
   State foi utilizado pois no código original havia uma variável primitiva que fazia as alterações de tela , assim decidi 
   utilizar State para mudar os estados da tela.
