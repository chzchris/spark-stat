import java.util.HashMap;
import java.util.Map;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class ContextFactory {

  public static JavaSparkContext getSparkContext(Map<String, String> params) throws Exception{
    try {
      SparkConf conf = new SparkConf().setAppName(params.get("appName"));
      JavaSparkContext sc = new JavaSparkContext(conf);
      return sc;
    }catch(Exception ex) {
      throw ex;
    }
  }

  public static JavaSparkContext getSparkContextWithAppName(String appName) throws Exception{
    try {
      Map<String, String> params = new HashMap<String, String>();
      params.put("appName", appName);
      JavaSparkContext sc = ContextFactory.getSparkContext(params);

      return sc;
    }catch(Exception ex) {
      throw ex;
    }
  } 
}
