package Tasks.Point2D3D;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float [] arr =  new float[3];
        arr [0] = this.getX();
        arr [1] = this.getY();
        arr [2] = this.getZ();
        return arr;
    }

    public void setXYZ(float[] arr){
        if(arr.length == 3){
            this.setX(arr[0]);
            this.setY(arr[1]);
            this.setZ(arr[2]);
        }
        else
            System.out.println("Your array must have only 2 values");
    }

}
