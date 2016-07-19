import java.util.ArrayList;
import java.util.List;

import org.apache.spark.mllib.linalg.Vector;
import org.apache.spark.mllib.linalg.Vectors;

public class StatisticData {
  private List<Vector> seriesDataList = null;
  public StatisticData() {
    seriesDataList = new ArrayList<Vector>();
  }

  public void addSeries(double[] series) {
    seriesDataList.add(Vectors.dense(series));
  }

  public List<Vector> getSeariesDataList() {
    return seriesDataList;
  }
}
