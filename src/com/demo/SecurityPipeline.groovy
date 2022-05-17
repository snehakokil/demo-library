#!/usr/bin/env groovy
package com.demo

class SecurityPipeline {
 static void execute() {
  //Add stages for security pipeline workflow 

   stage('Build') {
     print "Build source code"
   }

   stage('Commit-time SAST') {
     CommitTimeSAST //call the vars with or without args 
   }
 }
}
