# Write your MySQL query statement below
SELECT employee_id, salary as 'bonus'
FROM Employees
WHERE employee_id MOD 2 = 1 AND NOT LEFT (name, 1) = 'M'
UNION
SELECT employee_id, 0 as 'bonus'
FROM Employees
WHERE employee_id MOD 2 = 0 OR LEFT (name, 1) = 'M'
ORDER BY employee_id