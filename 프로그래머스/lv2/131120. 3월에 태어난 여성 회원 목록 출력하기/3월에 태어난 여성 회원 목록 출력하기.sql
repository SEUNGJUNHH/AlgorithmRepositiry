-- 코드를 입력하세요
SELECT MEMBER_ID,MEMBER_NAME,GENDER,DATE_FORMAT(DATE_OF_BIRTH,'%Y-%m-%d')
FROM MEMBER_PROFILE
WHERE TLNO != 'NULL' and GENDER ='W' and DATE_FORMAT(DATE_OF_BIRTH,'%m') =3
ORDER BY MEMBER_ID