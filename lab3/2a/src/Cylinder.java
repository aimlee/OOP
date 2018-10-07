public class Cylinder extends shapes {
    public Cylinder(int r, int h){
        rad =r;
        hei =h;
    }

    @Override
    public int volume(){
        int rez= (int)Math.PI*rad*rad*hei;
        return rez;
    }
}
