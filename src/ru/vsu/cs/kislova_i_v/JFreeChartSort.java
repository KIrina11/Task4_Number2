package ru.vsu.cs.kislova_i_v;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class JFreeChartSort {

    ChartPanel chartPanel;
    JPanel graphPanel;
    JFrame frame;

    public JFreeChartSort (ChartPanel chartPanel, JPanel graphPanel, JFrame frame) {
        this.chartPanel = chartPanel;
        this.graphPanel = graphPanel;
        this.frame = frame;
    }

    private static double[][] performanceTest(int[] sizes, String[] sortsName) {
        Sort insertionSort, binaryInsertionSort;
        Random rnd = new Random();
        double[][] result = new double[sortsName.length][sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            int[] array1 = new int[sizes[i]];
            int[] array2 = new int[sizes[i]];
            for (int j = 0; j < array1.length; j++) {
                array1[j] = rnd.nextInt(100000);
                array2[j] = rnd.nextInt(100000);
            }

            insertionSort = new InsertionSort(0 , 0);
            binaryInsertionSort = new BinaryInsertionSort(0 , 0);

            insertionSort.sort(array1);
            binaryInsertionSort.sort(array2);

            int moment1 = insertionSort.getComparisonNumber() + insertionSort.getExchangesNumber();
            int moment2 = binaryInsertionSort.getComparisonNumber() + binaryInsertionSort.getExchangesNumber();

            result[0][i] = moment1;
            result[1][i] = moment2;
        }

        return result;
    }

    private void customizeChartDefault(JFreeChart chart) {
        XYPlot plot = chart.getXYPlot();
        XYDataset ds = plot.getDataset();

        for (int i = 0; i < ds.getSeriesCount(); i++) {
            chart.getXYPlot().getRenderer().setSeriesStroke(i, new BasicStroke(2));
        }

        plot.setBackgroundPaint(Color.WHITE);
        plot.setDomainGridlinePaint(Color.BLACK);
        plot.setRangeGridlinePaint(Color.BLACK);
    }

    public void performanceTestDemo(String[] sortNames, int[] sizes) {
        double[][] result = performanceTest(sizes, sortNames);

        DefaultXYDataset ds = new DefaultXYDataset();
        double[][] data = new double[2][result.length];
        data[0] = Arrays.stream(sizes).asDoubleStream().toArray();
        for (int i = 0; i < result.length; i++) {
            data = data.clone();
            System.out.println(Arrays.toString(result[i]));
            data[1] = result[i];
            ds.addSeries(sortNames[i], data);
        }

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Sort efficiency",
                "Array dimension (number of elements)",
                "Number of comparisons + number of exchanges",
                ds
        );
        customizeChartDefault(chart);

        final int height = frame.getSize().height;
        final int width = frame.getSize().width;

        if (chartPanel == null) {
            chartPanel = new ChartPanel(chart);
            frame.setSize(width, height * 2);
            graphPanel.add(chartPanel, BorderLayout.CENTER);
            graphPanel.updateUI();

        } else {
            chartPanel.setChart(chart);
        }

    }
}