-- 코드를 작성해주세요
select sum(SCORE) as SCORE, EMP_NO, EMP_NAME, POSITION, EMAIL
from HR_GRADE join HR_EMPLOYEES using (EMP_NO)
group by EMP_NO
order by SCORE desc
limit 1