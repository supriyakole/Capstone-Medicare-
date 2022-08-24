package com.simplilearn.com.MedicareProject

import org.scalatest.Matchers

class AppTest extends SparkSuite with Matchers {
  sparkTest("Dataframe") { spark =>
    App.generateDataframe(spark).show(1, truncate = false)
  }
}