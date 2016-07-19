import org.apache.spark.api.java.JavaSparkContext;

public class BasicStatistic {
  public static void main(String[] args) {

    try {
      JavaSparkContext sc = ContextFactory.getSparkContextWithAppName("Basic Statistic");
      StatisticData statData = StatisticFactory.generateSeriesData();
      statData.addSeries(new double[]{1.0, 0.0, 3.0});
      statData.addSeries(new double[]{2.0, 1.0, 6.0});
      statData.addSeries(new double[]{3.0, 0.0, 8.0});
      StatisticSummary summary = StatisticFactory.getStatisticSummary(sc, statData);

      System.out.println("----------------------------Basic Statistic Result----------------------------");
      System.out.println();
      System.out.println("mean value = " + summary.getMean());
      System.out.println("column-wise variance = " + summary.getVariance());
      System.out.println("number of nonzeros in each column = " + summary.getNumOfNonzeros());
      System.out.println();
      System.out.println("------------------------------------------------------------------------------");

      sc.close();
    }catch(Exception ex){
      System.out.println(ex);
    }
  }
}
