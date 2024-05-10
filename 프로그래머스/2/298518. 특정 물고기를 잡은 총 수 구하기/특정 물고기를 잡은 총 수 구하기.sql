-- 코드를 작성해주세요
select Count(*) as FISH_COUNT
from FISH_NAME_INFO as a inner join FISH_INFO as b
on a.FISH_TYPE = b.FISH_TYPE
where a.FISH_NAME in ('BASS','SNAPPER')