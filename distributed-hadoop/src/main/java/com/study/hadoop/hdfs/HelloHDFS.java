package com.study.hadoop.hdfs;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class HelloHDFS {
	
	public static void main(String[] args) {
		String uri = "hdfs://192.168.133.172:9000/";  
        Configuration config = null;
        FileSystem fs = null;
        FileStatus[] statuses = null;
        FSDataOutputStream os = null;
        InputStream is = null;
		try {
			config = new Configuration();
			fs = FileSystem.get(URI.create(uri), config);
			statuses = fs.listStatus(new Path("/"));
			os = fs.create(new Path("/ForHadoopTest/insert.log"));
			os.write("写入分布式文件系统HDFS".getBytes());
			os.flush();
			os.close(); 
			is = fs.open(new Path("/ForHadoopTest/insert.log"));
			IOUtils.copyBytes(is, System.out, 1024, true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  
        for (FileStatus status : statuses) {  
            System.out.println(status);  
        }  
	}

}
