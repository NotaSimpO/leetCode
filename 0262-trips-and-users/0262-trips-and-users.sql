# Write your MySQL query statement below
select cte.request_at as 'Day',round(sum(cte.counter/cte.ttp),2) as 'Cancellation Rate' from(select 
(case when status = 'completed' then 0
else 1 end) as counter, request_at, count(status) over(partition by request_at) as ttp from Trips where client_id in (select users_id from Users where banned = 'No') and driver_id in (select users_id from Users where banned = 'No')) as cte group by cte.request_at having cte.request_at between '2013-10-01' and '2013-10-03'