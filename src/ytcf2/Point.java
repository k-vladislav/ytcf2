/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ytcf2;

/**
 *
 * @author vkom9
 */
public class Point implements Comparable<Point>{
    private int x,y,z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    
    private double distanceTo(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    @Override
    public int compareTo(Point o) {          
               return Double.compare(this.distanceTo(), o.distanceTo());
    }   
       
}
