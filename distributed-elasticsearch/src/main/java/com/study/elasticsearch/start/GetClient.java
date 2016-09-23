package com.study.elasticsearch.start;

import java.net.InetAddress;
import java.util.Date;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.elasticsearch.common.xcontent.XContentFactory;
public class GetClient {
	
	@SuppressWarnings({ "resource", "unused", "unchecked" })
	public static void main(String[] args) {
		Settings settings = Settings.builder()
		        .put("cluster.name", "my-application").build();
		TransportClient client = null;
		try {
			client = new PreBuiltTransportClient(settings)
				        .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300));
			IndexResponse response = client.prepareIndex("twitter", "tweet", "1")
			        .setSource(XContentFactory.jsonBuilder()
			                    .startObject()
			                        .field("user", "kimchy")
			                        .field("postDate", new Date())
			                        .field("message", "trying out Elasticsearch")
			                    .endObject()
			                  )
			        .get();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	
}
