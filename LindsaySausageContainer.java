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

public class Package {

    // Class fields
    private String material;
    private double length;
    private double width;
    private double height;
    private int numSausageLinks;
    private boolean isShipped;
    private Sausage[] sausageArray;

    public Package(String material, double length, double width, double height, int numSausageLinks, boolean isShipped, Sausage[] sausageArray) {
        this.material = material;
        this.length = length;
        this.width = width;
        this.height = height;
        this.numSausageLinks = numSausageLinks;
        this.isShipped = isShipped;
        this.sausageArray = sausageArray;
    }

    public Box(){
        for (int a = 0; a < 50; a++){
            sausageArray[a] = new Sausage();
        }
    }









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





    // CRUD
    private void AddSausage(int endingIndex, Sausage newSausage){

    }

    private Sausage ReturnSausage (int a, int b){
        //return sausageArray[a][b];
        return new Sausage();
    }

    private void ChangeSausage(int a, int b, Sausage newSausage){

    }

    private void clearSausage(int a, int b){
        //sausageArray[a][b] = new Sausage(); 
    }

    public Sausage[] getSausageArray(){
        return this.sausageArray;
    }

    public void setSausageArray(Sausage[] sausageArray){
        this.sausageArray = sausageArray;
    }
}
