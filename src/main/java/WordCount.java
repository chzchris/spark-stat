import org.apache.spark.api.java.*;
import org.apache.spark.api.java.function.Function;

public class WordCount {
  public static void main(String[] args) {
    String logFile = "./README.md"; // Should be some file on your system

    try{

      JavaSparkContext sc = ContextFactory.getSparkContextWithAppName("Word Count Application");

      JavaRDD<String> logData = sc.textFile(logFile).cache();

      long numAs = logData.filter(new Function<String, Boolean>() {
        public Boolean call(String s) { return s.contains("a"); }
      }).count();

      long numBs = logData.filter(new Function<String, Boolean>() {
        public Boolean call(String s) { return s.contains("b"); }
      }).count();

      System.out.println("Lines with a: " + numAs + ", lines with b: " + numBs);
      sc.close();
    }catch(Exception ex){
      System.out.println(ex);
    }
  }
}
