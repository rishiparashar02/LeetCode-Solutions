# Write your MySQL query statement below
SELECT d.name as Department, e.name as Employee, e.salary as Salary
FROM Employee e
JOIN Department d ON e.departmentId = d.id
WHERE (
    SELECT COUNT(DISTINCT salary)
    FROM Employee e2
    WHERE e2.departmentId = e.departmentId AND e2.salary >= e.salary
) <= 3
ORDER BY d.name, e.salary DESC;
