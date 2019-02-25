public class Rectangle {
    private String color;
    private int width;
    private int height;
    
    /**
     * in case width and height are assigned
     * @param color
     * @param width
     * @param height
     */

    public Rectangle(String color, int width, int height ){
        setColor(color);
        setWidth(width);
        setHeight(height);
    }

    public Rectangle(int width, int height ){
        this.color = "Blue";
        setWidth(width);
        setHeight(height);
    }

    public Rectangle(String color){
        setColor(color);
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(String color, int width){
        setColor(color);
        setWidth(width);
        this.height = 1;
    }

    public Rectangle(){
        setColor(color);
        this.width = 1;
        setHeight(height);
    }

    //Setters

    public void setColor(String color) {
        if(color != null && color.length() > 2 && color.length() < 20){
            this.color = color;
        }
    }

    public void setWidth(int width) {
        if(width > 0) {
            this.width = width;
        }else{
            this.width = 1;
        }
    }

    public void setHeight(int height) {
        if(height > 0) {
            this.height = height;
        }else{
            this.height = 1;
        }
    }

    //Getters

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    
    public void draw(){
        String paintColor = this.color.substring(0,1).toUpperCase();
        for(int row = 0; row < this.height; row++){
            for(int col = 0; col < this.width; col++){
                System.out.print(paintColor + " ");
            }
            System.out.println();
        }
    }
}