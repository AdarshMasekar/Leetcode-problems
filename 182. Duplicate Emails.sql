select distinct email
from person
group by email
having count(*)> 1;
