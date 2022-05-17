#!/usr/bin/env groovy
package com.demo

 def execute() {
  //Add stages for security pipeline workflow 

   stage('Build') {
     print "Build source code"
   }

   stage('Commit-time SAST') {
      commitTimeSAST 'SpotBugs' //call the vars with or without args
   }
 }
