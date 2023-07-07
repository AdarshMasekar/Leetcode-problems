select Department,Employee,Salary from
(select d.name as Department ,e.name as Employee,e.salary as Salary ,
dense_rank() over(partition by d.name order by e.salary desc ) as rnk
from employee e left join department d on e.departmentid=d.id) as f
where rnk<=3;
