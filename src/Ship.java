public class Ship {

    private int size;


    public Ship(int size){
        this.size = size;
        if (size > 4){
            return;
        }
        if (size <= 0){
            return;
        }
    }
}
