/**
 * Box class which has width and height
 */
public class Box {

    private int width;
    private int height;

    //Constructor to define the width and height
    //could also defined getters and setters but no need in this example
    Box(int width, int height){
        this.width = width;
        this.height = height;
    }


    /**
     * This method prints out the box on the console
     * if the width and height cannot construct a box shape an error message will be printed out
     * idea is to have to loops one for the rows and one for the column
     */
    public void outputBox() {
        if(width < 2 || height < 2){
            System.out.println("Cannot draw a box for this shape");
            return;
        }
        //row loop
        for(int row = 0; row < height; row++){
            String rowValue = ""; //rowValue re-initiated for every new row
            //column loop
            for(int column = 0; column < width; column++){
                if(row == 0 && column == 0){
                    rowValue += "┌"; //top left corner
                }
                else if(row == height-1 && column == width-1){
                    rowValue += "┘"; //bottom rightcorner
                }
                else if(row == 0 && column == width-1){
                    rowValue += "┐"; // top right corber
                }
                else if(row == height-1 && column == 0){
                    rowValue += "└"; //bottom left corner
                }
                else{ //as corners defined everything else falls under else statement
                    if(column == 0 || column == width -1){
                        rowValue += "|"; //vertical for first and last columns
                    }
                    else if(row == 0 || row == height -1){
                        rowValue += "-"; //horizontals for first and last row
                    }
                    else{
                        rowValue += " "; //space in all teh other cases
                    }
                }

            }
            System.out.println(rowValue);
        }
    }
}
