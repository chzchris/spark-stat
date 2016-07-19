# Spark Statistics Library

## How to run Java application on Spark
Reference: http://www.robertomarchetto.com/spark_java_maven_example
```
cd /<path to the project root>
./bin/spark-submit --class org.sparkexample.WordCount --master local[2] /<path to maven project>/target/spark-examples-1.0-SNAPSHOT.jar /<path to a demo test file> /<path to output directory>
```
* "--class org.sparkexample.WordCount" is the main Java class with the public static void main method
* "--master local[2]" starts the cluster locally using 2 CPU cores
* \<path to maven project\> is the path to our maven project
* \<path to a demo test file\> is a demo local file which contains some words, an example file can be downloaded at https://github.com/melphi/spark-examples/blob/master/first-example/src/test/resources/loremipsum.txt
* \<path to output directory\> is the directory where the resuls should be saved
