import java.security.PublicKey;

enum Lights{
    RED,YELLOW,GREEN
}
class Simulation_56473{
    //variable that stores the current light
    Lights Ls = Lights.RED;
    void ChangeColor_56473(){
        switch (Ls){
            case RED :
                Ls=Lights.YELLOW;
                break;
            case YELLOW :
                Ls=Lights.GREEN;
                break;
            case GREEN :
                Ls=Lights.RED;
                break;
        }
    }
    public String toString(){
        return " "+Ls;
    }

}
public class Traficlights {
public static void main(String[] args){
    Simulation_56473 s = new Simulation_56473();
    for (int i = 0; i < 6; i++) {
        System.out.println(s);
        s.ChangeColor_56473();
    }

}
}
