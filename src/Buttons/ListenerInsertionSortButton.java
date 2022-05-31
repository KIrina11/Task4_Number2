package Buttons;

import ru.vsu.cs.kislova_i_v.InsertionSort;
import ru.vsu.cs.kislova_i_v.Sort;
import ru.vsu.cs.util.JTableUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;


public class ListenerInsertionSortButton implements ActionListener{
    JTable table1;

    public ListenerInsertionSortButton(JTable table1) {
        this.table1 = table1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Sort insertionSort = new InsertionSort(0, 0);
        int[] array = null;
        try {
            array = JTableUtils.readIntArrayFromJTable(table1);
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }

        ((InsertionSort) insertionSort).sort(array);

        JTableUtils.writeArrayToJTable(table1, array);
    }
}
