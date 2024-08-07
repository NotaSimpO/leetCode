Select contest_id, Round(count(*) / total_user.user_total_count * 100,2) as percentage
From Register
Join (Select Count(DISTINCT user_id) as user_total_count From Users ) as total_user
Group by contest_id
Order by percentage desc, contest_id