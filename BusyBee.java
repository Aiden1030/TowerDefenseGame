public class BusyBee extends HoneyBee{


    public BusyBee(Tile tile){


        super(tile,5,2);
        tile.addInsect(this);



    }



    @Override
    public boolean takeAction(){
        this.getPosition().storeFood(2);
        return true;
    }
}
