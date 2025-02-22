# Write your MySQL query statement below
/*select x,y,z,
case when x+y>z and y+z>x and x+z>y then "Yes" else "No" end as triangle from triangle*/

select *, if(x+y>z and y+z>x and z+x>y, "Yes", "No") as triangle FROM Triangle