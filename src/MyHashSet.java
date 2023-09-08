
import java.util.HashSet;

public class MyHashSet<Animal> extends HashSet<Animal>{

    @Override
    public boolean add(Animal animal) {
        if (this.contains(animal)) return false; //Вот тут вообще неважно, что передавать, главное, не вызывать родительский класс)) То есть как returns true, так и returns false НЕ добавят элемент
        else return super.add(animal);
    }

    public boolean contains(Object obj) {
        boolean res = false;

        for (Animal item : this) {
            if (item.getClass() == obj.getClass()) {
                res = true;
            }
        }
        return res;
    }
}