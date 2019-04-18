# Simple Batch Job Starter Codebase
Using Spring Boot, Java, Gradle, JUnit 5, and Mockito.

## Overview
Spring Boot has a simple facility for job scheduling that accepts cron expressions. That makes it very easy to create 
simple servers which periodically execute code and then go to sleep until the next time.

This small codebase demonstrates how to use annotations to schedule executing code, and also how to organize code for
easy testing. 

In particular, doing full DI injection along with Mockito didn't work out tonight, so the current policy in this 
codebase is to only do implicit Spring DI in the main Application class, and then to use explicit DI (in other words,
pass all dependencies explicitly in the constructor) in the Job classes which will make them much easier to test 
with mocks.
