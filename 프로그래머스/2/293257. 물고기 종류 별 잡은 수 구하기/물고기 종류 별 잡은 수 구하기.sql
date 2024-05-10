-- 코드를 작성해주세요
select Count(*) as FISH_COUNT,  a.FISH_NAME 
from FISH_NAME_INFO as a inner join FISH_INFO as b
on a.FISH_TYPE = b.FISH_TYPE
group by a.FISH_NAME
order by FISH_COUNT desc