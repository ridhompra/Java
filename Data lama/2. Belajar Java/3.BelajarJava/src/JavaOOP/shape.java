package JavaOOP;

public class shape {
    int getCorner (){
        return 0;
    }

}
class rectangle extends shape{
    int getCorner(){
        return 4;
    }
    int getParentCorner(){
        return super.getCorner();
    }
}
