import org.apache.spark.api.java.JavaSparkContext;

public class StatisticFactory {
  public static StatisticData generateSeriesData(double[] series) {
    StatisticData statData = generateSeriesData();
    statData.addSeries(series);
    return statData;
  }

  public static StatisticData generateSeriesData() {
    StatisticData statData = new StatisticData();
    return statData;
  }

  public static StatisticSummary getStatisticSummary(JavaSparkContext sc, StatisticData statData) {
    return new StatisticSummary(sc, statData);
  }
}
