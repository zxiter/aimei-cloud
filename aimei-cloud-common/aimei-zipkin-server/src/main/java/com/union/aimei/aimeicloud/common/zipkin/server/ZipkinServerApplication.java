package com.union.aimei.aimeicloud.common.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinStreamServer
public class ZipkinServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(ZipkinServerApplication.class, args);
  }
}
