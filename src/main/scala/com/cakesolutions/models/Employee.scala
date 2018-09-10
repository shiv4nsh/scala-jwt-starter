package com.cakesolutions.models

import argonaut._, Argonaut._

case class Employee(
    name: String,
    email: String
)

object Employee {
  implicit def EmployeeCodecJson: CodecJson[Employee] =
    casecodec2(Employee.apply, Employee.unapply)("name", "email")
}
