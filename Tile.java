public class Tile {

    private int foodOnTile;
    private boolean BeeHive;
    private boolean hornetNest;
    private boolean onPath;

    private Tile newTileHnToBh;
    private Tile newTileBhToHn;
    private HoneyBee honeyBee;
    private SwarmOfHornets hornetsOnTile;



    public Tile(){

        this.foodOnTile = 0;
        this.BeeHive = false;
        this.hornetNest = false;
        this.onPath = false;
        this.honeyBee =  null;
        this.hornetsOnTile = new SwarmOfHornets();

    }


    public Tile(int foodOnTile, boolean Beehive,boolean hornetNest,boolean onPath, Tile hnToBh,Tile BhToHn ,HoneyBee honeyBee, SwarmOfHornets hornetsOnTile){

        this.foodOnTile = foodOnTile;
        this.BeeHive = Beehive;
        this.hornetNest = hornetNest;
        this.onPath = onPath;
        this.newTileHnToBh = hnToBh;
        this.newTileBhToHn = BhToHn;
        this.honeyBee =  honeyBee;
        this.hornetsOnTile = hornetsOnTile;


}
    public boolean isHive(){
        return this.BeeHive;
    }
public boolean isNest(){
        return this.hornetNest;
}
public void buildHive(){
this.BeeHive = true;

}
public void buildNest(){
        this.hornetNest = true;

}
public boolean isOnThePath(){
        return this.onPath;

}
public Tile towardTheHive(){

        if (this.newTileHnToBh == null){
            //System.out.println("towardTheHive doesn't work in class Tile");
            return null;

        }
        else {
            return this.newTileHnToBh;
        }
}
    public Tile towardTheNest(){

        if (this.newTileBhToHn == null){
            return null;

        }else {
            return this.newTileBhToHn;
        }
    }
    public void createPath(Tile HnToBh, Tile BhToHn) {

        this.newTileBhToHn = BhToHn;
        this.newTileHnToBh = HnToBh;
        this.onPath = true;

        //if (HnToBh == null)
        //{}
        //else {HnToBh.newTileBhToHn = this;
        //    HnToBh.onPath=true;}
            //System.out.println("Tile updated");
        //if (BhToHn == null){}
       // else{
            //System.out.println("Tile updated");
        //BhToHn.newTileHnToBh = this;
       // BhToHn.onPath=true;}

    }
    public int collectFood(){
        int foodToCollect = this.foodOnTile;
        this.foodOnTile = 0;
        return foodToCollect;
    }
    public void storeFood(int food){
        this.foodOnTile = this.foodOnTile + food;

    }
    public HoneyBee getBee(){
        return this.honeyBee;
    }

    public Hornet getHornet(){
        if (this.getNumOfHornets() ==  0){return null;}
        else {return this.hornetsOnTile.getHornets()[0];}
    }
    public int getNumOfHornets(){
        if (this.hornetsOnTile == null){return 0;}

        else{return this.hornetsOnTile.getHornets().length;}
    }



    public boolean addInsect(Insect insect) {

        if (insect instanceof HoneyBee || insect instanceof TankyBee || insect instanceof BusyBee ||insect instanceof AngryBee) {

            if (this.honeyBee == null && this.isNest() == false) {

                    this.honeyBee = (HoneyBee) insect;

                    if (this.honeyBee == null){//System.out.println("honeyBee not assigned to this tile");
                        }
                    this.honeyBee.setPosition(this);

                    return true;

            }else {//System.out.println("HoneyBee not added");
                return false;
            }
        } else if (insect instanceof Hornet) {
            //Tile TheTile = insect.getPosition();
            //TheTile.removeInsect(TheTile.getHornet());
            if ((this.isNest() == true) | (this.isHive() == true)
                    | this.isOnThePath() == true) {
                //if (hornetsOnTile == null) {
                    //System.out.println("hornets on tile is null");
                    //SwarmOfHornets newHornetsOnTile = new SwarmOfHornets();
                    //this.hornetsOnTile = newHornetsOnTile;




                    this.hornetsOnTile.addHornet((Hornet) insect);

                    //return true;

                //} else {
                    //System.out.println("hornetsOnTile is not null when tile.addinsect");
                   // this.hornetsOnTile.addHornet((Hornet) insect);


                    return true;

                }
            }

        return false;}


    public boolean removeInsect(Insect insect){
        //System.out.println("at remove Insect");

                if (insect instanceof HoneyBee){

                    if (this.honeyBee == insect){



                    this.honeyBee = null;

                    return true;}
                }
                else if (insect instanceof Hornet){

                    if (this.hornetsOnTile == null){
                        //System.out.println("There is no hornetontile on the horne't tile");
                        return false;
                        }
                    else{
                        //System.out.println("there is a hornetsOnTile : removeINsect");

                    this.hornetsOnTile.removeHornet((Hornet) insect);


                    return true;}

                }



        return false;
    }




}

