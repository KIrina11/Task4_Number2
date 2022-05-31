package GUI;

import Buttons.*;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import org.jfree.chart.ChartPanel;
import ru.vsu.cs.util.JTableUtils;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

public class WindowGUI extends JFrame {
    public JPanel mainPanel;
    public JButton buttonBinaryInsertionSort;
    public JButton buttonInsertionSort;
    public JButton buttonPerformanceTest;
    public JButton buttonRandom1;
    public JButton buttonRandom2;
    public JButton buttonRandom3;
    public JTable table1;
    public JPanel graphPanel;
    public JRadioButton radioButton1;
    public JRadioButton radioButton2;
    public JButton button1;
    public JRadioButton firstVariantButtonsRadioButton;
    public JRadioButton secondVariantButtonsRadioButton;
    public ChartPanel chartPanel;

    public WindowGUI() {
        this.setLayout(new FlowLayout());
        this.setTitle("Task 4 Number 2");
        //this.setMaximumSize();
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(100, 100, 920, 350);
        this.setResizable(false);

        radioButton1.setVisible(false);
        radioButton2.setVisible(false);
        buttonInsertionSort.setVisible(false);
        buttonBinaryInsertionSort.setVisible(false);
        button1.setVisible(false);

        JTableUtils.initJTableForArray(table1, 50, false, true,
                false, true);
        table1.setRowHeight(20);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(firstVariantButtonsRadioButton);
        group1.add(secondVariantButtonsRadioButton);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        buttonRandom1.addActionListener(new ListenerRandomButton1(table1));
        buttonRandom3.addActionListener(new ListenerRandomButton2(table1));
        buttonRandom2.addActionListener(new ListenerRandomButton3(table1));
        buttonInsertionSort.addActionListener(new ListenerInsertionSortButton(table1));
        buttonBinaryInsertionSort.addActionListener(new ListenerBinaryInsertionSortButton(table1));
        buttonPerformanceTest.addActionListener(new ListenerPerformanceTestButton(chartPanel, graphPanel, this));
        button1.addActionListener(new ListenerButton1(table1, radioButton1, radioButton2));

        firstVariantButtonsRadioButton.addActionListener(e -> {
            if (e.getSource() == firstVariantButtonsRadioButton) {
                buttonInsertionSort.setVisible(true);
                buttonBinaryInsertionSort.setVisible(true);
                button1.setVisible(false);
                radioButton1.setVisible(false);
                radioButton2.setVisible(false);
            }
        });

        secondVariantButtonsRadioButton.addActionListener(e -> {
            if (e.getSource() == secondVariantButtonsRadioButton) {
                buttonInsertionSort.setVisible(false);
                buttonBinaryInsertionSort.setVisible(false);
                button1.setVisible(true);
                radioButton1.setVisible(true);
                radioButton2.setVisible(true);
            }
        });
    }

    public void setChartPanel(ChartPanel chartPanel) {
        this.chartPanel = chartPanel;
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(9, 5, new Insets(6, 6, 6, 6), -1, -1));
        buttonRandom1 = new JButton();
        buttonRandom1.setBackground(new Color(-5458433));
        buttonRandom1.setEnabled(false);
        Font buttonRandom1Font = this.$$$getFont$$$("Bookman Old Style", Font.ITALIC, -1, buttonRandom1.getFont());
        if (buttonRandom1Font != null) buttonRandom1.setFont(buttonRandom1Font);
        buttonRandom1.setIcon(new ImageIcon(getClass().getResource("/Buttons/ListenerRandomButton1.java")));
        buttonRandom1.setText("Random(1 - 10)");
        mainPanel.add(buttonRandom1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonRandom3 = new JButton();
        buttonRandom3.setBackground(new Color(-5458433));
        buttonRandom3.setEnabled(false);
        Font buttonRandom3Font = this.$$$getFont$$$("Bookman Old Style", Font.ITALIC, -1, buttonRandom3.getFont());
        if (buttonRandom3Font != null) buttonRandom3.setFont(buttonRandom3Font);
        buttonRandom3.setIcon(new ImageIcon(getClass().getResource("/Buttons/ListenerRandomButton3.java")));
        buttonRandom3.setText("Random(1 - 500)");
        mainPanel.add(buttonRandom3, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonInsertionSort = new JButton();
        buttonInsertionSort.setBackground(new Color(-3355393));
        buttonInsertionSort.setEnabled(false);
        Font buttonInsertionSortFont = this.$$$getFont$$$("Bookman Old Style", Font.ITALIC, -1, buttonInsertionSort.getFont());
        if (buttonInsertionSortFont != null) buttonInsertionSort.setFont(buttonInsertionSortFont);
        buttonInsertionSort.setIcon(new ImageIcon(getClass().getResource("/Buttons/ListenerInsertionSortButton.java")));
        buttonInsertionSort.setText("Insertion Sort");
        mainPanel.add(buttonInsertionSort, new GridConstraints(3, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonBinaryInsertionSort = new JButton();
        buttonBinaryInsertionSort.setBackground(new Color(-3355393));
        buttonBinaryInsertionSort.setEnabled(false);
        Font buttonBinaryInsertionSortFont = this.$$$getFont$$$("Bookman Old Style", Font.ITALIC, -1, buttonBinaryInsertionSort.getFont());
        if (buttonBinaryInsertionSortFont != null) buttonBinaryInsertionSort.setFont(buttonBinaryInsertionSortFont);
        buttonBinaryInsertionSort.setIcon(new ImageIcon(getClass().getResource("/Buttons/ListenerBinaryInsertionSortButton.java")));
        buttonBinaryInsertionSort.setText("Binary Insertion Sort");
        mainPanel.add(buttonBinaryInsertionSort, new GridConstraints(4, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonRandom2 = new JButton();
        buttonRandom2.setBackground(new Color(-5458433));
        buttonRandom2.setEnabled(false);
        Font buttonRandom2Font = this.$$$getFont$$$("Bookman Old Style", Font.ITALIC, -1, buttonRandom2.getFont());
        if (buttonRandom2Font != null) buttonRandom2.setFont(buttonRandom2Font);
        buttonRandom2.setIcon(new ImageIcon(getClass().getResource("/Buttons/ListenerRandomButton2.java")));
        buttonRandom2.setText("Random(1 - 100)");
        mainPanel.add(buttonRandom2, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setBackground(new Color(-16777216));
        mainPanel.add(scrollPane1, new GridConstraints(1, 0, 1, 5, GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(900, 100), new Dimension(900, 100), new Dimension(1090, 100), 0, false));
        table1 = new JTable();
        scrollPane1.setViewportView(table1);
        graphPanel = new JPanel();
        graphPanel.setLayout(new BorderLayout(0, 0));
        mainPanel.add(graphPanel, new GridConstraints(7, 0, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        graphPanel.add(spacer1, BorderLayout.CENTER);
        final Spacer spacer2 = new Spacer();
        mainPanel.add(spacer2, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        radioButton2 = new JRadioButton();
        radioButton2.setBackground(new Color(-5458433));
        radioButton2.setEnabled(true);
        Font radioButton2Font = this.$$$getFont$$$("Bookman Old Style", Font.ITALIC, -1, radioButton2.getFont());
        if (radioButton2Font != null) radioButton2.setFont(radioButton2Font);
        radioButton2.setForeground(new Color(-16777216));
        radioButton2.setHideActionText(false);
        radioButton2.setSelected(false);
        radioButton2.setText("Binary Insertion");
        mainPanel.add(radioButton2, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button1 = new JButton();
        button1.setBackground(new Color(-3355393));
        button1.setEnabled(false);
        Font button1Font = this.$$$getFont$$$("Bookman Old Style", Font.ITALIC, -1, button1.getFont());
        if (button1Font != null) button1.setFont(button1Font);
        button1.setIcon(new ImageIcon(getClass().getResource("/Buttons/ListenerButton1.java")));
        button1.setText("Sort");
        mainPanel.add(button1, new GridConstraints(5, 0, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        radioButton1 = new JRadioButton();
        radioButton1.setBackground(new Color(-5458433));
        radioButton1.setForeground(new Color(-16777216));
        radioButton1.setSelected(true);
        radioButton1.setText("Insertion");
        mainPanel.add(radioButton1, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        firstVariantButtonsRadioButton = new JRadioButton();
        firstVariantButtonsRadioButton.setSelected(false);
        firstVariantButtonsRadioButton.setText("First variant buttons ");
        mainPanel.add(firstVariantButtonsRadioButton, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        secondVariantButtonsRadioButton = new JRadioButton();
        secondVariantButtonsRadioButton.setText("Second variant buttons ");
        mainPanel.add(secondVariantButtonsRadioButton, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonPerformanceTest = new JButton();
        buttonPerformanceTest.setBackground(new Color(-3355393));
        buttonPerformanceTest.setEnabled(false);
        Font buttonPerformanceTestFont = this.$$$getFont$$$("Bookman Old Style", Font.ITALIC, -1, buttonPerformanceTest.getFont());
        if (buttonPerformanceTestFont != null) buttonPerformanceTest.setFont(buttonPerformanceTestFont);
        buttonPerformanceTest.setIcon(new ImageIcon(getClass().getResource("/Buttons/ListenerPerformanceTestButton.java")));
        buttonPerformanceTest.setText("Performance test");
        mainPanel.add(buttonPerformanceTest, new GridConstraints(2, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        mainPanel.add(spacer3, new GridConstraints(8, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }
}
