# SonarQube-TotalCoverage
Example application that gets total test coverage across a multi module Gradle project.

The current issue with a multi module build and sonar is that you don't get credit for
test coverage from one module that runs code in another module.  The goal of this example
project is to combine the coverage from all the modules so you get an overall coverage
from all the tests.

## Getting Started

To build run the following:

        gradle clean build jacocoMerge sonar

This will run the unit tests, merge the coverage files and publish to sonar.

