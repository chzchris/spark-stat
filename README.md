# Spark Statistics Library

## How to run Spark Statistics on Java
Reference: http://www.robertomarchetto.com/spark_java_maven_example
```
cd /<path to the project root>
<path to spark folder>/bin/spark-submit --class <Class> --master local[2] ./target/<project jar file> /<path to a demo test file> /<path to output directory>
```
* \<path to spark folder\> is the where your Spark SDK directory located
* \<Class\> is the main Java class with the public static void main method. For instance, BasicStatistic
* "--master local[2]" starts the cluster locally using 2 CPU cores
* \<project jar file\> is the built jar file of this project. E.g. spark_stat-1.0-SNAPSHOT.jar
* \<path to a demo test file\>(optional) is a demo local file which contains some words, an example file can be downloaded at https://github.com/melphi/spark-examples/blob/master/first-example/src/test/resources/loremipsum.txt
* \<path to output directory\>(optional) is the directory where the resuls should be saved

Example:
```
~/code/spark-1.6.1-bin-hadoop2.6/bin/spark-submit --class BasicStatistic --master local[2]  ./target/spark_stat-1.0-SNAPSHOT.jar
```
