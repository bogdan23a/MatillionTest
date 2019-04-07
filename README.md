# MatillionTest
Project for solving the matillion tech test challenge

## Test 1

In this scenario, there are two strings of equal length, however between them there are a number of
differences. Compare the two strings and return the number of differences in characters between the two.

### Example:
```
D23W8MCCIZQOP9
D236862CEZQOPS
```
In this case the number of differences between the two strings is 5.
To summarize: Write a method to compare the number of character-based differences between two given
strings. The method should return a single number, denoting the number of differences.

## Test 2

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
located here: http://mvnrepository.com/artifact/mysql/mysql-connector-java/5.1.21

The <foodmart> database has 3 tables:

1. department
  
| department_id  |   department_description   |
|----------------|----------------------------|
|        1       |   HQ General Management    |
|        2       |   HQ Information Systems   |
|        3       |         HQ Marketing       |
|        4       |     HQ Human Resources     |
... 
|        19      |  Store Permanent Butchers  | 

2. employees

| employee_id |    full_name    | first_name | last_name | position_id | position_title     | store_id | department_id | birth_date | hire_date             | end_date | salary     | supervisor_id | education_level | marital_status | gender | management_role   |
|-------------|:---------------:|-----------:|-----------|-------------|--------------------|----------|---------------|------------|-----------------------|----------|------------|---------------|-----------------|----------------|--------|-------------------|
| 1           | Sheri Nowmer    | Sheri      | Nowmer    | 1           | President          | 0        | 1             | 1961-08-26 | 1994-12-01 00:00:00.0 | null     | 80000.0000 | 0             | Graduate Degree | S              | F      | Senior Management |
...
| 2           | Derrick Whelply |    Derrick | Whelply   | 2           | VP Country Manager | 0        | 1             | 1915-07-03 | 1994-12-01 00:00:00.1 | null     | 40000.0000 | 1             | Graduate Degree | M              | M      | Senior Management |


3. position

| position_id  |    position_title    | pay_type  |   min_scale  |  max_scale   |   management_role   |
|--------------|----------------------|-----------|--------------|--------------|---------------------|
|       1      |       President      |  Monthly  |  25000.0000  |  85000.0000  |  Senior Management  |
...
|       2      |  VP Country Manager  |  Monthly  |  20000.0000  |  40000.0000  |  Senior Management  |

