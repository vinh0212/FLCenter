/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vn.tad_sebs.View;

import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.table.TableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;

/**
 *
 * @author Sebs
 */
public class ClassStat extends javax.swing.JFrame {

    /**
     * Creates new form ClassStat
     */
    public TableModel model;
    private JComboBox<String> chartTypeComboBox;
    private ChartPanel currentChartPanel;

    public ClassStat() {
        initComponents();
        this.setVisible(true);
        pack();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    public void getTable(TableModel model) {
        this.model = model;
    }

    public void action() {
        // Create a new dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Add the distribution to the dataset
        for (int i = 0; i < 10; i++) {
            dataset.addValue((Number) model.getValueAt(i, 1), "Số lượng", i + "-" + (i + 1));
        }

        // Create a chart using the dataset
        JFreeChart chart;
        if (chartTypeComboBox.getSelectedItem().equals("Bar Chart")) {
            chart = ChartFactory.createBarChart("Thống kê điểm số", "Khoảng điểm", "Số lượng", dataset);
        } else {
            chart = ChartFactory.createLineChart("Thống kê điểm số", "Khoảng điểm", "Số lượng", dataset);
        }

        // Set the y-axis to display integers only
        NumberAxis yAxis = (NumberAxis) chart.getCategoryPlot().getRangeAxis();
        yAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // Create a chart panel and add the chart to it
        ChartPanel chartPanel = new ChartPanel(chart);

        // Remove the old chart panel if it exists
        if (currentChartPanel != null) {
            this.remove(currentChartPanel);
        }
        
        this.add(chartPanel, BorderLayout.CENTER);
        currentChartPanel = chartPanel;

        // Refresh the panel
        this.validate();
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE));

        setBounds(0, 0, 414, 307);

        JPanel panel = new JPanel(new BorderLayout());
        chartTypeComboBox = new JComboBox<>(new String[] { "Bar Chart", "Line Chart" });
        chartTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action();
            }
        });
        panel.add(chartTypeComboBox, BorderLayout.NORTH);

        getContentPane().setLayout(new BorderLayout());

        getContentPane().add(panel, BorderLayout.NORTH);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
