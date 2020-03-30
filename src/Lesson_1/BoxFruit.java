package Lesson_1;

import java.util.ArrayList;
import java.util.List;


public class BoxFruit<T extends Fruit> {

    private List<T> box;

    public BoxFruit() {
        this.box = new ArrayList<>();
    }

    public void addToBox(T fruit){
        box.add(fruit);
    }

    public float getWeight(){
        float weightOfBox = 0;
        for (T t : this.box) weightOfBox += t.getWeightOneFruit();
        return weightOfBox;
    }

    public boolean compare(BoxFruit<?> box2){
        return this.getWeight() == box2.getWeight();
    }

    public void MoveTo(BoxFruit<T> box2){
        for (T t : this.box) box2.addToBox(t);
        this.box.clear();
    }
}
