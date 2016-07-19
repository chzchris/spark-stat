import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.mllib.linalg.Vector;
import org.apache.spark.mllib.stat.MultivariateStatisticalSummary;
import org.apache.spark.mllib.stat.Statistics;

public class StatisticSummary {
  private MultivariateStatisticalSummary summary = null;

  public StatisticSummary(JavaSparkContext sc, StatisticData statData) {
    JavaRDD<Vector> mat = sc.parallelize(statData.getSeariesDataList());
    this.summary = Statistics.colStats(mat.rdd());
  }

  public Vector getMean() {
    return this.summary.mean();
  }

  public Vector getVariance() {
    return this.summary.variance();
  }

  public Vector getNumOfNonzeros() {
    return this.summary.numNonzeros();
  }

}
