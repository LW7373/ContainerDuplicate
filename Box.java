/*
Moses Dong, Nicholas Xu, and Lindsay Wang
Schenk
AP CSA - Period 7
Glizzy Goblin - Sausage Container Class
25 September 2023
*/

package dongwangxu.seven;
import dongwangxu.seven.MeatTypeEnum.MeatType;
import dongwangxu.seven.Sausage;

public class PackBox{

    // Class fields
    private String material;
    private double length;
    private double width;
    private double height;
    private int numSausageLinks;
    private boolean isShipped;
    private Sausage[] sausageArray;

    public PackBox(String material, double length, double width, double height, int numSausageLinks, boolean isShipped, Sausage[] sausageArray) {
        this.material = material;
        this.length = length;
        this.width = width;
        this.height = height;
        this.numSausageLinks = numSausageLinks;
        this.isShipped = isShipped;
        this.sausageArray = sausageArray;
    }

    //public Box(){
    //    for (int a = 0; a < 24; a++){
    //        sausageArray[a] = new Sausage();
    //    }
    //}









    // GETTERS AND SETTERS
    public String getMaterial(){
        return this.material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public double getLength(){
        return this.length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public int getNumSausageLinks(){
        return this.numSausageLinks;
    }

    public void setNumSausageLinks(int numSausageLinks){
        this.numSausageLinks = numSausageLinks;
    }

    public boolean isShipped(){
        return this.isShipped;
    }

    public void setShipped(boolean isShipped){
        this.isShipped = isShipped;
    }

    public Sausage[] getSausageArray(){
        return this.sausageArray;
    }

    public void setSausageArray(Sausage[] sausageArray){
        this.sausageArray = sausageArray;
    }


    // verify input for arrayIndex and data type of sausageArray

    
    // CRUD
    private void AddSausage(Sausage newSausage){        
        int arrayLen =  this.sausageArray.length;
        Sausage[] sausageArrayNew = new Sausage(arrayLen + 1);
        System.arraycopy(sausageArray, 0, sausageArrayNew, 0, arrayLen);
        sausageArrayNew[arrayLen + 1] = newSausage; 
        this.setSausageArray(sausageArrayNew);
        for (int i = 0; i < arrayLen + 1){
           system.print(sausageArray[i]);
        }
    }

    private Sausage ReturnSausage (){
        // return sausageArray[a][b];
        // return new Sausage();
        int arrayLen = this.sausageArray.length;
        for (int i = 0; i < arrayLen + 1){
           system.print(sausageArray[i]);
        }
    }

    private void ChangeSausage(int arrayIndex, Sausage newSausage){
        this.sausageArray[arrayIndex] = newSausage;
        this.setSausageArray(sausageArray);
        for (int i = 0; i < sausageArray.length){
            system.print(sausageArray[i]);
        }
    }

    private void DeleteSausage(int arrayIndex){
        //sausageArray[a][b] = new Sausage(); 
        int arrayLen =  this.sausageArray.length;
        Sausage[] sausageArrayNew = new Sausage(arrayLen - 1);        
        int j = arrayIndex;
        for(int i= 0, k = 0; i< arrayLen; i++){
            if(i != j){
                sausageArrayNew[k] = this.sausageArray[i];
                k++;
            }
        }
        this.setSausageArray(sausageArrayNew);
        for (int i = 0; i < arrayLen + 1){
            system.print(sausageArray[i]);
        }
    }
}
