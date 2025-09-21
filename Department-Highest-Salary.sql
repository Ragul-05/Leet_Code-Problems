# Write your MySQL query statement below
select d.name as department,e.name as employee,e.salary as salary
from employee e
join department d on e.departmentId = d.id
where e.salary = (
    select max(salary)
    from employee
    where departmentId = e.departmentId
)
order by d.name, e.name;

