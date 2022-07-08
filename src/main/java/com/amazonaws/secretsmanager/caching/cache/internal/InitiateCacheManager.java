package com.amazonaws.secretsmanager.caching.cache.internal;

//This example shows how an AWS Lambda function can be written
//to retrieve a cached secret from AWS Secrets Manager caching
//client.

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

import com.amazonaws.secretsmanager.caching.SecretCache;

/**
* SampleClass.
*/
public class InitiateCacheManager implements RequestHandler<String, String> {

 private final SecretCache cache = new SecretCache();

 @Override
 public String handleRequest(String secretId, Context context) {
     final String secret = cache.getSecretString(secretId);
     // Use secret to connect to secured resource.
     return "Success!";
 }
}