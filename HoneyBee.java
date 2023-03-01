public abstract class HoneyBee extends Insect{
    private int foodCost;



    public HoneyBee(Tile honeyBeeTile, int hp, int foodCost){

        super(honeyBeeTile,hp);
        if (honeyBeeTile.getBee() == null){
        honeyBeeTile.addInsect(this);}

        this.foodCost = foodCost;
    }
    public int getCost(){
        return this.foodCost;
    }

    public boolean equals(Object object){

        if (object instanceof HoneyBee){
        HoneyBee honeyBee = (HoneyBee) object;
        if (this.foodCost == honeyBee.foodCost){
            return super.equals(object);}
        else{
            return false;
        }}return false;

    }

    @Override
    public void takeDamage(int damage) {

        super.takeDamage(damage);
    }
}
