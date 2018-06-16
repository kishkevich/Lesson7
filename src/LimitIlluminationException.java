public class LimitIlluminationException extends Exception{

    public LimitIlluminationException() {

        super("Освещённость не может быть меньше 300лк, добавте ещё ламп");

    }
}