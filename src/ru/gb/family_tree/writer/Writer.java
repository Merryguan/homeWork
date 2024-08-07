package ru.gb.family_tree.writer;

import ru.gb.family_tree.model.family_tree.FamilyTree;
import ru.gb.family_tree.model.service.FamilyTreeItem;

public interface Writer<T extends FamilyTreeItem<T>> {
    //void saveToFile(List<T> list, String string);
    void saveToFile(FamilyTree<T> familyTree, String string);
    //List<T> restoreFromFileH (String string);
    FamilyTree<T> restoreFromFileFT (String string);
}
