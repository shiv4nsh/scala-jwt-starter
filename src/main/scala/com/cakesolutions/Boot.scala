package com.cakesolutions

import com.cakesolutions.models.Employee
import com.cakesolutions.util.JWTUtil
import argonaut._, Argonaut._

object Boot extends App with JWTUtil {

  val employeeShiv = Employee("shivansh", "shivansh@cakesolutions.net")

  val shared256Key =
    "7182F9BBD4FFA3DC57BAE43DC6F587182F9BBD4FFA3DC57BAE43DC6F58HSJDFG"
  val jsonShivGenerated = employeeShiv.asJson.toString()
  val signedJWTGenerated =
    createTokenFromPayload(jsonShivGenerated, shared256Key)

  println(s"Signed JWT: $signedJWTGenerated")

}
