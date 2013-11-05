package com.info.aers.main

import org.scalatest.FunSuite
 
class MainTest extends FunSuite {
 
  test("world is greeted properly") {
    assert(Hello.sayHello === "Hello World!")
  }

}
