

public class AirConditioner{

    private boolean isOn;
    private String productName;
    private int temperature;


    public AirConditioner(String productName){

        this.productName = productName;
        temperature = 16;
    }



    public void setProductName(String productName){
         this.productName = productName;

    }



    public void setTemperature(int temperature){
        final int  MAXIMUM_INVALID = 31;
        final int  MINIMUM_INVALID = 15;
        
        if(temperature > MINIMUM_INVALID && temperature <MAXIMUM_INVALID)
        this.temperature = temperature;

    }



    public void setOn(boolean isOn){
        this.isOn = isOn;

    }

    public void toggleIsOn(){
        if(isOn == true){
            isOn= false;        
        }
        else{
                isOn = true;
          }
    



    }



    public int getTemperature(){
        if(isOn == true){
        
            return temperature;
        } 
       
        return 0;
       }
    

    public boolean isOn(){
        return isOn;
    }


    public String getProductName(){
        return productName;
    }


    public void increaseTemperature(){
     
        if(temperature < 30){

            temperature = temperature + 1;

        }
        else{   
            System.out.println("Maximum temperature set");
            
            }
 
    }

    public void decreaseTemperature(){

        if(temperature > 16){

        temperature = temperature -1;

        }

        else{

        System.out.println("Minimum temperature reached");
        }


    }
























}
