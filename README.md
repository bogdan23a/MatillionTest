# Matillion Test
Project done in IntelliJ IDEA for solving the Matillion Tech Test Challenge.

## Introduction

The challenge involves solving the following problems:

### Test 1

In this scenario, there are two strings of equal length, however between them there are a number of
differences. Compare the two strings and return the number of differences in characters between the two.

#### Example:
```
D23W8MCCIZQOP9
D236862CEZQOPS
```
In this case the number of differences between the two strings is 5.
To summarize: Write a method to compare the number of character-based differences between two given
strings. The method should return a single number, denoting the number of differences.

### Test 2

For this test you can access an already established MySQL database. This has three tables, populated with
Data.
The connection details you need are

```
Hostname: mysql-technical-test.cq5i4y35n9gg.eu-west-1.rds.amazonaws.com
Username: technical_test
Password: HopefullyProspectiveDevsDontBreakMe
Database: foodmart
```
Write a command line Java program that allows the user to specify a department, pay type and education
level, and then connects to the shared database and runs the query with those options. The program should
then display the results of the query.
To connect to the database you should use a connector jar such as the one
located [here](http://mvnrepository.com/artifact/mysql/mysql-connector-java/5.1.21).

## Getting Started

These instructions will get you a copy of the project up and how to execute the project.

### Prerequisites

In order to run this project you need either an IDE or just to install Maven on your machine.
```sudo apt-get install mvn
# if that does not work, try
sudo apt-get install maven
```
Also, you need a copy of the [MySQL Java Connector](http://mvnrepository.com/artifact/mysql/mysql-connector-java/5.1.21) on your machine.

### Cloning

Use
```
git clone https://github.com/bogdan23a/MatillionTest.git
```
to get a copy of the project.

### IDE Setup

In order to run the project from an IDE you need to edit the already existing run configurations and add the classpath to use the 'test1' module. And do the same for running the tests.

### Running from the command line

From the root folder of the project use
```
mvn compile
```
to run the project

On my machine, I run it with the following command:
```
java -cp [PATH_TO_MYSQL_JAVA_CONNECTOR_JAR_FILE]:./target/classes Main
java -cp /home/bogdan/Downloads/mysql-connector-java-5.1.21.jar:./target/classes Main
``` 

### Testing

I've written tests using JUnit4 only for the first task as writting tests for the second would imply testing the Database which is not needed.

Use 
```
mvn clean test
```
to run the tests.

## Sample I/O

Test 1:
```
Choose exercise (1/2):
1
TEST 1

Provide 2 strings to compare
First String:
D23W8MCCIZQOP9

Second String:
D236862CEZQOPS
5

```

Test 2:
```
Choose exercise (1/2):
2
TEST 2

Provide the department:
HQ General Management

Provide the pay type:
Monthly

Provide the education level:
Graduate Degree
```
| full_name       |   position_title   | department_description | birth_date | hire_date             | end_date | salary     | pay_type | education_level |
|-----------------|:------------------:|-----------------------:|------------|-----------------------|----------|------------|----------|-----------------|
| Sheri Nowmer    | President          | HQ General Management  | 1961-08-26 | 1994-12-01 00:00:00.0 | null     | 80000.0000 | Monthly  | Graduate Degree |
| Derrick Whelply	 | VP Country Manager |  HQ General Management | 1915-07-03 | 1994-12-01 00:00:00.0 | null     | 40000.0000 | Monthly  | Graduate Degree |
| Michael Spence  | VP Country Manager | HQ General Management  | 1969-06-20 | 1998-01-01 00:00:00.0 | null     | 40000.0000 | Monthly  | Graduate Degree |


## Index

### Test 2 Info:

The foodmart database has 3 tables:

* department
  
| department_id  |   department_description   |
|----------------|----------------------------|
|        1       |   HQ General Management    |
|        2       |   HQ Information Systems   |
|        3       |         HQ Marketing       |
|        4       |     HQ Human Resources     |
... 
|        19      |  Store Permanent Butchers  | 

* employees

| employee_id |    full_name    | first_name | last_name | position_id | position_title     | store_id | department_id | birth_date | hire_date             | end_date | salary     | supervisor_id | education_level | marital_status | gender | management_role   |
|-------------|:---------------:|-----------:|-----------|-------------|--------------------|----------|---------------|------------|-----------------------|----------|------------|---------------|-----------------|----------------|--------|-------------------|
| 1           | Sheri Nowmer    | Sheri      | Nowmer    | 1           | President          | 0        | 1             | 1961-08-26 | 1994-12-01 00:00:00.0 | null     | 80000.0000 | 0             | Graduate Degree | S              | F      | Senior Management |
...
| 2           | Derrick Whelply |    Derrick | Whelply   | 2           | VP Country Manager | 0        | 1             | 1915-07-03 | 1994-12-01 00:00:00.1 | null     | 40000.0000 | 1             | Graduate Degree | M              | M      | Senior Management |


* position

| position_id  |    position_title    | pay_type  |   min_scale  |  max_scale   |   management_role   |
|--------------|----------------------|-----------|--------------|--------------|---------------------|
|       1      |       President      |  Monthly  |  25000.0000  |  85000.0000  |  Senior Management  |
...
|       2      |  VP Country Manager  |  Monthly  |  20000.0000  |  40000.0000  |  Senior Management  |

