SELECT Count(*) AS USERS
from USER_INFO
where AGE between 20 and 29 
and Left(JOINED,4)=2021;