import java.util.ArrayList;
import java.util.List;

import org.apache.spark.api.java.JavaDoubleRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.mllib.stat.Statistics;

public class Correlation {
  public static void main(String[] args) {

    try {

      JavaSparkContext sc = ContextFactory.getSparkContextWithAppName("Correlation");
      List<Double> series1 = new ArrayList<Double>();
      series1.add(1.3);
      series1.add(21.0);
      series1.add(13.23);
      series1.add(4.0);

      List<Double> series2 = new ArrayList<Double>();
      series2.add(4.0);
      series2.add(13.23);
      series2.add(21.0);
      series2.add(1.3);

      JavaDoubleRDD seriesX = sc.parallelizeDoubles(series1);
      JavaDoubleRDD seriesY = sc.parallelizeDoubles(series2);
      Double correlation = Statistics.corr(seriesX.srdd(), seriesY.srdd(), "pearson");

      System.out.println("Series X:" + series1);
      System.out.println("Series Y:" + series2);
      System.out.println("Pearson correlation result:" + correlation);
      sc.close();

    } catch (Exception ex){
      System.out.println(ex);
    }

  }
}
