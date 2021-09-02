package com.qbrainx.Main

import com.qbrainx.util.ProducerProperties.properties
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

import scala.annotation.tailrec
import scala.io.StdIn

object producerApp extends App {

  val producer: KafkaProducer[String, String] = new KafkaProducer[String, String](properties)
  val topic = "kafka-topic-2"
  println(s"Sending Records in Kafka Topic [$topic]")

  @tailrec
  def read(input:Int): Any ={
    val msg = StdIn.readLine()
    val record: ProducerRecord[String, String] = new ProducerRecord(topic,s"$input",msg)
    producer.send(record)
    read(input+1)
  }
  read(0)


}
