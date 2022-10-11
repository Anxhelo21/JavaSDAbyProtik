package Tasks.Point2D3D;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        float [] arr =  new float[2];
        arr [0] = this.getX();
        arr [1] = this.getY();
        return arr;

    }

    public void setXY(float[] arr){
        if(arr.length == 2){
            this.setX(arr[0]);
            this.setY(arr[1]);
        }
        else
            System.out.println("Your array must have only 2 values");
    }

}
