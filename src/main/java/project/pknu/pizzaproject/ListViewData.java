package project.pknu.pizzaproject;

public class ListViewData {
    private String name;
    private int size1, size2;
    int image;

    public int getIcon() {return image;}
    public String getName() {return name;}
    public int getSizeM() {return size1;}
    public int getSizeL() {return size2;}

    public ListViewData(String name, int size1, int size2, int image) {
        this.name=name;
        this.size1=size1;
        this.size2=size2;
        this.image=image;
    }
}
