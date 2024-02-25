SELECT DISTINCT num AS ConsecutiveNums
FROM (
    SELECT num, LEAD(num) OVER() AS leads, LAG(num) OVER() AS lags
    FROM logs
    ) AS Tablename
WHERE num = leads AND num = lags
