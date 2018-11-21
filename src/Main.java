public class Main {

    public static void main(String[] args) {
        Box mySquare = new Box(4,4);
        mySquare.outputBox();

        //should output error message
        mySquare = new Box(1,1);
        mySquare.outputBox();

        mySquare = new Box(5,5);
        mySquare.outputBox();

        mySquare = new Box(3,5);
        mySquare.outputBox();
    }
}
