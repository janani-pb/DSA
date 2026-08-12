# Write your MySQL query statement below
select e.employee_id from (select * from employees left join salaries using(employee_id) union select * from employees right join salaries using (employee_id)) as e where e.salary is null or e.name is null order by employee_id;






