package com.qbrainx.util

import java.util.Properties

object ConsumerProperties {
  val properties = new Properties()
  properties.put("bootstrap.servers", "localhost:9092");
  properties.put("acks", "all");
  properties.put("retries", 0);
  properties.put("linger.ms", 1);
  properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
  properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
  properties.put("group.id", "test-consumer-group");
  properties.put("enable.auto.commit", "true")
  properties.put("auto.commit.interval.ms", "1000")

}

