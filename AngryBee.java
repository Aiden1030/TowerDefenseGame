public class AngryBee extends HoneyBee{
    private int attackDamage;

    public AngryBee(Tile tile, int attackDamage
    ){
        super(tile, 10 ,1);
        this.attackDamage = attackDamage;
    }


    @Override
    public boolean takeAction() {

        if (this.getPosition() == null){return false;}


        int attackNumber = 0;
        boolean toHive = true;

//should check wheather the hornet is on the path
         while (this.getPosition().isOnThePath() || this.getPosition().isHive()){
             //System.out.println("got after while loop");

             if (this.getPosition().getNumOfHornets() > 0){
                    //System.out.println("there is a hornet");
                    Hornet currentHornet = this.getPosition() .getHornet();
                    currentHornet.takeDamage(this.attackDamage);
                    return true;}

         else{
                 //System.out.print("number of hornet is   ");
             //System.out.println(this.getPosition().getNumOfHornets());
             return false;
        }}



             //else if (toHive == false ){
             //    this.getPosition()  = this.getPosition().towardTheNest();
             //   }
             //else if(toHive == true) {
             //    this.getPosition()  = currentTile.towardTheHive();



         return false;  }


    @Override
    public boolean equals(Object object) {

        if (object instanceof AngryBee){
            AngryBee angryBee = (AngryBee) object;
            if (angryBee.attackDamage == this.attackDamage && super.equals(angryBee)){
                return true;
            }else{
                return false;
            }
        }

        return false;}

    }




