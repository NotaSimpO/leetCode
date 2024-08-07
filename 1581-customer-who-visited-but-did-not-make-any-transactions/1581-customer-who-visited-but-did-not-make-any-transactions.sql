# Write your MySQL query statement below
Select customer_id , Count(customer_id) as count_no_trans 
From Visits LEFT JOIN Transactions
On Visits.visit_id = Transactions.visit_id 
Where transaction_id  is NULL
Group by customer_id