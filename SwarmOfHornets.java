
public class SwarmOfHornets {
    private Hornet[] hornetsArray;

    private int size;
    public SwarmOfHornets(){
        this.hornetsArray = new Hornet[0];
        this.size = size;
    }
    public int sizeOfSwarm(){
        return this.size;
    }
    public Hornet[] getHornets(){
        return this.hornetsArray;

    }
    public Hornet getFirstHornet() {
        if (this.hornetsArray == null || this.hornetsArray.length == 0) {
            return null;
        } else {

            return this.hornetsArray[0]; // check again if this returns null when there is nothing in the array
        }
    }

    public void addHornet(Hornet hornet){

     int lengthBefore = this.hornetsArray.length;
     int lengthAfter = this.hornetsArray.length +1;

     Hornet[] copyArray = new Hornet[lengthAfter];
     int i = 0;
     //System.out.println("adding hornet started...");
     while (i < lengthBefore){
         copyArray[i] = this.hornetsArray[i];
         i = i+1;
     }
     copyArray[lengthAfter-1] = hornet;
     this.hornetsArray = copyArray;
     this.size = this.size +1;
     //System.out.println("adding hornet ended...");


    }
    public boolean removeHornet(Hornet hnt) {


        int lengthBefore = this.hornetsArray.length;

        if (lengthBefore == 0) {return false;}
        int lengthAfter = this.hornetsArray.length -1;

        Hornet[] copyArray = new Hornet[lengthAfter];
        int i = 0;
        int one = 0;

        while (i<=lengthAfter){



            if ( this.hornetsArray[i] == hnt){
                this.size = lengthAfter;
                System.out.print(i);

                one = 1;
                i = i+1;
                System.out.println("erased the horenet at ");

            }


            else{
            copyArray[i-one] = this.hornetsArray[i];
            i = i+1;}
        }
if (this.size == lengthAfter){
    System.out.println("size the same");
        this.hornetsArray = copyArray;
        if (copyArray == this.hornetsArray){
            System.out.println("they are the same");
        }
        return true;}
else {return false;}

        //if (this.hornetsArray==null){return false;}
        //else if (this.hornetsArray.length>0){
          //  int i = 0;
            //while (i<this.hornetsArray.length){
              //  if (this.hornetsArray[i] == hnt){
                //    this.hornetsArray[i] = null;
                  //  this.size = this.size - 1;
                //}

                //i// = i+1;
            }


        }
