abstract class Insect {
    private Tile tile ;
    private int hp;


    public Insect(Tile tile, int hp){

        this.hp = hp;
        this.tile = tile;

        if (this instanceof HoneyBee){
            if (tile.getBee() == null) {
                boolean x = tile.addInsect(this);
                //System.out.println("Insect is added to tile");
            }
            else {throw (new IllegalArgumentException());}
        }else{
            tile.addInsect(this);
        }
        }



    public final Tile getPosition(){
        return this.tile;
    }
    public final int getHealth(){
        return this.hp;

    }

    public void setPosition(Tile tile){
        this.tile = tile;}



        //if (this instanceof Hornet){
          //  System.out.println("Hornet set position");
            //this.tile = tile.towardTheHive();






    public void  takeDamage(int damage){



        if (this instanceof HoneyBee && this.tile.isHive()){

            damage = (int) (0.9 * damage);


        }

        this.hp = this.hp - damage;

        //System.out.println("damage taken");


        if (this.tile == null){

        } else if (this.hp <= 0){

            tile.removeInsect(this);}
        }


     abstract public boolean takeAction();

    public boolean equals(Object object){
        if (object instanceof HoneyBee && this instanceof HoneyBee){
            HoneyBee honeyBee = (HoneyBee) object;
            int newHP = honeyBee.getHealth();
            Tile newTile = honeyBee.getPosition();
            if ( newHP == this.hp && newTile == this.tile){
                return true;
            }}
        else if (object instanceof Hornet && this instanceof Hornet){

                Hornet hornet = (Hornet) object;
                int newHP = hornet.getHealth();
                Tile newTile = hornet.getPosition();
                if ( newHP == this.hp && newTile == this.tile){
                    return true;
        }}

        else {return false;}
        return false;
    }
}


