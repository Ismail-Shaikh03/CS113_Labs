public class Die {
    //encapsulation
    private int faceValue;
    // Default Constructor
    public Die(){
        roll();
    }

    //non-default constructor
    public Die(int newFaceValue){
        faceValue = newFaceValue;
    }


    //getter method
    public int getFaceValue(){

        return faceValue;
    }

    public void setFaceValue(int newFace){

        faceValue = newFace;
    }
    public void roll(){

        faceValue = (int) (Math.random()*6) + 1;
    }
    public String toString(){

        return "Face Value: " + faceValue;
    }

    public boolean equal(Die other ){
        if (faceValue == other.getFaceValue()){
            return true;
        }
        else{
            return false;
        }
    }
    public int compareTo(Die other){
        if (faceValue > other.getFaceValue()){
            return 1;
        }
        else if(faceValue < other.getFaceValue()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
