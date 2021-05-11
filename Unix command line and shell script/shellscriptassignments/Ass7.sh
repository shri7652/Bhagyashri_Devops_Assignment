#!/bin/bash

first=1
second=2
third=3


#Add two numbers
sum=$(($first + $second))
echo "Sum of first two no is " $sum

#Add two numbers and multiply by third 
Multiple=$(($sum * $third))
echo "sum of two no and multiplying it by third ans is " $Multiple

grp=expr $first + $second \* $third 
echo $grp

