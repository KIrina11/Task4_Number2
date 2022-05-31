package Buttons;

import ru.vsu.cs.kislova_i_v.BinaryInsertionSort;
import ru.vsu.cs.kislova_i_v.InsertionSort;
import ru.vsu.cs.kislova_i_v.Sort;
import ru.vsu.cs.util.JTableUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class ListenerButton1 implements ActionListener{
    JTable table1;
    JRadioButton radioButton1;
    JRadioButton radioButton2;

    public ListenerButton1(JTable table1, JRadioButton radioButton1, JRadioButton radioButton2) {
        this.table1 = table1;
        this.radioButton1 = radioButton1;
        this.radioButton2 = radioButton2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Sort insertion, binaryInsertion;
        int[] array = null;
        if (radioButton1.isSelected()) {
            insertion = new InsertionSort(0, 0);
            try {
                array = JTableUtils.readIntArrayFromJTable(table1);
            } catch (ParseException parseException) {
                parseException.printStackTrace();
            }
            insertion.sort(array);
        } else if (radioButton2.isSelected()) {
            binaryInsertion = new BinaryInsertionSort(0, 0);
            try {
                array = JTableUtils.readIntArrayFromJTable(table1);
            } catch (ParseException parseException) {
                parseException.printStackTrace();
            }
            binaryInsertion.sort(array);
        }
        JTableUtils.writeArrayToJTable(table1, array);
    }
}
