-- 코드를 입력하세요
SELECT a.NAME, a.DATETIME 
from ANIMAL_INS as a
where not exists (
    select b.NAME
    from ANIMAL_OUTS as b
    where a.ANIMAL_ID = b.ANIMAL_ID
)
order by a.DATETIME
limit 3;