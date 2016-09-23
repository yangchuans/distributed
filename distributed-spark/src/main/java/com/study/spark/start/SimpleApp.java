package com.study.spark.start;
/* 
 * @auther yangchuan
 * @date 2016-09-12
 */
import org.apache.spark.api.java.*;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.function.Function;
public class SimpleApp {
	public static void main(String[] args) {
	    String logFile = "hdfs://192.168.133.172:9000/ForHadoopTest/insert.log"; 
	    SparkConf conf = new SparkConf().setAppName("Simple Application").setMaster("local");
	    JavaSparkContext sc = new JavaSparkContext(conf);
	    JavaRDD<String> logData = sc.textFile(logFile).cache();
	    long numAs = logData.filter(new Function<String, Boolean>() {
		    private static final long serialVersionUID = 1L;
			public Boolean call(String s) { 
				return s.contains("H");
			}
	    }).count();
	    
	    
	    long numBs = logData.filter(new Function<String, Boolean>() {
			private static final long serialVersionUID = 1L;
			public Boolean call(String s) { 
				return s.contains("F"); 
			}
	    }).count();
    	System.out.println("Lines with H: " + numAs + ", lines with F: " + numBs);
	    sc.close();
	}
}
