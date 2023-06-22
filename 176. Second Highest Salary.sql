SELECT MAX(salary) as SecondHighestSalary
FROM EMPLOYEE
WHERE salary < (SELECT max(salary)
               FROM EMPLOYEE
               ORDER BY salary DESC )
