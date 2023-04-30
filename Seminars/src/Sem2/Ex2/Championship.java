package Sem2.Ex2;

public class Championship {
    public static void main(String[] args) {

        //бегуны
        Runner[] runners ={
                new Cat("Барсик", 1500,2),
                new Cat("Персик", 1700,1),
                new Robot("Tx-001", 999999,0),
                new Robot("Tx-002", 5000,5),
                new Human("Пашка", 2500,2),
                new Human("Васька", 3500,1)
        };





//препятствие
        Obstacle[] obstacles = {
                new Track(1200),
                new Wall(3),
                new Track(2000),
                new Wall(2),
                new Track(3000),
                new Wall(4)
        };//соорудили трек на основе интерфейсов

        for (Runner runner: runners ){

            for (Obstacle obstacle: obstacles){
                if (obstacle instanceof Track){
                   if (!runner.run(obstacle.getLenght())){//если не осилил
                       break;

                   }
                   else //if (obstacle instanceof Wall){//если стена
                       if (!runner.jump(obstacle.getHeight())){
                           break;
                       }
                   //}
                }
            }
        }

    }
}
