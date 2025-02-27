package homeWork.model.human.comparators;

import java.util.Comparator;

import homeWork.model.FamilyTree.TreeItem;

public class HumanComparatorByAge<E extends TreeItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
