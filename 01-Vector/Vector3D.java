
/**
 * Write a description of class Vector3D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vector3D
{
    // instance variables - replace the example below with your own
    //public double x, y, z; //untuk uniTest01
    private double x, y, z;  //untuk uniTest02

    /**
     * Constructor for objects of class Vector3D
     */
    public Vector3D(double x, double y, double z)
    {
       this.x=x;
       this.y=y;
       this.z=z;
       
       //uniTest02
       getX();
       getY();
       getZ();
       
    }
    
    public double getX(){
        return x;    
    }
    
    public double getY(){
        return y;    
    }
    
    public double getZ(){
        return z;    
    }

    
}
