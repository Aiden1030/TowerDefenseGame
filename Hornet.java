public class Hornet extends Insect{
    //Field
    private int attackDamage;
    

    public Hornet(Tile hornetTile, int hp, int attackDamage){
        super(hornetTile, hp);
        this.attackDamage = attackDamage;
        this.setPosition(hornetTile);


    }
    public boolean takeAction(){

    Tile thisTile = this.getPosition();

    if (thisTile.isHive()){
        //System.out.println("hornet at beehive ");
        return false;
    }


    if (thisTile.getBee() == null) {
        //toString(thisTile.getBee());
        System.out.println("Hornet tried to move forward");


        //if (thisTile.towardTheHive().isOnThePath() || thisTile.towardTheHive().isNest()){

            //if (thisTile.isNest()) {
                //System.out.println("hornet is on the nest");}

            if (thisTile.towardTheHive() == null) {
                //System.out.println("can't locate path");
                return true;
            }
            //SwarmOfHornets newSwarmOfHornet = new SwarmOfHornets();





            //if (thisTile.towardTheHive().isOnThePath()) {
                //System.out.println("next tile is on the path");

            //}
            //int numberOfHornets = thisTile.getNumOfHornets();
            //System.out.print("the number of Hornets here is ");
            //System.out.println(numberOfHornets);

//if (thisTile.isNest()){this.setPosition(thisTile.towardTheHive());
//thisTile.removeInsect(this);    thisTile.towardTheHive().addInsect(this);
//thisTile = thisTile.towardTheHive();}
        //else if (thisTile.towardTheNest().isNest()) {
          //  System.out.println("hornet is on the nest");
      //          this.setPosition(thisTile.towardTheHive());
    //thisTile.removeInsect(this);
                //thisTile.towardTheNest().removeInsect(this);
    //thisTile = thisTile.towardTheHive();}




        //thisTile.removeInsect(this);


        //thisTile.towardTheHive().addInsect(this);
        this.setPosition(thisTile.towardTheHive());
        thisTile.removeInsect(this);
        thisTile.towardTheHive().addInsect(this);
        thisTile = thisTile.towardTheHive();






                //thisTile

        //if (thisTile.towardTheNest() == null ){}

   //else {thisTile.towardTheNest().removeInsect(this);}

   //thisTile.removeInsect(this);






                return true;

    } else{thisTile.getBee().takeDamage(this.attackDamage);}

        return true;

}

 public boolean equals(Object object){
        Hornet hornet = (Hornet) object;
        if (this.attackDamage == hornet.attackDamage){
        return super.equals(object);}
        else{
            return false;
        }

 }

        }


