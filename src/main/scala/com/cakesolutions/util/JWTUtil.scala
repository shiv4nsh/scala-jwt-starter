package com.cakesolutions.util

import com.nimbusds.jose.crypto.MACSigner
import com.nimbusds.jose.{JWSAlgorithm, JWSHeader, JWSObject, Payload}

trait JWTUtil {

  def createTokenFromPayload(payload: String, sharedKey: String) = {
    val jwsObject =
      new JWSObject(new JWSHeader(JWSAlgorithm.HS256), new Payload(payload))
    jwsObject.sign(new MACSigner(sharedKey))
    jwsObject.serialize
  }

}
