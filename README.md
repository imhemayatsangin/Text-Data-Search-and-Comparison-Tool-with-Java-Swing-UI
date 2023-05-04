# Text-Data-Search-and-Comparison-Tool-with-Java-Swing-UI
The goal of this project is to develop a text data search and comparison tool using Java that allows users to search for given words in a large text data set and compare the performance of five different search methods. The tool will also have a graphical user interface (GUI) implemented using Java Swing.


# To add the JFreeChart library to your Java program, you can follow these steps:

Download the JFreeChart library from the official website: https://www.jfree.org/jfreechart/download.html

Extract the downloaded archive file to a directory of your choice.

Add the JAR files to your Java project:

a. In Eclipse:
i. Right-click on your project in the Package Explorer and select Properties.
ii. Click on Java Build Path, then on the Libraries tab.
iii. Click on Add External JARs... and navigate to the directory where you extracted the JFreeChart library.
iv. Select the JAR files you want to add and click OK.
v. Click Apply and Close to save the changes.

b. In IntelliJ IDEA:
i. Open your project.
ii. Go to File > Project Structure.
iii. Click on Modules.
iv. Click on the Dependencies tab.
v. Click on the plus icon and select JARs or directories.
vi. Navigate to the directory where you extracted the JFreeChart library.
vii. Select the JAR files you want to add and click OK.
viii. Click Apply and OK to save the changes.

Import the JFreeChart classes in your Java code:

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

You can now use the JFreeChart library in your Java program to create and display charts.
