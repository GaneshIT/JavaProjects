


Employee

name=xyz

name=abc

begin tran

try
begin
    select @name=name from Employee where name='';

    update Employee set name='abc' where name='xyz'

end
catch
    rollback
end tran


{1,3,4,4, 7,6,7,7}


int[] arr={1,3,4,4, 7,6,7,7};


777  . Count 3
6    1
44  2
3  1
1 1

Dictionary<int,int> result=Dictionary<int,int>()


 var output=(from result in arr
 group by result
 order by result desc).ToList().Top(1)










