package cn.pomxl.springbootelastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot默认支持俩中方式跟es进行交互
 * 1、Jest（默认不生效缺少相应的包）(io.searchbox.client.JestClient)
 * 2、springDate Elasticsearch
 *   1)client节点信息clustnodes;clusterName
 *   2)ElashsearchTemplate才做es
 *   3)编写一个ElasticsearchRepository的子接口进行较好相当于jdbc
 */
@SpringBootApplication
public class SpringbootelasticApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootelasticApplication.class, args);
    }
}
