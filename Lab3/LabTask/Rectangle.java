/**
 *
 * @author fa18-bcs-107
 */
public class Rectangle {
    private float length;
    private float height;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    public float getArea(){
        return length*height;
    }
    
    public float getPerimeter(){
        return (length+height)*2;
    }
}
