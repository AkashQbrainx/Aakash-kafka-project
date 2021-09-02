package com.qbrainx.Main
import com.qbrainx.util.ConsumerProperties.properties
import org.apache.kafka.clients.consumer.KafkaConsumer
import java.util.Collections
import scala.jdk.CollectionConverters.IterableHasAsScala

object ConsumerApp extends App {
  val consumer: KafkaConsumer[String, String] = new KafkaConsumer[String, String](properties)
  val topic="kafka-topic-2"
  consumer.subscribe(Collections.singleton(topic))
  println(s"Receiving  Records from Kafka Topic [$topic]")

 while(true){
    val records = consumer.poll(10)
    for (record <- records.asScala) {
      println(record.value())
    }
  }

}
