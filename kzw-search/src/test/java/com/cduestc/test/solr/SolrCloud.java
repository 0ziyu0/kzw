package com.cduestc.test.solr;

import org.apache.solr.client.solrj.impl.CloudSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

public class SolrCloud {


	@Test
	public void testSolrCloud120() throws Exception{

		String zkHost = "120.27.105.77:2191,120.27.105.77:2192,120.27.105.77:2193";
		String collection = "collection2";

		CloudSolrServer server = new CloudSolrServer(zkHost);
		server.setDefaultCollection(collection);
		SolrInputDocument document = new SolrInputDocument();

		document.addField("id", "test_01");
		document.addField("item_title", "thisisfirst");

		server.add(document);
		server.commit();

	}

	@Test
	public void testSolrClout127() throws Exception {
		// 创建一个SolrServer对象
		CloudSolrServer solrServer = new CloudSolrServer("127.27.105.77:2182,127.27.105.77:2183,127.27.105.77:2183");
		// 设置默认的collection
		solrServer.setDefaultCollection("collection1");

		// 创建一个文档对象
		SolrInputDocument document = new SolrInputDocument();
		document.addField("id", "test01");
		document.addField("item_title", "title1");
		// 添加文档
		solrServer.add(document);
		// 提交
		solrServer.commit();

	}


}


















