-- 코드를 입력하세요
SELECT b.BOOK_ID,a.AUTHOR_NAME,DATE_FORMAT(PUBLISHED_DATE,"%Y-%m-%d") as PUBLISHED_DATE
FROM book b INNER JOIN author a  on a.AUTHOR_ID = b.AUTHOR_ID
where b.CATEGORY = '경제'

order by 3;