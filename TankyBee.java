public class TankyBee extends HoneyBee{
    private int attackDamage;
    private int armor;

    private Hornet emptyHornet;
    public TankyBee(Tile tile,int attackDamage, int armor){
        super(tile, 30,3);
        this.attackDamage = attackDamage;
        this.armor = armor;



    }

    @Override
    public boolean takeAction() {

        if (this.getPosition().getNumOfHornets()>0) {
            Hornet currentHornet = this.getPosition().getHornet();
            currentHornet.takeDamage(this.attackDamage);
            return true;
        }
        else if (this.getPosition().getNumOfHornets() == 0){
            return false;
        }return false;}



    @Override
    public void takeDamage(int damage) {

        double doubleArmor = (double) this.armor;

        double multiplierInDouble = 100.0/(100.0+doubleArmor);
        double damageInDouble = damage;

        double damageFinal = damageInDouble*multiplierInDouble;

        super.takeDamage((int)damageFinal);

    }

    @Override
    public boolean equals(Object object) {

        if( super.equals(object) ){
            TankyBee tankyBee = (TankyBee) object;
            if (tankyBee.armor == this.armor && tankyBee.attackDamage == this.attackDamage)
                return true;
        }
        else {return false;}
    return false;
}}
