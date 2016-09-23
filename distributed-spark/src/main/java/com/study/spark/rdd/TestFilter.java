package com.study.spark.rdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function;


public class TestFilter {
	
	public static void main(String[] args) {
		SparkConf conf = new SparkConf().setAppName("Filter").setMaster("local");
	    JavaSparkContext sc = new JavaSparkContext(conf);
	    countWords(sc);
	}
	/**
	 * 统计单词个数
	 */
	public static void countWords(JavaSparkContext sc){
		List<String> strLine=new ArrayList<String>();
		strLine.add("how are you");
		strLine.add("I am ok");
		strLine.add("do you love me");
		JavaRDD<String> input=sc.parallelize(strLine);
		JavaRDD<String> words=input.flatMap(
		        new FlatMapFunction<String, String>() {
		            public Iterator<String> call(String s) throws Exception {
		                return Arrays.asList(s.split(" ")).iterator();
		            }
		        }
				
		);
		for(String r : words.collect()){
			System.out.println(r);
		}
	}
	/**
	 * 过滤List
	 * @param sc
	 */
	public static void filtList(JavaSparkContext sc){
		List<String> all  = new ArrayList<String>();
		all.add("error");
		all.add("succes");
		all.add("error");
		all.add("succes");
		all.add("error");
		JavaRDD<String> rdd  = sc.parallelize(all);
		JavaRDD<String> rst =rdd.filter(
			new Function<String ,Boolean>(){
				private static final long serialVersionUID = 1L;
				public Boolean call(String input){
					return input.contains("error");
				}
			}
				
		);
		for(String r : rst.collect()){
			System.out.println(r);
		}
	}

}
