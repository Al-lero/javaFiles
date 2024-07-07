package Interfaces;

public class List implements MyList {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public List(){
        this.size = 0;
    }


    @Override
    public void addTo(String object) {
        size++;

    }

    @Override
    public void removeFrom(String object) {
        size--;
    }


}
