# Write your MySQL query statement below
Select w1.id
From Weather as w1 ,Weather as w2
Where DATEDIFF(w1.recordDate, w2.recordDate) = 1 and w1.temperature > w2.temperature