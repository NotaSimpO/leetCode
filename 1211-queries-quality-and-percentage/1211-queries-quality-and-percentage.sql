# Write your MySQL query statement below
Select q1.query_name, Round(AVG(q2.rating/q1.position),2) as quality, round(sum(q1.rating < 3)/count(*)*100,2) as poor_query_percentage
From Queries q1 Join Queries q2
On q1.query_name = q2.query_name and q1.result = q2.result
Group by q1.query_name