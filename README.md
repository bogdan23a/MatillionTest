# MatillionTest
Project for solving the matillion tech test challenge

Test 1:

Test 2:

The <<foodmart>> database has 3 tables:

1. department
  
| department_id  |   department_description   |
|----------------|----------------------------|
|       :1:      |  :HQ General Management:   |
|       :2:      |  :HQ Information Systems:  |
|       :3:      |        :HQ Marketing:      |
|       :4:      |    :HQ Human Resources:    |
...
|       :19:     | :Store Permanent Butchers: | 

2. employees

| employee_id  |    full_name   | first_name | last_name | position_id | position_title | store_id | department_id |   birth_date  |       hire_date        | end_date |    salary    | supervisor_id |  education_level  | marital_status | gender | management_role     | 
|      :1:     | :Sheri Nowmer: |  :Sheri:   | :Nowmer:  |     :1:     |  :President:   |    :0:   |       :1:     |     :1961-08-26:      | :1994-12-01 00:00:00.0:|   :null: | :80000.0000: |      :0:      | :Graduate Degree: |       :S:      |   :F:  | :Senior Management: |
...

3. position

| position_id  |    position_title    | pay_type  |   min_scale  |  max_scale   |   management_role   |
|      :1:     |      :President:     | :Monthly: | :25000.0000: | :85000.0000: | :Senior Management: |
|      :2:     | :VP Country Manager: | :Monthly: | :20000.0000: | :40000.0000: | :Senior Management: |
...
