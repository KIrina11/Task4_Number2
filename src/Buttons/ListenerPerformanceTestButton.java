package Buttons;

import org.jfree.chart.ChartPanel;
import ru.vsu.cs.kislova_i_v.JFreeChartSort;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerPerformanceTestButton implements ActionListener{
    ChartPanel chartPanel;
    JPanel graphPanel;
    JFrame frame;

    public ListenerPerformanceTestButton(ChartPanel chartPanel, JPanel graphPanel, JFrame frame) {
        this.chartPanel = chartPanel;
        this.graphPanel = graphPanel;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[] sortNames = {"Insertion", "BinaryInsertion"};
        int[] sizes = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
        JFreeChartSort graph = new JFreeChartSort(chartPanel, graphPanel, frame);
        graph.performanceTestDemo(sortNames, sizes);
    }
}
