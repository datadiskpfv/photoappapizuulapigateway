package uk.co.datadisk.photoapp.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class PhotoAppApiZuulApiGatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(PhotoAppApiZuulApiGatewayApplication.class, args);
  }

}
