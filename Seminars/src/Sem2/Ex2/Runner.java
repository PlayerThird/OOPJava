package Sem2.Ex2;

public interface Runner {
    /**
     * Прыжок
     * @param height высота прыжка
     * @return результат прыжка(перепрыгнул или нет)
     */
   default boolean jump(int height){

           if (height <= getMaxJump()) {
               System.out.printf("%s перепрыгнул через стену %d метров\n", getName(), height);
               return true;
           } else {
               System.out.printf("%s не смог перепрыгнуть через стену %d метров\n", getName(), height);
               return false;
           }
       }


    /**
     * Бег
     * @param length дистанция
     * @return результат забега(удалось пробежать дистанцию или нет)
     */
    default boolean run(int length) {//чтобы не писать во всех классах бегунов, можно сразу тут сделать, что нужно делать
        //даже если есть уже реализация в классе данного метода
        //т.е. если там нет, значит использует эту, либо та которую мы прописали в классе
        if (length <= getMaxRun()) {
            System.out.printf("%s пробежал по дорожке %d метров\n", getName(), length);
            return true;
        } else {
            System.out.printf("%s не добежал по дорожке в %d метров\n", getName(), length);
            return false;
        }
    }

    /**
     * Получить максимальную дистанцию
     * @return
     */

    /**
     * Максимальная дистанция
     * @return
     */
    int getMaxRun();

    /**
     * Получить имя бегуна
     * @return
     */
 String getName();

    /**
     * Максимальный прыжок
     * @return
     */
    int getMaxJump();


}
