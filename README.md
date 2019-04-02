## Original Game link

https://github.com/msaad1999/LOST--Java-2D-Game

### Um erro que ocorria no projeto original ao clicar para sair foi corrigido
### O Fato de o robô ser instanciado novamente após a morte foi alterado , ao invés disso , ele retorna às configurações originais

### Para rodar o programa em ambas as versões , crie um projeto no seu IDE e coloque as pastas src e data

#Padrões de projeto utilizados na refatoração

1.Singleton

2.Command

3.Strategy

Classes Onde Foram Utilizados :

   Singleton : Death,Guide,Intro,credits,Robot,Menu alem das classes criadas para usar Command e Strategy
   
   Strategy : StartingClass,Death,Guide,Intro,credits,Menu
              Métodos : 
              
                       StartingClass : run,gameUpdate,paint,mousePressed,mouseReleased.
                       
                       Death : update,mousePress,drawImage.
                       
                       Guide : update,mousePress,drawImage.
                       
                       Intro : update,mousePress,drawImage.
                       
                       credits : update,mousePress,drawImage.
                       
                       Menu : update,mousePress,drawImage.
                       
   Command : StartingClass,Robot
   
              Métodos :
              
                        StartingClass : keyPress,keyRelease.
                        
                        Robot : move,changeSprite.
                        
Porque Foram Utilizados :
   
   Singleton foi utilizado pois todas as classes onde foi implementado originalmente sempre foram instanciadas uma vez,
   logo , por uma questão de melhorar a praticidade , já que todas não sofrem alteração alguma.
   
   Strategy foi utilizado pois no código original havia uma variável primitiva que fazia as alterações de tela , assim decidi 
   utilizar Strategy para mudar os estados da tela , alem de efetuar os métodos com finalidades similares nas classes que implementam sem
   precisar de if e else.

   Command foi utilizado para poder efetuar os comandos do jogador sem precisar de inumeros switchs ao apertar e soltar os botões do 
   teclado
