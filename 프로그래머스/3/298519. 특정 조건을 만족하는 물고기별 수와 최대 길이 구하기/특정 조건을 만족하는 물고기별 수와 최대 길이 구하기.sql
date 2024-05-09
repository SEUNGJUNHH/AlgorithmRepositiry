-- 코드를 작성해주세요
select  Count(FISH_TYPE) as FISH_COUNT , MAX(LENGTH) as MAX_LENGTH , FISH_TYPE
from FISH_INFO
group by FISH_TYPE
having AVG(IFNULL(LENGTH,10)) >=33
order by FISH_TYPE asc