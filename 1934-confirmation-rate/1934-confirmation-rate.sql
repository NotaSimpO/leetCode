WITH Confirmed AS (
    SELECT DISTINCT Signups.user_id, count(*) as confirmed, 0 as timeout
    FROM Signups LEFT JOIN Confirmations ON Signups.user_id = Confirmations.user_id
    WHERE action = "confirmed"
    GROUP BY user_id
), Timeout AS (
    SELECT DISTINCT Signups.user_id,0 as confirmed, count(*) as timeout
    FROM Signups LEFT JOIN Confirmations ON Signups.user_id = Confirmations.user_id
    WHERE action = "timeout" OR action IS null
    GROUP BY user_id
), Calc AS (
    SELECT user_id, SUM(confirmed) as confirmed, 
    SUM(timeout) as timeout, 
    SUM(confirmed + timeout) as action_sum
    FROM (
        SELECT * FROM Confirmed
        UNION 
        SELECT * FROM TIMEOUT
    ) as Temp
    GROUP BY user_id
)

SELECT user_id, ROUND(confirmed * 1.0 / action_sum, 2) AS confirmation_rate FROM Calc