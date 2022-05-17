
public class Task1_H12 {
    enum Shapes{
        square,
        rectangle,
        circle,
        trapezoid,
        rhombus,
        triangle,
        oval,
        hexagon
    }
    static class Display{
       Shapes m1 =  Shapes.square;
        void changeShape(){
            switch(m1) {
                case square:
                    m1 = Task1_H12.Shapes.rectangle;
                    break;
                case rectangle:
                    m1 = Task1_H12.Shapes.circle;
                    break;
                case circle:
                    m1 = Task1_H12.Shapes.trapezoid;
                    break;
                case trapezoid:
                    m1 = Task1_H12.Shapes.rhombus;
                    break;
                case rhombus:
                    m1 = Task1_H12.Shapes.triangle;
                    break;
                case triangle:
                    m1 = Task1_H12.Shapes.oval;
                    break;
                case oval:
                    m1 = Task1_H12.Shapes.hexagon;
                    break;
                case hexagon:
                    m1 = Task1_H12.Shapes.square;
                    break;
            }

        }
        public String toString(){
            return ""+m1;
        }
    }
    public static void main(String[] args){
        Display m = new Display();
        for (int i = 0; i < 7 ; i++) {
            System.out.println(m);
            m.changeShape();

        }

    }


}
