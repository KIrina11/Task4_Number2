package Buttons;

import ru.vsu.cs.util.JTableUtils;
import ru.vsu.cs.util.MyArrayUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerRandomButton2 implements ActionListener {
    JTable table1;

    public ListenerRandomButton2(JTable table1) {
        this.table1 = table1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int[] array = MyArrayUtils.setRandomArray(500, 100);
        JTableUtils.writeArrayToJTable(table1, array);
    }
}
