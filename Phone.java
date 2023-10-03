public class Phone {

    // attributs
    String model ;
    String color ;
    double camera;

 public Phone(String model,String color,double camera){
   
  this. model=model;
  this.color=color;
  this.camera=camera;

    
    
   }
   



    // comportements
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

public double getCamera(){
    return camera;
}

    public void setCamera(double camera) {
        this.camera = camera;
    }


    @Override
    public String toString() {
        String output = "";
        output += "Model: " + this.model+ "\n" ;
        output += "Color: " + this.color + "\n";
        output += "Camera: " + this.camera + "\n";
        
        return output; 
    }
    
@Override


   
public boolean equals (Object otherPhone) {

    if (this== otherPhone ){
        return true;
    }
   
    if (!(otherPhone instanceof Phone)){
        return false;
    }

}






}




